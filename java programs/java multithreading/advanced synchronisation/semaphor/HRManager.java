import java.util.concurrent.Semaphore ;

public class HRManager {

	public static void main(String[] args) {
		Semaphore questionPaperPool = new Semaphore(2) ;

		TechLead tl1 = new TechLead(questionPaperPool , "Amit") ;
		TechLead tl2 = new TechLead(questionPaperPool , "Sachin") ;
		TechLead tl3 = new TechLead(questionPaperPool , "manish") ;
		TechLead tl4 = new TechLead(questionPaperPool , "Gaurav") ;

        tl1.start() ;
        tl2.start() ;
        tl3.start() ;
        tl4.start() ;

        System.out.println("No work for HR manager ... ") ;
	}
} 


// The Hr manager above creates 4 techleads and quits 


class TechLead extends Thread{
	Semaphore questionPaperPool ;
	public TechLead ( Semaphore questionPaperPool , String name ){
		super(name) ;
		this.questionPaperPool = questionPaperPool ;
	}

	@Override
	public void run(){

		try{
		System.out.println(Thread.currentThread().getName() + " waiting for questionpaper") ;

		// acquiring one question paper

		questionPaperPool.acquire() ;

        System.out.println(Thread.currentThread().getName() + " acquired test paper .") ;
        System.out.println(Thread.currentThread().getName() + " conducting test") ;
		System.out.println(Thread.currentThread().getName() + " Test done , giving back questionpaper ") ;

        // giving back acquired question paper

        questionPaperPool.release() ;
		}
		catch(Exception e){
			e.printStackTrace() ;
		}
		

	}
}
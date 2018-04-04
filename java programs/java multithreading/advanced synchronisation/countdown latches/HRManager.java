import java.util.concurrent.CountDownLatch ;

class TechLead extends Thread
{
 CountDownLatch cl ;
 
 TechLead(CountDownLatch cl , String s)
 {
  super(s) ;
  this.cl = cl ;
 }
  
 public void run()
  {
   try{
    Thread.sleep(2000) ;
   }
   catch(Exception e ){}
   
   System.out.println(Thread.currentThread().getName() + " " + "recruited") ;
   cl.countDown() ;    
  
   
   try{
    Thread.sleep(3000) ;
   }
   catch(Exception e ){}
   
    System.out.println(Thread.currentThread().getName() + "  dead..") ;
  }
}

class HRManager
{

 public static void main(String... s)
{
 CountDownLatch cl = new CountDownLatch(3) ;
 new TechLead(cl , "ironman").start() ;
 new TechLead(cl , "batman").start() ;
 new TechLead(cl , "superman").start() ;

 try{
   System.out.println("HR manager waiting for all recruitment ..." ) ;
   cl.await() ;  
   System.out.println("HR manager distributed offer letters ..." ) ;   
  }
 catch(Exception e){}
}

}
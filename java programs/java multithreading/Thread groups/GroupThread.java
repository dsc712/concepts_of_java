class Thread1 implements Runnable{
	public void run(){
		for(int i = 0 ; i <= 15 ; i++ ){
			System.out.println(Thread.currentThread().getName()) ;

			try{
				Thread.sleep(1000) ;
			}
			catch(Exception e){

			}
		}
	}
}

class GroupThread{
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("rr") ;
		Thread1 t1  = new Thread1() ;
         
        Thread t2 = new Thread(tg , t1 , "thread1") ;
        Thread t3 = new Thread(tg , t1 , "thread2") ;
        Thread t4 = new Thread(tg , t1 , "thread3") ;

        t2.start() ;
        t3.start() ;
        t4.start() ;

        try{
        	Thread.sleep(5000) ;
        }
        catch(Exception e){

        }
        System.out.println(Thread.currentThread().getName()) ;
        tg.stop() ; // RAJNIKANTH KI GOLI -  ek goli se teen maut 
	}
}
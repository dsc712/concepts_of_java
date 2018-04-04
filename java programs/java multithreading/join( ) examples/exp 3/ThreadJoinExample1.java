
// this example demonstrates how we can set the order of execution of threads . Here first four thread's order of execution has been
// set while other 4 threads are running simultaneously . 


import java.util.Date ;

class RunnableJob implements Runnable{

	public void run(){
		 Thread thread = Thread.currentThread() ;
		 System.out.println("RunnableJob is being run by " + Thread.currentThread().getName() + " at " + new Date() ) ; 

		 try{
		 	Thread.sleep(1000) ;
		 }
		 catch(InterruptedException e){
            e.printStackTrace() ;
		 }
	}
}

public class ThreadJoinExample1 {
	public static void main(String... args){
		RunnableJob runnableJob = new RunnableJob() ;


		Thread thread1 = new Thread(runnableJob , "t1") ;
		Thread thread2 = new Thread(runnableJob , "t2") ;
		Thread thread3 = new Thread(runnableJob , "t3") ;
		Thread thread4 = new Thread(runnableJob , "t4") ;

       // thread t1 , t2 , t3 , t4 will run in 1 second gap and will run in the order t1>t2>t3>t4 due to join() method call , because of 
       // which main thread will wait for the death of these threads .

       try{
       	thread1.start() ;
		thread1.join() ;
        thread2.start() ;
        thread2.join() ;
        thread3.start() ;
        thread3.join() ;
        thread4.start() ;
        thread4.join() ;
        }
        catch(InterruptedException e){
        	System.out.println(e) ;
        }
		
        Thread thread5 = new Thread(runnableJob , "t5") ;
		Thread thread6 = new Thread(runnableJob , "t6") ;
		Thread thread7 = new Thread(runnableJob , "t7") ;
		Thread thread8 = new Thread(runnableJob , "t8") ;

        // threads t5 , t6 , t7 and t8 will run simultaneously as there is no join() method invoked , due to which no thread will wait for any 
        // other thread as soon as they sleep the other thread will get immediate chance to run itself .And there order will also vary due to 
        // random sampling .

		thread5.start() ;
		thread6.start() ;
		thread7.start() ;
		thread8.start() ;

	}
}
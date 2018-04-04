/* 
  yield() method makes the currently running thread head back to runnable pool to allow other threads to 
  get their turn . A thread can be moved out of the virtual cpu by yielding . A thread that has yielded 
  goes into the ready state . The yield is a static method of the Thread class . It always causes the 
  currently executing thread to yield .
  

  Use of yield method:

	1 . Whenever a thread calls java.lang.Thread.yield method, it gives hint to the thread scheduler that it is 
	ready to pause its execution. Thread scheduler is free to ignore this hint.

	2. If any thread executes yield method , thread scheduler checks if there is any thread with same or high 
	priority than this thread. If processor finds any thread with higher or same priority then it will 
	move the current thread to Ready/Runnable state and give processor to other thread and if not – current
	 thread will keep executing.

  */

class MyThread extends Thread{
   public void run(){
   	 for(int i = 0 ; i<= 10 ; i++)
   	  {
   	  	System.out.println(" counting : " + i) ;
   	  }
   }
}

public class YieldEx{
	public static void main(String[] args) {
		MyThread ct = new MyThread() ;

		ct.start() ;
		Thread.yield() ;
		System.out.println("main") ;
	}

}

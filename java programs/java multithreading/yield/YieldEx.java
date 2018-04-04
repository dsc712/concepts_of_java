/* 
  yield() method makes the currently running thread head back to runnable pool to allow other threads to 
  get their turn . A thread can be moved out of the virtual cpu by yielding . A thread that has yielded 
  goes into the ready state . The yield is a static method of the Thread class . It always causes the 
  currently executing thread to yield .
  
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

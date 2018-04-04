/* cyclic barriers are useful in programs involving a fixed size party of threads that must ocassionally wait for each other . The barrier
is called cyclic because it can be reused after the waiting threads are released */

import java.util.concurrent.CyclicBarrier ;

class TechLead extends Thread
{
 CyclicBarrier cb ;

  TechLead(CyclicBarrier cb , String s )
  {
    super(s) ;
    this.cb = cb ;  
   }

 public void run()
  {
    try{
     Thread.sleep(3000) ;
     System.out.println(Thread.currentThread().getName()+ " recruied developers.") ;
     System.out.println(Thread.currentThread().getName()+ " waiting for others .") ;
     
     // all techleads will wait here for each other . It is different from countdown latch in the fact that , in countdown latches a master 
      // thread usually  main thread used to wait for worker threads but here all threads wait for each other .
     cb.await() ;

     System.out.println("all finished recruiting " + Thread.currentThread().getName() + "gives offer letters to candidates") ;

      }
    catch(Exception e){}   
    }
 
}

class HRManager
{
 public static void main(String... s)
 {
  CyclicBarrier cb  = new CyclicBarrier(3) ;
  
  new TechLead(cb , "ironman").start() ;
  new TechLead(cb , "batman").start() ;
  new TechLead(cb , "superman").start() ;
  
  System.out.println("HR manager has no work ") ;
 }
}
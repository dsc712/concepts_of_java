class MyRunnable implements Runnable
{
  public void run()
  {
    System.out.println("Thread started:: " + Thread.currentThread().getName() ) ;
    try{
     Thread.sleep(4000) ;
     }  
    catch(Exception e){ }
    
    System.out.println("Thread ended:: " + Thread.currentThread().getName() ) ;
  }
}

class ThreadJoin
{
  public static void main(String[] args)
  {
    Thread t1  = new Thread(new MyRunnable() , "t1" ) ;
    Thread t2  = new Thread(new MyRunnable() , "t2" ) ;
    Thread t3  = new Thread(new MyRunnable() , "t3" ) ;
     
    t1.start() ;
  
    //start 2nd thread after waiting for 2 sec or if it is dead
  
    try{
      t1.join(2000) ; 
    }
    catch(Exception e){ }
    
    t2.start() ;

    //start 3rd thread only when first thread is dead
   
    try{
     t1.join() ;
     }
    catch(Exception e){ }
    
     t3.start() ;

   //let all threads finish its execution before main thread
    
     try{
       t1.join() ;
       t2.join() ;
       t3.join() ;    
     } 
     catch(Exception e ){ }
    System.out.println("all threads are dead, exiting main Thread ") ;
   }
}
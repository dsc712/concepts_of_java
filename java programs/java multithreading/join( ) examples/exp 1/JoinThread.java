/*

  In this program, main thread 
  will have to wait for
  threads t1 , t2 and t3 , to perform
  its task .


*/




class Thread1 extends Thread
{
  Thread1(String s)
  { 
    super(s) ;
   }
  
  public void run()
  {
    for(int i=0 ; i<5 ; i++ )
     {
      System.out.println(Thread.currentThread().getName() ) ;
      try{
         Thread.sleep(100) ;   
        } 
      catch(Exception e){ }

      }
     System.out.println(Thread.currentThread().getName() + " dead") ;
   }
  
}

class JoinThread
{
 public static void main(String... args)
  {
   Thread1 t1 = new Thread1("thread1") ;
   Thread1 t2 = new Thread1("thread2") ;
   Thread1 t3 = new Thread1("thread3") ;

   t1.start() ;
   t2.start() ;
   t3.start() ;

    // by calling join() method , these threads joined the main thread . Now the main thread will have to wait for
    // these three threads for finishing there execution , till that time the main thread will stay blocked . Also
    // you can see join() method is called in a try catch block as join() method throw interrupted exception if another thread
    // interrupted waiting thread as a result of join() call .
      
    
   try{
     t1.join() ; 
     t2.join() ;
     t3.join() ;
    }
   catch(Exception e){ }
   
   for(int i = 0 ; i < 10 ; i++)
   {
      System.out.println(Thread.currentThread().getName() ) ;
      
      try{
          Thread.sleep(1000) ; 
        }
      catch(Exception e){ }
   } 

  }
}
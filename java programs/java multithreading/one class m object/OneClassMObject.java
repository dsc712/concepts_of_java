
/* used when a similar task is needed to be done on all threads*/

class Thread1 extends Thread
{
  Thread1(String s)
   {
    super(s) ;
     }

     // this run method is being shared by all the three threads and they are running simultaneously
   public void run()
    {
      for(int i = 1 ; i <=5 ; i++)
       {
        System.out.println(Thread.currentThread().getName()) ;  
           
         try{
          Thread.sleep(2000) ;
             }          
          catch(Exception e)
           { }
        }
        
       System.out.println(Thread.currentThread().getName() + " is dead") ;
     }
}

class OneClassMObject
{
  public static void main(String s[])
  {
    Thread1 t1 = new Thread1("thread1") ;
    Thread1 t2 = new Thread1("thread2") ;
    Thread1 t3 = new Thread1("thread3") ;
    
    //starting all the threads
    t1.start() ;
    t2.start() ;
    t3.start() ;
    }
   
}
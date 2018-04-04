
/*
   Thread(Runnable r , String s )
    {
     
      }

    the above constructor is used for creating thread objects
    via association . Since Thread1 class is implementing 
    Runnable interface , Thread1 class's object can be catched 
    by Runnable interface(   .....due to  UPCASTING .....   )
*/



/*  
   one more important thing is , if the Thread1 class is having 
   a non-static data member then it is advisable to pass the 
   reference of different thread objects in 
   Thread(Runnable r , String s) constructor , for avoiding the
   change in data member of one thread due to another , the commented 
   portion in the below code demonstrates the same
*/





class Thread1 implements Runnable
{
  //int x ;
  public void run()
  {
    for(int i = 0 ; i<10 ; i++ )
    {
     //System.out.println(Thread.currentThread().getName() + " " + x) ;
     System.out.println(Thread.currentThread().getName()) ;
      try{
           Thread.sleep(2000);
         }    
       catch(Exception e){}
     }
   }
}
class RunThread
{
 public static void main(String... s)
 {
  Thread1 t1 = new Thread1() ;
 // t1.x = 50 ;
 
  Thread tt1 = new Thread(t1 , "thread1" ) ;
   tt1.start() ;
  Thread tt2 = new Thread(t1 , "thread2" ) ;
   tt2.start() ;
  
  /*
     Thread1 t2 = new Thread1() ;
     t2.x = 100 ;
     Thread tt3 = new Thread(t2 ,"thread3" ) ;   
   */
 
  int  i ;
  for( i = 0 ; i<10 ; i++)
   {
    System.out.println(Thread.currentThread().getName()) ;
      try{
           Thread.sleep(2000);
         }    
       catch(Exception e){}
   }
  
  }
}
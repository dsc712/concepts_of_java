class Thread1 extends Thread
{
  Thread1(String s)
  {
     super(s) ;   
   }
  
  public void run()
   {
     int i ;
 
    for(i = 0 ; i<3 ; i++)
     {
         System.out.println( Thread.currentThread().getName() ) ;
         try{
           Thread.sleep(2000) ;
           }
        catch(Exception e){ } ;         
       }
        
     }
}
class Thread2 extends Thread
{
  Thread2(String s) 
   {
     super(s) ;  
    }
  
   public void run()
   {
    int i ;
    for(i = 0 ; i<5 ; i++)
     {
         System.out.println(Thread.currentThread().getName()) ;
       try{
           Thread.sleep(2000) ;
           }
        catch(Exception e){ } ;               
       }
       
     }
}
class Thread3 extends Thread
{
  Thread3(String s)
   {
     super(s) ;
    }
     
   public void run()
   {
    int i ;
    for( i = 0 ; i<7 ; i++)
     {
         System.out.println(Thread.currentThread().getName()) ; 
       try{
           Thread.sleep(1000) ;
           }
        catch(Exception e){ } ;             
       }
        
     }
}

class RunThread
{
 public static void main(String... args)
 {
  Thread1 t1 = new Thread1("thread1") ;
  Thread2 t2 = new Thread2("thread2") ;
  Thread3 t3 = new Thread3("thread3") ;

  t1.start();
  t2.start();
  t3.start();

  int i ;
  for(i=1 ; i<10 ; i++)
  {
     System.out.println(Thread.currentThread().getName()) ; 
    try{
           Thread.sleep(1000) ;
           }
        catch(Exception e){ } ;    
    }
    
 }
}
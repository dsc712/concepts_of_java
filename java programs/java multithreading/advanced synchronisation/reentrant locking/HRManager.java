// HR of a company wants to hire 3 java developers . For this he selects 3 techleads to conduct test and select candidates . One TechLead
// will select one candidate . But there is only one questionpaper and xerox machine is down . So now at a time only one Techlead can conduct 
// test . When one Techlead has taken the test then he gives back the questionpaper . Now other techleads can take the questionpaper and conduct
// test .

import java.util.concurrent.locks.ReentrantLock ;

class TechLead extends Thread
{
  ReentrantLock ques_paper ;
  
  TechLead(ReentrantLock rl , String s)
   {
    super(s) ;
    ques_paper = rl ;
    }
   public void run()
    {
      System.out.println(Thread.currentThread().getName() + "  " + "is waiting for the question paper." ) ;
      
      ques_paper.lock() ;

      System.out.println(Thread.currentThread().getName() + "  " + "takes the question paper ." ) ;
      System.out.println(Thread.currentThread().getName() + "  " + "starts taking test." ) ; 
      try{
        Thread.sleep(2000) ; 
         }         
      catch(Exception e)
        {}
      System.out.println(Thread.currentThread().getName() + "  " + "has taken the test ." ) ;
      System.out.println(Thread.currentThread().getName() + "  " + "returns the question paper." ) ;
     
     ques_paper.unlock();          
      }
}

class HRManager
{
 public static void main(String... args)
  {
    ReentrantLock rl = new ReentrantLock() ;
    new TechLead(rl , "superman").start() ;
    new TechLead(rl , "batman").start() ;
    new TechLead(rl , "ironman").start() ;
 
    System.out.println(" HR gave the responsibility to techleads to recruit 3 java developers.. ") ;
  }
}
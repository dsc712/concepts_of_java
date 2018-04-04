// This is a simple program demonstrating the use of synchronization in multithreadding . In java , every object maintains a one implicit lock 
// on it , which is known as monitor . If any thread wants to call any synchronised method on a particular object then it must be having a 
// lock of that object . A general idea is , if you think that there is a function in a class(a class which is shared among different threads) , 
// which can change the data then make such method synchronised .


// note : lock is always achieved on current object in case of synchronised methods . Later we will see with the help of synchronised block we
// can achieve lock on any object based on the argument passed in sunchronised block .


class Shared
{
 int x , y ,a , b ;
 
 // the thread which will reach here first , will take up the lock with it . Due to which other threads will have to wait until the thread 
 // with the lock exit from this method returning back the lock . And as soon as lock becomes free , any of the thread will take the lock again
 // and the process goes on and on . And this is how synchronization protects the data from getting corrupted.
 synchronized void show(String s , int a)
  {
    x = a ;
    System.out.println("starting in method" + " " + x) ;
    
    try{
      Thread.sleep(1000) ;
     }
    catch(Exception e){ }
    
    System.out.println("exit from method" + " " + x) ;
   }
 
 synchronized  int add(int a , int b)
  {
    this.a = a ;
    this.b = b ;

    try{
     Thread.sleep(7000) ;    
     } 
    catch(Exception e){ }
   
    return a + b  ;
  }
}


class CustomThread extends Thread
{
 Shared s ;
 public CustomThread(Shared s ,  String str)
 {
  super(str) ;
  this.s = s ;
  start();
 }
 
 public void run()
 {
   System.out.println("hello from thread1") ;
   s.show(Thread.currentThread().getName() , 10) ;
   int sum = s.add(30 , 40 ) ;
   System.out.println(sum + " for thread1") ;
 }

}

class CustomThread1 extends Thread
{
 Shared s ;
 public CustomThread1(Shared s ,  String str)
 {
  super(str) ;
  this.s = s ;
  start();
 }
 
 public void run()
 {
   System.out.println("hello from thread2 ") ;
   s.show(Thread.currentThread().getName() , 20) ;
   int sum = s.add(20 , 30 ) ;
   System.out.println(sum + " for thread2") ;
 }

}

class CustomThread2 extends Thread
{
 Shared s ;
 public CustomThread2(Shared s ,  String str)
 {
  super(str) ;
  this.s = s ;
  start();
 }
 
 public void run()
 {
   System.out.println("hello from thread3") ;
   s.show(Thread.currentThread().getName() , 30) ;
   int sum = s.add(10 , 20 ) ;
   System.out.println(sum + " for thread3") ;
 }

}


class RunSync
{
 public static void main(String... s)
 {
  Shared st = new Shared() ;
  CustomThread t1 = new CustomThread(st , "one") ;
  CustomThread1 t2 = new CustomThread1(st , "two") ;
  CustomThread2 t3 = new CustomThread2(st , "three") ;
  }
}

/*  A simple program demonstrating , what will happen if run() method is called explicitly */

class Thread1 extends Thread{
  Thread1(String s){
     super(s) ;
  }

  public void run() {

  	 for(int i=0 ; i< 5 ; i++ ){
  	 	 System.out.println(Thread.currentThread().getName() ) ;

  	 	 try{
  	 	 	Thread.sleep(2000) ;
  	 	 }
  	 	 catch(Exception e){}
  	 }
  	 System.out.println(" Thread1 class's run completed " ) ;
  }
}

class RunThread {

	public static void main(String... args){
	Thread1 t1 = new Thread1("Thread1") ;
	Thread1 t2 = new Thread1("Thread2") ;
	Thread1 t3 = new Thread1("Thread3") ;

  // calling run method explicitly 
	t1.run() ;
    t2.run() ;
    t3.run() ;

    // only main thread is running in this example , as without start() , thread will born but not started .
	}
	
}
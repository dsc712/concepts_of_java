class Shared {
	int flag = 0 ;
	int data = 0 ;

	synchronized public void submit(){
		flag = 1 ;
		try{                      // even if this thread is sleeping , it will not release the processor cycle as other thread is in waiting block
			Thread.sleep(1000) ;
		}
		catch(Exception e){}
          data = 10 ;
          System.out.println("value submitted...") ;
          notify() ;
	}
	synchronized public int withdraw()
	{
		if(flag == 0){
			try{
				System.out.println("sending into wait block...") ;
				wait() ;   // will send the withdrawing thread to wait block , until any other thread don't notify .
			}
			catch(Exception e){}
		}

		return data ;
	}
}

class Thread1 extends Thread{    // this thread will withdraw the data
	Shared s ;
	Thread1(Shared s , String str ){
		super(str) ;
		this.s = s ;
		start() ;
	}
	public void run(){
		s.withdraw() ;
	}
}

class Thread2 extends Thread{    // this thread will submit the data
	Shared s ;
	Thread2(Shared s , String str ){
		super(str) ;
		this.s = s ;
		start() ;
	}
	public void run(){
		s.submit() ;
	}
}
class RunSync{
	public static void main(String[] args) {
		Shared s = new Shared() ;
		Thread1 t1  = new Thread1(s , "thread1") ;
		Thread2 t2 = new Thread2(s , "thread2") ;

	}
}
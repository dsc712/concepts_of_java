class Thread1 extends Thread{
	Thread1(String s){
		super(s) ;
	}
	public void run(){
		System.out.println(getName() + " started..") ;
		for(int i= 0 ; i < 5 ;  i++ ){
			try{
				System.out.println(getName()) ;
				Thread.sleep(1000) ;
			}
			catch(InterruptedException e){
				System.out.println(e) ;
			}
		}
		System.out.println(getName() + " dead") ;
	}
}

class Thread2 extends Thread{
	Thread2(String s){
		super(s) ;
	}
	public void run(){
		System.out.println(getName() + " started..") ;
		for(int i= 0 ; i < 5 ;  i++ ){
			try{
				System.out.println(getName()) ;
				Thread.sleep(1000) ;
			}
			catch(InterruptedException e){
				System.out.println(e) ;
			}
			System.out.println(getName() + " dead") ;
		}
	}
}

class DaemonThread {
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1("thread1") ;
		Thread2 t2 = new Thread2("thread2") ;
		

		t1.setDaemon(true) ;
		t2.setDaemon(true) ;
		

		t1.start() ;
		t2.start() ;
		
		for( int i = 1 ; i <= 2 ; i++){
			System.out.println(Thread.currentThread().getName()) ;

			try{
				Thread.sleep(1000) ;
			}
			catch(Exception e){ }
		}

		System.out.println(Thread.currentThread().getName() + " dead") ;
	}
}
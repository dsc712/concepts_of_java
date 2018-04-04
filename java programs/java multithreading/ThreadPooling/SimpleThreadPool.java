import java.util.concurrent.Executors ;
import java.util.concurrent.ExecutorService ;

class WorkerThread implements Runnable{
	private String command ;
	WorkerThread(String s){
		this.command = s ;
	}

	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName() + " start command = " + command) ;
		processCommand() ;
		System.out.println(Thread.currentThread().getName()  + " end" ) ;
	}
	private void processCommand(){
		try{
			Thread.sleep(1000) ;
		}catch(Exception e){
			e.printStackTrace() ;
		}
	}
	
}

class SimpleThreadPool {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5) ;
		for (int i=0 ; i<10 ; i++ ) {
			Runnable worker = new WorkerThread("" + i) ;
			executor.execute(worker) ;
		}
		executor.shutdown() ; // once ExecutorService is shutdown we cannot reuse Threadpool


       // we have used this logic to force main thread to wait for ExecutorService . We cannot use join() 
	   // for this purpose as we do not have thread objects .
		while(!executor.isTerminated()){  


		}
		System.out.println(" finished all threads ") ;
	}
}
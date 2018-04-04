/* shutdownhook is an initialized but an unstarted thread which is invoked when the jvm is shutdown in 2 ways , first is the normal 
 shutdown when the last non-daemon thread exits or when the virtual machine termination is the user interruption , like by pressing
 ctrl + c , or user logs off or system shutdown . The shutdown hook can be registered to the java.lang.Runtime class by using the
 addShutdownHook(Thread hook) method . This method is available in JDK above 1.2 . All the registered shutdown hooks will be started in 
 specified order and will run concurrently when the virtual machine begins it's shutdown sequence . Once the shutdown sequence is started 
 it is not possible to register new hooks or deregistered a previously registered hook*/

import java.awt.* ;
import javax.swing.* ;


class ShutDownHooks implements Runnable {

	// this method will be invoked when JVM shuts down normally or abruptly
	public void run(){
       System.out.println(" ..... shutdown hook started ....") ;
       System.out.println(" .... Application shutting down ....") ;

       try{
       	 Thread.sleep(1000 * 5) ;
       }
       catch(Exception e){

       }
	}
}

class RunHookUp{
	public static void main(String[] args) {
		Runtime runTime = Runtime.getRuntime() ;
		ShutDownHooks hook = new ShutDownHooks() ;

		//The addShutdownHook() method of Runtime class is used to register the thread with the Virtual Machine
		runTime.addShutdownHook(new Thread(hook)) ;

		JFrame jf = new JFrame("test frame") ;
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		jf.setSize(400,400) ;
		jf.setVisible(true) ;
		System.out.println("hello") ;
	}
}
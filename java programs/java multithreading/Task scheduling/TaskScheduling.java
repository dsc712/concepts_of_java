import java.util.* ;
import javax.swing.JFrame ;

class Task extends TimerTask{
	int count = 1 ;
	// run is an abstract method of TimerTask class that defines task performed at scheduled time

	public void run(){
		if(count == 10 ){
			
			System.exit(0) ;
		}
			JFrame jf = new JFrame() ;
			jf.setSize(250 , 250) ;
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
			jf.setVisible(true) ;
			count++ ;
		}
	}


class TaskScheduling {

	public static void main(String[] args) {
		Timer timer = new Timer() ;
		int delay = 5000 ;
		int period = 1000 ;
		timer.scheduleAtFixedRate(new Task() , delay , period ) ;
	}

}
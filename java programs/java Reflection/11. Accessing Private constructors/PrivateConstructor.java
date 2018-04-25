import java.lang.reflect.Constructor ;
class Temp {
	private Temp(){
		System.out.println("Default Constructor") ;
	}
	void show() {
		System.out.println("show") ;
	}
	private Temp(int x ){
		System.out.println(x + " via parametrized constructor " ) ;
	}
}

class PrivateConstructor{
	public static void main(String[] args) {
		try{
			Class cl = Temp.class ;
			Constructor c = cl.getDeclaredConstructor() ;
			c.setAccessible(true) ; // solution 
			Temp t1 = (Temp)c.newInstance() ;
			t1.show() ;
            Constructor c1 = cl.getDeclaredConstructor(int.class) ;
            c1.setAccessible(true) ; // solution
            Temp t2 = (Temp)c1.newInstance(10) ;
            t2.show() ;

		}catch(Exception e){
			
		}
	}
}
import java.util.LinkedList ;
public class MyPushOrPopOpr {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>() ;
		al.add("first") ;
		al.add("second") ;
		al.add("third") ;
		al.add("random") ;

		System.out.println(al) ;
		al.push("push element") ;
		System.out.println("After push operation") ;
		System.out.println(al) ;
		al.pop() ;
		System.out.println("After pop operation") ;
		System.out.println(al) ;
	}
}
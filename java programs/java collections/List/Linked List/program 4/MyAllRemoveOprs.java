import java.util.LinkedList ;
public class MyAllRemoveOprs {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<>() ;
		al.add("first") ;
	    al.add("second") ;
		al.add("third") ;
		al.add("random") ;
		al.add("four") ;
	    al.add("five") ;
		al.add("six") ;
		al.add("seven") ;
		al.add("eight") ;
	    al.add("nine") ;
		al.add("eight") ;
		al.add("ten") ;

        System.out.println(al) ;
        System.out.println("remove() method : " + al.remove()) ;
        System.out.println(al) ;
        System.out.println("remove(index) method : " + al.remove(2) ) ;
        System.out.println(al) ;
        System.out.println("remove(object) method : " + al.remove("six") ) ;
        System.out.println(al) ;
        System.out.println("removeFirst() method : " + al.removeFirst() ) ;
        System.out.println(al) ;
        System.out.println("removeFirstOccurrence(object) method : " + al.removeFirstOccurrence("eight") ) ;
        System.out.println(al) ;
        System.out.println("removeLast() method : " + al.removeLast() ) ;
        System.out.println(al) ;
        System.out.println("removeLastOccurrence(object) method : " + al.removeLastOccurrence("five") ) ;
        System.out.println(al) ;

	}
}

/*

Output :
=======

[first, second, third, random, four, five, six, seven, eight, nine, eight, ten]
remove() method : first
[second, third, random, four, five, six, seven, eight, nine, eight, ten]
remove(index) method : random
[second, third, four, five, six, seven, eight, nine, eight, ten]
remove(object) method : true
[second, third, four, five, seven, eight, nine, eight, ten]
removeFirst() method : second
[third, four, five, seven, eight, nine, eight, ten]
removeFirstOccurrence(object) method : true
[third, four, five, seven, nine, eight, ten]
removeLast() method : ten
[third, four, five, seven, nine, eight]
removeLastOccurrence(object) method : true
[third, four, seven, nine, eight]

*/
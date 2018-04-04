import java.util.* ;

class MyArrayListShuffle{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>() ;
		list.add("java") ;
		list.add("cric") ;
		list.add("play") ;

		System.out.println("Results before shuffle operation ") ;

		for (String str : list ) {
			System.out.println(str) ;
		}

		Collections.shuffle(list) ;

		System.out.println("results after shuffle operation") ;

		for (String str : list) {
			System.out.println(str) ;
		}
	}
}
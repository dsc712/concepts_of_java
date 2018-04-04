class CompareTo{
	public static void main(String[] args) {
		Integer i1 = new Integer(10) ;
		Integer i2 = new Integer(20) ;  

		int r = i1.compareTo(i2) ;   // r = -1
		System.out.println(r) ;

		Character c1 = new Character('a') ;
		Character c2 = new Character('A') ;

		r = c1.compareTo(c2) ; 
		System.out.println(r) ; // r = 32 
	}
}
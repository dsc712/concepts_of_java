class Equals{
	public static void main(String[] args) {

		Integer i1 = new Integer(10) ;
		Integer i2 = new Integer(20) ;
		boolean r = i1.equals(i2) ;
		System.out.println(r) ;   // prints false

		Character c1 = new Character('a') ;
		Character c2 = new Character('a') ;
		r = c1.equals(c2) ;
		System.out.println(r) ;   // prints true

	}
}
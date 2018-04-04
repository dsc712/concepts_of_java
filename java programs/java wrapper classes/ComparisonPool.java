class ComparisonPool{
	public static void main(String[] args) {
		Integer i1 = 10 ;
		Integer i2 = 10 ;

		boolean r = (i1==i2) ;
		System.out.println(r) ;

		Integer i3 = 128 ;
		Integer i4 = 128 ;

		r = (i3 == i4) ;
        System.out.println(r) ;
	}
}


/*
   Java interns small numbers (less than 128), so all instances of Integer(n)
    with n in the interned range are the same. Numbers greater than or equal 
    to 128 are not interned, hence Integer(1000) objects are not equal to each other.

	Note that this pooling is implementation specific and there's no guarantee of the pooled range.
	The answers about interning are correct in concept, but incorrect with terminology. Interning in 
	Java normally implies that the Java runtime is performing the pooling (such as String's intern).
	 In Integer's case it's the class itself that is doing the pooling. There's no JVM magic involved.


NOTE : wrapper objects are interned only when they are created via autoboxing , rather than via new operator.
       Also it must lie in the range -128 to 127 .

*/
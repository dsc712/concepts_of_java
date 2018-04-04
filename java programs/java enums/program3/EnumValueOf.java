enum week{
	monday , tuesday , thursday , friday , saturday , sunday 
}

class EnumValueOf{
	public static void main(String[] args) {
		week day ;

		day = week.valueOf("monday") ;
		System.out.println("day contains = " + day) ;
		day = week.valueOf("tuesday") ;
		System.out.println("day contains = "+ day) ;

	}
}
enum week{
	Monday , Tuesday , Wednesday ,Thursday , Friday , Saturdy , Sunday 
}

class EnumValues{
	public static void main(String[] args) {
		System.out.println("Here are all week constants") ;

		// use values() method - values() method returns an array of all enum constants

		week allWeek[] = week.values() ;

		for( week aday : allWeek){
			System.out.println(aday) ;
		}
	}
}
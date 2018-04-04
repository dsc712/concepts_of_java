enum week{
  monday , tuesday , wednesday , thursday , friday ,saturday , sunday 
}

class EnumEquals{
	public static void main(String[] args) {
		week day1 , day2 , day3 ;

		day1 = week.monday ;
		day2 = week.monday ;
		day3 = week.tuesday ;

		if(day1.equals(day2)){
			System.out.println(" Error! ") ;
		}
		if(!day2.equals(day3)){
			System.out.println(day2 + " not equals " + day3) ;
		}
		if(!day1.equals(day3)){
			System.out.println(day1 + " not equals " + day3) ;
		}
	}
}
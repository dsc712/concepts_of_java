enum week{
	monday , tuesday ,wednesday , thursday , friday , saturday , sunday
}

class EnumCompareTo{
	public static void main(String[] args) {
		
		week day1,day2,day3 ;

		day1 = week.monday ;
        day2 = week.tuesday ;
        day3 = week.friday ;

        // this if block will be executed
        if(day1.compareTo(day2) < 0){
        	System.out.println(day1 + " comes before " + day2) ;
        }
        // this if block will not be executed
        if(day2.compareTo(day3) > 0){
        	System.out.println(day2 + " comes before " + day3) ;

        }
        // this if block will not be executed
        if(day1.compareTo(day3) == 0){
        	System.out.println(day1 + " equals " + day3) ;
        }
	}
}
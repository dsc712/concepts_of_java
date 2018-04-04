enum week{
	monday , tuesday , wednesday , thursday, friday , saturday , sunday
}

class DefaultValue {
  public static void main(String[] args) {
  	week day[] = week.values() ;

   // obtain all ordinal values using ordinal method
  	for(week day1 : day){
  		System.out.println("day = " + day1.ordinal() ) ;
  	}
  }
}
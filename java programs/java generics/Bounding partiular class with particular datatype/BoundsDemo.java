class Stats<T extends Number>{
	T[] nums ;
	Stats(T[] o){
		nums = o ;
	}

	double average(){
		double sum = 0.0  ;
		for (int i=0; i<nums.length ; i++ ) {
			sum += nums[i].doubleValue() ; // converts Wrapper class Object into double
		}
		return (sum / nums.length) ;
	}
 }

 class BoundsDemo{
 	public static void main(String[] args) {
 		Integer inums[] = {1,2,3,4,5} ; // autoBoxing
 		Stats<Integer> iob = new Stats<Integer>(inums) ;

 		double v = iob.average() ;
 		System.out.println("iob average is " + v) ;

 		Double dnums[] = { 1.1 , 2.2 , 3.3 , 4.4 , 5.5 } ;
 		Stats<Double> dob = new Stats<Double>(dnums) ;

 		double w = dob.average() ;
 		System.out.println("dob average is " + w) ;

 		// String snums[] = {'aaa' , 'bbb' , 'ccc'} ; 
 		// Stats <String> sob = new Stats<>(snums) ;  // not allowed as Stats class generic type is bounded by number class
 		                                              // due to which only classes which are child of number classes can be 
 		                                              // used in this generic class  


 	}
 }
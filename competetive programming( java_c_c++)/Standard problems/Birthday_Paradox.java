// what is the minimum number of people that should be present in a room so that there is a 50% chance of two people having same birthday ??

class Birthday_Paradox{
	static float p = 1f  ; 
    
    public static void main(String[] args) {
    // p denotes probability of two people having different birthdays
    // then 1 - p = same birthday --> we need to find this 

    float num = 365f ;
    float den = 365f ;

    int people = 0 ;

    while( p > 0.5 ){
    	p *= (num/den) ;

    	num-- ;
    	people++ ;
    }

    System.out.println(people) ;
    }
    
}
import java.util.* ;
class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>() ;
		int x[] = {1 , -1 , 2 , -2 , 3 , -3 , 4 , -4} ;

        for (int i = 0; i<x.length ; i++ ) {
        	al.add(x[i]) ;  // autoboxing of integers present in array and then added to ArrayList in form of objects
        }

   /*     ---------------section1-----------                */
        Object o[] = al.toArray() ; 
        for(int i = 0 ; i<o.length ; i++){
        	Integer z = (Integer)o[i] ;
        	System.out.println(z.intValue()) ;
        }        
   /*--------------------------------------------------------*/



  /*      ---------------section2-----------                 */
        for(Integer counter : al){
        	System.out.println(counter.intValue()) ;
        }
   /*---------------------------------------------------------*/



	}
}
// both section1 and section2 do the samething
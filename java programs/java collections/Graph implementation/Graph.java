import java.io.* ;
import java.util.* ;
import java.util.Map.Entry ;

public class Graph<T>{
  Map< T , ArrayList<T> > adjList = new HashMap<>() ;
  
  void addNeighbours(T u , ArrayList<T> v ){
     adjList.put(u , v) ;
  }

  void printAdjList(){
  	 
  	 Set<T> set = new HashSet<>() ;
  	 set = adjList.keySet() ;  // all the keys of hashmap are stored in Set<T> set 

  	 for( T city : set ){   // taking keys from set one by one 

         ArrayList<T> al = adjList.get(city) ;   // taking the arraylist corresponding to a key in hashmap  
         System.out.print(city + " ==> " ) ;

        // from the arraylist corresponding to a key , printing all the values in arraylist 
         for(T cityName : al){
             System.out.print(cityName + " --> ") ;
         }

         // clearing arraylist 
         System.out.println("Null") ;
         al.clear() ;

  	 }
  }

  public static void main(String[] args) {
    Graph<String> g = new Graph() ;
    String[] d = {"Amritsar" , "Lucknow" , "Bangalore"} ;
    String[] j = {"Bangalore" , "Amritsar" } ;
    String[] l = {"Delhi"} ;
    String[] s = {"Amritsar"} ;
    String[] b = {"Delhi" , "Jaipur"} ;

    
    List<String> del = Arrays.asList(d) ;
    ArrayList<String> delhi = new ArrayList(del) ;

   List<String> jai = Arrays.asList(j) ;
    ArrayList<String> jaipur = new ArrayList(jai) ;


   List<String> luc = Arrays.asList(l) ;
    ArrayList<String> lucknow = new ArrayList(luc) ;


    List<String> sia = Arrays.asList(s) ;
    ArrayList<String> siachen = new ArrayList(sia) ;


    List<String> ban = Arrays.asList(b) ;
    ArrayList<String> bangalore = new ArrayList(ban) ;
    
       g.addNeighbours("Delhi" , delhi) ;
       g.addNeighbours("Jaipur" , jaipur ) ;
       g.addNeighbours("Lucknow" , lucknow) ;
       g.addNeighbours("Siachen" , siachen) ;
       g.addNeighbours("Bangalore" , bangalore) ;
 
       g.printAdjList() ;
  }

}


/*
   output : 
   ======
___________________________________________________________
|                                                          |
|	Lucknow ==> Delhi --> Null                             |
|	Delhi ==> Amritsar --> Lucknow --> Bangalore --> Null  |
|	Jaipur ==> Bangalore --> Amritar --> Null              |
|	Siachen ==> Amritsar --> Null                          |
|	Bangalore ==> Delhi --> Jaipur --> Null                |
|__________________________________________________________|

*/
import java.util.ArrayList ;
import java.util.HashMap ;
import java.util.List ;
import java.util.Map ;
import java.util.Set ;

public class ManyToOne{
	public static void main(String[] args) {
		Map<Integer  , List<String> > mapOfIntStrs = new HashMap<>() ;
		add(mapOfIntStrs , 1 , "one") ;
		add(mapOfIntStrs , 1 , "two") ;
		add(mapOfIntStrs , 1 , "three") ;
		add(mapOfIntStrs , 2 , "four") ;
		add(mapOfIntStrs , 2 , "five") ;
		add(mapOfIntStrs , 3 , "six") ;
		add(mapOfIntStrs , 3 , "seven") ;

		Set<Integer> keySet = mapOfIntStrs.keySet() ;

		for(int i : keySet){
			List<String> strlist = mapOfIntStrs.get(i) ;
			System.out.println(i) ;

			for(String s : strlist){
				System.out.println(" " + s) ;
			}
		}
	}
	public static final void add(Map<Integer , List<String> > m, int keyNum , String value  ){
		if(m.containsKey(keyNum)){
			m.get(keyNum).add(value) ;
		}else{
			List<String> strList = new ArrayList<String>() ;
			strList.add(value) ;
			m.put( keyNum , strList ) ;
 		}
	}
}
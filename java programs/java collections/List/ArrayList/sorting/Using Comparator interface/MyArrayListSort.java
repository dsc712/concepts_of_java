import java.util.ArrayList ;
import java.util.Collections ;
import java.util.Comparator ;
import java.util.List ;

class MyArrayListSort{
	public static void main(String[] args) {
		List<Empl> list = new ArrayList<>() ;

		list.add(new Empl("Ram" , 3000)) ;
		list.add(new Empl("John" , 6000)) ;
		list.add(new Empl("Crish" , 2000)) ;
		list.add(new Empl("Tom" , 2400)) ;

		Collections.sort(list , new MySalaryComp()) ;
		System.out.println("Sorted List Enries : ") ;
		for(Empl e : list ){
			System.out.println(e.getSalary() ) ;
		}

		Collections.sort(list , new MyNameComp()) ;
		System.out.println("SOrted list entries : ") ;
		for (Empl e : list ) {
			System.out.println(e.name) ;
		}
	}
}

class MySalaryComp implements Comparator<Empl>{
  public int compare(Empl e1 , Empl e2){
  
    return  ( e1.getSalary() - e2.getSalary() )  ;

  }
}
class MyNameComp implements Comparator<Empl>{
	public int compare(Empl e1 , Empl e2){
        return e1.name.compareTo(e2.name) ;
	}
}

class Empl {
	String name ;
	int salary ;
	Empl(String name , int salary ){
		this.name = name ;
		this.salary = salary ;
	} 
	int getSalary(){
		return salary ;
	}
}
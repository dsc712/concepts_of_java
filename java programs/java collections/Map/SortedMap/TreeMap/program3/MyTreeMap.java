// TreeMap( Comparator c )  ---> constructor 
/*
   This constructor is used when you need to sort the keys based on 
   a particular instance datamember of the class's object which you have 
   inserted in your TreeMap , i.e it is normally used when  your custom class
   which you are inserting as a key in TreeMap has multiple instance datamembers .
   In such a case if we use Comparable intrerface then we are no more choosy , we
   will be restricted to sort a/c to a fixed datamember

*/
import java.util.* ;
import java.util.Map.Entry ;

class MyTreeMap {
	public static void main(String[] args) {
		Comparator m1  =  new MySalaryComp() ;
		Comparator m2  = new  MyNameComp() ;
		TreeMap t = new TreeMap(m1) ;

		System.out.println("Sorting with salary ") ;
		add(t) ;
		show(t) ;
		Empl em = (Empl) t.firstKey() ;
		System.out.println("lowest salary emp : " + em.salary ) ;

		Entry<Empl , String> ent = t.firstEntry() ;
		System.out.println("Entry set values : ") ;

		Empl k = (Empl) ent.getKey() ;
		System.out.println(k.salary + " ===> " + ent.getValue() ) ;
		System.out.println("sorting with name") ;

		TreeMap t1 = new TreeMap(m2) ;
		add(t1) ;
		show(t1) ;
	}

	static void add( TreeMap t){
		t.put( new Empl("Ram" , 101) , "peon") ;
		t.put( new Empl("Shyam" , 102) , "sweeper") ;
		t.put( new Empl("Sunita" , 51) , "maid") ;
		t.put( new Empl("Anita" , 21) , "younger maid") ;
	}
	static void show(TreeMap t ){
		Set s = t.entrySet() ;
		Iterator i = s.iterator() ;
		while(i.hasNext()){
			Map.Entry e = (Map.Entry) i.next() ;
			Empl k = (Empl) e.getKey() ;
			String v = (String) e.getValue() ;
			System.out.println( k.name + " = " + k.salary ) ;
		}
	}
}
class MySalaryComp implements Comparator<Empl>{
	@Override
	public int compare(Empl e1, Empl e2 ){
		if(e1.getSalary() > e2.getSalary()){

			return 1 ;
		}
		else{

			return -1 ;
		}
	}
}
class MyNameComp implements Comparator<Empl>{
	@Override
	public int compare(Empl e1 , Empl e2){
		return e1.name.compareTo(e2.name) ;
	}
}

class Empl{
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

/*

output : 
=======

Sorting with salary
Anita = 21
Sunita = 51
Ram = 101
Shyam = 102
lowest salary emp : 21
Entry set values :
21 ===> younger maid
sorting with name
Anita = 21
Ram = 101
Shyam = 102
Sunita = 51

*/
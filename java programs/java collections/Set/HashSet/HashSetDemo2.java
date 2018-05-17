//This example demonstrate how to override equals() and hashCode()
// methods if your custom class contains more than one fields 
import java.util.* ; 

public class HashSetDemo2{
	public static void main(String[] args) {
		HashSet<Price> hs = new HashSet<>() ;
		hs.add(new Price("Banana" , 20 ) ) ;
		hs.add(new Price("Apple" , 40 ) ) ;
		hs.add(new Price("Orange" , 30 ) ) ; 

		for(Price pr : hs){
			System.out.println(pr) ;
		}

		Price key = new Price("Banana" , 20 ) ; 
		System.out.println("Does set contains key ? " + hs.contains(key) ) ;
		System.out.println("Inserting duplicate object .... ") ;
		hs.add(key) ; // since it's a duplicate , it won't be added and returns false 
		System.out.println("After insertion : ") ;

		for(Price pr : hs){
			System.out.println(pr) ;
		}
	}
}

class Price{
	private String item ;
	private int price ;

	public Price(String itm , int pr) {
		this.item = itm ;
		this.price = pr ;
	}
	@Override
	public int hashCode(){
      System.out.println("In hashcode" ) ;
      int hashcode = 0 ;
      hashcode = price*20 ;
      hashcode += item.hashCode() ; // String class has already overriden hashCode() method
      return hashcode ;
	}

	@Override
	public boolean equals(Object o){
		System.out.println("In equals") ;
		if(o instanceof Price){
			Price pp = (Price)o;
			return (pp.item.equals(this.item) && pp.price == this.price ) ; // if both price and item are equal - then they are duplicates 
		}else{
			return false ;
		}
	}

	public String toString(){
		return "item : " + item + "price : " + price ;
	}

}
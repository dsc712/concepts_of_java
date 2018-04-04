enum Apple{
	A(10) , B(9) , C(12) , D(15) , E(8) ;  // these enum constants will create instances of Apple class
	
	 private int price ;  // price of each apple
     
     Apple(int p){
     	price = p ;
     }

     int getPrice(){
     	return price ;
     }

}

class EnumConstructor {
	public static void main(String[] args) {
		System.out.println("D costs " + Apple.D.getPrice()  + " cents\n") ;

		System.out.println(" All apple prices : ") ;

		for(Apple a : Apple.values() ){
			System.out.println(a + " costs " + a.getPrice() + " cents") ;
			System.out.println(a.getClass().getName()) ;  
		}
	}
}
import java.util.Scanner  ;

class ScannerCalculator{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		double n1 = 0.0 ;
		double n2 = 0.0 ;
		String operation = null ;

		try{
			n1 = s.nextDouble() ;
			operation = s.next() ;
			n2 = s.nextDouble() ;
            double result = calculate(n1 , n2 , operation ) ;
            System.out.printf("%s %s %s = %2f \n",n1 , operation , n2 , result ) ;
		}
		catch(Exception e){
            System.out.printf("invalid expression \n" ) ;
		}

      }

		public static double calculate(double op1 , double op2 , String operation){
			switch (operation) {
				case "+" : return op1 + op2 ;
				case "-" : return op1 - op2 ;
				case "*" : return op1 * op2 ;
				case "/" : return op1 / op2 ;
			}
			return Double.NaN ;
		}
	
}
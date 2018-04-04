/*
   "assert" keyword is never left permanently in a java project . It is inserted into 
    project at runtime and as soon as testing finishes it is removed from the code.
*/

class MyAssertion{
	public static void main(String[] args) {
		assert args[0].equals("india") : "error , you are mad" ;
		System.out.println("Ok") ;
	}
}

/*
  By default it is disabled , so to use it in command line use 
  java -ea  switch as follows :

   <path/to/your/code>java -ea MyAssertion
*/
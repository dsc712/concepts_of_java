/* ArrayList class implements Serializable interface . So we can serialize the ArrayList . But the problem occurs when the ArrayList contains
   objects of class which do not implements Serializable interface .*/

   import java.util.ArrayList ;
   import java.io.* ;

   class ArrayListSerialization{
   	 public static void main(String[] args) {
   	 	ArrayList<String> al = new ArrayList<>() ;
   	 	al.add("hello") ;
   	 	al.add("hi") ;
   	 	al.add("bye") ;

   	 	try{
   	 		FileOutputStream fos = new FileOutputStream("myfile") ;
   	 		ObjectOutputStream oos = new ObjectOutputStream(fos) ;

   	 		oos.writeObject(al) ;
   	 		oos.close() ;

   	 		System.out.println("after deserialization") ;

   	 		FileInputStream fis = new FileInputStream("myfile") ;
   	 		ObjectInputStream oin = new ObjectInputStream(fis) ;
   	 		ArrayList al1 = (ArrayList)oin.readObject() ;

   	 		System.out.println(al1) ;
   	 	}
   	 	catch(Exception ioe){
   	 		ioe.printStackTrace() ;
   	 	}
   	 }
   }
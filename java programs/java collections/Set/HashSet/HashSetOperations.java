import java.util.*;
public class HashSetOperations
{
  public static void main(String args[])
  {
    String cities[] = { "Hyderabad", "Noida", "Bangaluru", "Mumbai", "Pune" };
    List<String> myList = Arrays.asList(cities);
    HashSet<String> hs1 = new HashSet<String>(myList);
    System.out.println("Elements of hs1: " + hs1);
 
    HashSet<String> hs2 = new HashSet<String>();
    hs2.addAll(hs1);
    System.out.println("Elements of hs2: " + hs2);
 
    System.out.println("Elements of hs1 and hs2 are same with containsAll(): " + hs1.containsAll(hs2));
 
    HashSet<String> hs3 = new HashSet<String>();
    hs3.add("Hyderabad");
    hs3.add("Mumbai");
    hs2.retainAll(hs3);
    System.out.println("\nElements of hs2 after retainAll(): " + hs2);
 
    String str = hs2.toString();
    System.out.println("\nElements of hs2 in string form: " + str);
 
    System.out.println("\nElements of hs2 before clear(): " + hs2);
    hs2.clear();
    System.out.println("Elements of hs2 after clear(): " + hs2);
 
		                 // PRINTING ELEMENTS WITH ITERATOR
    System.out.print("Elements of hs3 with iterator: ");
    Iterator it1 = hs3.iterator();
    while(it1.hasNext())
    {
      System.out.print(it1.next() + " ");
    }
  }
}
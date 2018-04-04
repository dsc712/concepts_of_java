class Gen<T>
 {
  T ob; // declare an object of type T

  Gen(T o) {
    ob = o;
  }

  T getob() 
  {
    return ob;
   }

  void showType() 
  {
      Class  c=ob.getClass();
      System.out.println("Type of T is " +c.getName());
    }
}

public class GenDemo 
{
  public static void main(String args[]) 
    {
       // Gen<Integer> iOb;
       Gen<Integer> iOb = new Gen<Integer>(98);

        iOb.showType();

        int v = iOb.getob();  // auto unboxing

        System.out.println("value: " + v);

           //Gen<String> strOb = new Gen<>("Generics Test");
        Gen<String> strOb = new Gen<String>("Generics Test");
        strOb.showType();

        String str = strOb.getob();
        System.out.println("value: " + str);

        Emp   e1 = new  Emp();
        Gen<Emp> eOb = new Gen<Emp>(e1);

        eOb.showType();
        Emp  e2 =  eOb.getob();
        System.out.println("value: " + e2.x);  // value: 200
        //iOb=strOb;

      }
}

class Emp
{
int  x=200;
}

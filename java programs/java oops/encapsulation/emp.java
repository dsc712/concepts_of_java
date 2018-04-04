class Emp
{
  static String cname="TCS"; // stores in class information area
  String name ;
  int salary ;
   void get(String s1,int s2)// stores in method area
    {
      name=s1;
      salary=s2;
     }
   void show()// stores in method area
    {
       System.out.println(name);
       System.out.println(salary);
       System.out.println(cname);
    }
    public static void main(String... args)// stores in method area
     {
       Emp e1=new Emp();// a box is created having a reference id stored by reference variable e1
                         //in stack
        e1.get("lalu",101);
        e1.show();
         System.out.println(e1.name);
         System.out.println(cname);
         System.out.println(e1);  //printing reference id 
         Emp e2=e1;              //new reference variable created containing same reference id
         System.out.println(e2);  //printing reference id 
         e2.name="bhalu";         //overwrites lalu 
         System.out.println(e1.name); //prints bhalu
      }
}
class Temp
{
   public static void main(String... args)
   {
    System.out.println(Emp.cname);
   }
  
}
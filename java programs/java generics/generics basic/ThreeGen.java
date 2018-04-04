class ThreeGen<T, V,lalu> {
  T ob1;
  V ob2;
  lalu  ob3;

  ThreeGen(T o1, V o2,lalu o3) {
    ob1 = o1;
    ob2 = o2;
    ob3 = o3;
  }

  void showTypes() 
  {
    System.out.println("Type of T is " + ob1.getClass().getName());
    System.out.println("Type of V is " + ob2.getClass().getName());
    System.out.println("Type of lalu is " + ob3.getClass().getName());
  }


  T getob1() {
    return ob1;
  }
  V getob2() {
    return ob2;
  }
  lalu getob3() {
    return ob3;
  }


    public static void main(String args[]) 
    {
      ThreeGen<Integer, String,Double> tgObj = new ThreeGen<>(88, "Generics",2.4);
      tgObj.showTypes();
      int v = tgObj.getob1();
      System.out.println("value: " + v);
      String str = tgObj.getob2();
      System.out.println("value: " + str);
      double d = tgObj.getob3();
      System.out.println("value: " +d);
    }
}


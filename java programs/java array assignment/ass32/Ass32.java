class Ass32
{
 static void mean(int x[])
  {
    int i,sum=0;
    float m;
    for( i=0 ; i<x.length ; i++ )
     {
       sum += x[i]; 
       
        }
     m = (float)sum / x.length;

   System.out.printf("\n \n Mean of the given array elements is %.2f",m);
     
    }

 public static void main(String... args)
  {
    mean(new int[]{3,5,7,2,9,6});
   
    }
}
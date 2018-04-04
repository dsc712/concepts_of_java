interface My
{
void show();
}

class Outer
{

int x=10;
static int y=20;

void display(My m)
{
  m.show();
}

public static void main(String... args)
{
 Outer o=new Outer();
 o.display(new My()
            {
              public void show()
               {
                 System.out.println("from anonymous class");
                 }
              });
}
}
 /* 
    Piped Input / Output Stream 
    ----------------------------
    reading and writing can be done simultaneously and for that we will be required to share processor cycle,
    and we know whenever we need to share the processor cycle , multithreadding comes into picture 
    automatically . 

    */

import java.io.* ;

class Prun{
 
  public static void main(String... args) throws IOException
  {
   PipedOutputStream pout = new PipedOutputStream() ;
   PipedInputStream pin = new PipedInputStream() ;
   
   pout.connect(pin) ;  // connect() present in pipedoutputStreamclass used to connect o/p & i/p streams
   
   Poutput po = new Poutput(pout) ;
   Pinput  pi = new Pinput(pin) ;
   
   Thread t1 = new Thread(po) ;
   Thread t2 = new Thread(pi) ;
   
   t1.start() ;
   t2.start() ;    
  }

}

class Poutput implements Runnable
{
  PipedOutputStream pout ;
  
  Poutput(PipedOutputStream pout)
  {
   this.pout = pout ;
   }
  
  public void run()
  {
   for(int i=65 ; i<91 ; i++)
    {
      try{
        pout.write(i) ;
        Thread.sleep(1000) ; 
       }
      catch(Exception e){
       System.out.println(e) ; 
      } 

     }
   }

}

class Pinput implements Runnable
{
   PipedInputStream pin ;
  
  Pinput(PipedInputStream pin)
  {
   this.pin = pin ;
   }
  
  public void run()
  {
   int z = 0 ;
   for(int i=65 ; i<91 ; i++)
    {
      try{
         z = pin.read() ; 
       }
      catch(Exception e){
       System.out.println(e) ; 
      } 
      System.out.println( (char)z ) ;
     }
   }

}


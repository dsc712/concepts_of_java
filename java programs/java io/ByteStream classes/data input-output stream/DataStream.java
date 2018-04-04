/*
    flush() method 
    --------------

	When you write data to a stream, it is not written immediately, 
	and it is buffered. So use flush() when you need to be sure that all your data from buffer is written.

	We need to be sure that all the writes are completed before we close the stream,
	 and that is why flush() is called in file/buffered writer's close().

    If you do want to send data before the buffer is full, you do have control. Just Flush It.
     Calls to writer.flush() say, "send whatever's in the buffer, now!

 */

import java.io.* ;

class DataStream 
{

public static void main(String... args) throws IOException
{
 DataInputStream din = new DataInputStream(System.in);
 FileOutputStream fout = new FileOutputStream("lalu.txt") ;
 DataOutputStream dout = new DataOutputStream(fout) ;
 String s = "" ;
 
  while( !s.equals("stop") )
  {
   s = din.readLine() ;
   System.out.println(s) ;
   //dout.writeChars(s) ;
 // dout.writeUTF(s) ;
   dout.writeBytes(s) ;
 //  dout.flush() ;
   }
 }
}

/*
		 DataOutputStream belongs to the OutputStream classes for writing binary data - not Writer for text,
		 It is an old class and writeBytes(String) is a weird twitter method as it:

		Each character in the string is written out, in sequence, by discarding its high eight bits.
		 If no exception is thrown, the counter written is incremented by the length of s.

		So from every Unicode UTF-16 char (16 bits) the low byte is taken. If the string restricted
		 to 7-bits ASCII, maybe a bit ISO-8859-1, the string is not mangled. But in general information is lost.

		There is no counterpart in DataInputStream, no String readBytes().

		It is a design mishap, as java introduced a separatation from text and binary data (byte[]),
		 introducing byte and reserving String and 16-bit char for Unicode text. The author probably felt a 
		 need for a C style write(char*).

 */
import java.io.*;

import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame 
{
	
	Frame1(String s)
	{
		
		setTitle(s);
		setSize(300,400);
		setLocation(300,400);
		addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we){
			System.exit(0);}});
	
	}
}

public class PrintWriterDemo {

   public static void main(String[] args) {
      Object obj1 = "Object";
      Object obj2 = 2;
    
      Frame1 f = new Frame1();		
      try {

         // create a new writer
         PrintWriter pw = new PrintWriter(System.out);

         // print object
         pw.println(obj1);

         // print another object
         pw.println(obj2);

         // print a date (it is an object)
         pw.print(f);

         // flush the writer
         pw.flush();

      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}

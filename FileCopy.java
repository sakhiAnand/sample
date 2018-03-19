import java.io.*;

public class FileCopy{
	
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=null;
		FileOutputStream fos = null;
		int i;
		try{

			fis = new FileInputStream("Abc.txt");
			fos = new FileOutputStream("Xyz.txt");
		}catch(FileNotFoundException fnfe)
		{
			System.out.println("Exception is "+fnfe);
		}
	
		do
		{
			i = fis.read();
			if(i!=-1) fos.write((char)i);
		}while(i!=-1);
	}	
}

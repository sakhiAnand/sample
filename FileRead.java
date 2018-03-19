import java.io.*;

public class FileRead{
	
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=null;
		int i;
		try{

			fis = new FileInputStream("Abc.txt");
		}catch(FileNotFoundException fnfe)
		{
			System.out.println("Exception is "+fnfe);
		}
	
		do
		{
			i = fis.read();
			if(i!=-1) System.out.println((char)i);
		}while(i!=-1);
	}	
}

import java.io.*;

public class CharRead
{
	public static void main(String[ ]args) throws IOException
	{
		char ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			ch = (char) br.read();
			System.out.println(ch);
		}while(ch!= 'q');
	}


}

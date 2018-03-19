import java.io.*;

public class StrRead
{
	public static void main(String[ ]args) throws IOException
	{
		String ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			ch = br.readLine();
			System.out.println(ch);
		}while(!ch.equals("Quit"));
	}


}

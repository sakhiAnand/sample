import java.io.*;

public class KbRead
{
	public static void main(String[ ]args) throws IOException
	{
		int ch;
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(System.in);
		String str = br.readLine();
		System.out.println(str);
	}


}

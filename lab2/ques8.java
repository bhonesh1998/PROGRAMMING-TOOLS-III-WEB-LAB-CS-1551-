import java.util.*;
import java.io.*;

public class ques8
{
	public static void printline(String x)
	{
		System.out.print(x);
	}	
	
	public static void main(String[] args)
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input;
			char lastChar;
			do
			{
				printline("Enter a string [empty to exit] : ");
				input = br.readLine();
		
				lastChar = input.charAt(input.length()-1);
		
				printline("backAround(" + input + ") --> ");
				printline("\"" + lastChar + input + lastChar + "\"\n");
			
			}while(true);
		}
		catch(Exception e){}
	}
}

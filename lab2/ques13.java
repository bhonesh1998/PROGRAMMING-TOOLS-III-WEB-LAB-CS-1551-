import java.util.*;
import java.io.*;

public class ques13
{
	public static void printline(String x)
	{
		System.out.print(x);
	}	
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		printline("Enter a number : ");
		int number = Integer.parseInt(br.readLine());
		
		printline(number + " + 1 = " + (-(~number)) + '\n');
		
	}
}

import java.util.*;
import java.io.*;

public class ques9
{
	public static void printline(String x)
	{
		System.out.print(x);
	}	
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		printline("Enter a number : ");
		int input = Integer.parseInt(br.readLine());
		
		int divide = 512;
		int base = (int)(Math.log(divide) / Math.log(2));
		
		printline("Output 1 : " + input + " * " + divide + " = " + (input<<base) + "\n");
		printline("Output 2 : " + input + " / " + divide + " = " + (input>>base) + "\n");  
	}
}

import java.util.*;
import java.io.*;

public class ques10
{
	public static void printline(String x)
	{
		System.out.print(x);
	}
	
	public static void result(String binary)
	{
		int number = Integer.parseInt(binary, 2);
		
		printline(binary + " -> " + number + " -> " + Integer.toBinaryString(number) + '\n');
		
	}
	
	public static void main(String[] args) throws Exception
	{
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			result("1010");
			result("100100");
			result("100");
			result("10000");
			result("100000");
		}
		catch(Exception e){}
	}
}

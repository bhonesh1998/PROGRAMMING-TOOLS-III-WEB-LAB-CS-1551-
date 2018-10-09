import java.util.*;
import java.io.*;

public class ques14
{
	public static void printline(String x)
	{
		System.out.print(x);
	}	
	
	public static void main(String[] args) throws Exception
	{
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			printline("Enter a number : ");
			int number = Integer.parseInt(br.readLine());
		
			printline("Binary Representation : " + Integer.toBinaryString(number) + "\n");
			if(Integer.bitCount(number) == 1) {
				printline(number + " is a power of 2\n");
			}
			else {
				printline(number + " is not a power of 2\n");
			}
		}
		catch(Exception e){}
	}
}

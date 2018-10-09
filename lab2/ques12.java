import java.util.*;
import java.io.*;

public class ques12
{
	public static void printline(String x)
	{
		System.out.print(x);
	}	
	
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		
		printline("Enter number 'A' : ");
		int a = scan.nextInt();
		
		printline("Enter number 'B' : ");
		int b = scan.nextInt();
		
		if(!(a != b)) {
			printline(a + " and " + b + " are equal\n");
		}
		else {
			printline(a + " and " + b + " are not equal\n");
		}
	}
}

import java.util.*;
import java.io.*;

public class ques11
{
	public static void printline(String x)
	{
		System.out.print(x);
	}	
	
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		
		printline("Enter number 'A' : ");
		int A = scan.nextInt();
		
		printline("Enter number 'B' : ");
		int B = scan.nextInt();
		
		printline(A + " & " + B + " : " + (A&B) + "\n");
		printline(A + " | " + B + " : " + (A|B) + "\n");
		printline(A + " ^ " + B + " : " + (A^B) + "\n");
		printline(A + " == " + B + " : " + (A==B) + "\n");
		printline(A + " != " + B + " : " + (A!=B) + "\n");
	}
}

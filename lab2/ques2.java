import java.util.*;
import java.io.*;

public class ques2
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter a number : ");
		int number = Integer.parseInt(br.readLine());
		
		System.out.printf("%d is a ", number);
		
		if(number % 2 == 0)
		    System.out.print("even");
		else
		    System.out.print("odd");
		
		System.out.println(" number.");
	}
}

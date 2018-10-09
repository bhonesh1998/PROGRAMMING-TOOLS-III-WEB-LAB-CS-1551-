import java.util.*;
import java.io.*;

public class ques1
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your age : ");
		int age = Integer.parseInt(br.readLine());
		
		System.out.print("You are ");
		if (age < 18) System.out.print("not ");
		
		System.out.println("eligible to vote.");
	}
}

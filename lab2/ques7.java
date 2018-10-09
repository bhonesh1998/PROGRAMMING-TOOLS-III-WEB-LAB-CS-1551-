import java.util.*;
import java.io.*;

public class ques7
{
	public static void printline(String x)
	{
		System.out.print(x);
	}	
	
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
	
		try {
			do
			{
				printline("a. int 1x=10;\n");
				printline("b. int x=10;\n");
				printline("c. float x=10.0f;\n");
				printline("d. string x=\"10\";\n");
		
				printline("Enter your choice : ");
				char c = scan.nextLine().charAt(0);
			
				if(c == 'b') {
					printline("Congratulations!\n");
					break;
				}
				else {
					printline("Invalid choice\n");
				}
			}while(true);
		}
		catch(Exception e) {
			printline("Error\n");
		}
	}
}

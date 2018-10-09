import java.util.*;
import java.io.*;

public class ques6
{
	public static void printline(String x)
	{
		System.out.print(x);
	}	
	
	public static void main(String[] args) throws Exception
	{
		char keyPressed;
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.print("Enter a Key [ '*' to exit] : ");
			keyPressed = scan.nextLine().charAt(0);
			
			if(keyPressed == '*') break;
			
			if(Character.isDigit(keyPressed)) {
				printline("You pressed " + keyPressed + ".\n");
			}
			else {
				printline("Not Allowed\n");
			}
			
		}while(true);
		
	}
}

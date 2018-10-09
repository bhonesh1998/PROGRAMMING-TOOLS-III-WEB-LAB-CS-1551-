import java.util.*;
import java.io.*;

public class ques5
{
	public static void printline(String x)
	{
		System.out.print(x);
	}	
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		float unit_price;
		int quantity;
		float discount;
		float totalPrice, totalDiscount;
		
		printline("Enter unit price : ");
		unit_price = Float.parseFloat(br.readLine());
		
		printline("Enter quantity : ");
		quantity = Integer.parseInt(br.readLine());
		
		discount = 0;
		if(quantity > 120) discount = 0.15F;
		else if(quantity >= 100) discount = 0.10F;
		
		totalPrice = unit_price * quantity;
		totalDiscount = totalPrice * discount;
		
		System.out.printf("Discount : %.2f$\n", totalDiscount);
		System.out.printf("The revenue from sale : %.2f$\n", totalPrice - totalDiscount);
	}
}

/*
NAME - BHONESH CHAWLA
REGNO - 20164017
BATCH - CSA
CONTACT - 8619127663
*/



import java.io.*;
import java.util.*;

public class nineth
{
	public static void main(String[] args) 
	{
		Lottery event=new Lottery();
		event.simulateLottery();
		event.displayLotteryNumbers();	
	}	
}


class Lottery
{
	int[] lotteryNumbers=new int[5];
	int[] userNumbers=new int[5];
	int count=0;
	public Lottery()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your five lucky number(0-9)");
		for(int i=0;i<5;i++)
		{
			userNumbers[i]=sc.nextInt();
		}
		Random rand=new Random();
		for(int i=0;i<5;i++)
		{
			lotteryNumbers[i]=rand.nextInt(10);
		}
	}

	public void simulateLottery()
	{
		for(int i=0;i<5;i++)
		{
			if(userNumbers[i]==lotteryNumbers[i])
				count++;
		}
		if(count==5)
			System.out.println("Hurray! you won the lottery");
		else
			System.out.println("Better luck next time! Only "+count+" numbers matched");
	}

	public void displayLotteryNumbers()
	{
		System.out.println("Lottery numbers were:");
		for(int i=0;i<5;i++)
			System.out.print(lotteryNumbers[i]+"  ");
		System.out.println("");
	}
}

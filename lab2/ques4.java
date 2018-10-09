import java.util.*;
import java.io.*;

public class ques4
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int quiz, mid_term, final_score;
		
		System.out.print("Quiz score : ");
		quiz = Integer.parseInt(br.readLine());
		
		System.out.print("Mid-term score : ");
		mid_term = Integer.parseInt(br.readLine());
		
		System.out.print("Final score : ");
		final_score = Integer.parseInt(br.readLine());
		
		int average = (quiz + mid_term + final_score)/3;
		System.out.print("Your grade is ");
		
		if(average >= 90) {
			System.out.println("A.");
		}
		else if(average >= 70) {
			System.out.println("B.");
		}
		else if(average >= 50) {
			System.out.println("C.");
		}
		else {
			System.out.println("F.");
		}
	}
}

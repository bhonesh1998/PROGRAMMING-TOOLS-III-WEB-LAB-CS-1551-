import java.util.*;

class q9

{
	static boolean fun(boolean p1 , boolean p2)
{
	if(p1==true && p2==true )
		return true ;
	else if(p1==false && p2==false)
		return true;
	else 
		return false ;
}
	public static void main(String a[])
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter value of aSmile");
			boolean aSmile = s.nextBoolean();
			System.out.println("enter value of bSmile");
			boolean bSmile = s.nextBoolean();
			
			boolean ans = fun(aSmile,bSmile);
			if(ans==true)
			System.out.println("in trouble");
			else
			System.out.println("not in trouble");
			
			
			
		}
	
}

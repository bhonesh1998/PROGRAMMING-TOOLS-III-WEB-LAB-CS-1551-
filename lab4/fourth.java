/*
NAME - BHONESH CHAWLA
REGNO - 20164017
BATCH - CSA
CONTACT - 8619127663
*/


import java.util.*;

class fourth
{
    
    static String t;
    static void gettime()
    {
        Scanner s11= new Scanner(System.in);
        t=s11.next();
    }
    static void distime()
    {
         System.out.println(t);
    }
      static void addtime()
    {    Scanner s = new Scanner(System.in);

        String s1,s2;
         System.out.println("enter 1st time (format should be HH:MM:SS)");
        
         s1=s.next();
         
         System.out.println("enter 2nd time (format should be HH:MM:SS)");
        s2 = s.next();
        
        int hour1= Integer.parseInt(s1.substring(0,2));

int hour2= Integer.parseInt(s2.substring(0,2));

int min1= Integer.parseInt(s1.substring(3,5));

int min2= Integer.parseInt(s2.substring(3,5));

int sec1= Integer.parseInt(s1.substring(6,8));

int sec2= Integer.parseInt(s2.substring(6,8));
        
        int totalMinutes = min1 + min2;
int totalSeconds = sec1 + sec2;
int totalHours=hour2+hour1;
if (totalSeconds >= 60) {
  totalMinutes ++;
  totalSeconds = totalSeconds % 60;
}
if (totalMinutes >= 60) {
  totalHours ++;
  totalMinutes = totalMinutes % 60;
}

String tm=String.valueOf(totalMinutes);
if(tm.length()==1)
tm="0"+tm;
String ts=String.valueOf(totalSeconds);
if(ts.length()==1)
ts="0"+ts;


System.out.println(totalHours+":"+tm+":"+ts);

    }
    
    
    
	public static void main(String args[])
			
	{
	   System.out.println("enter time (format should be HH:MM:SS)");
	   gettime();
	   distime();
	   addtime();
	   
	     
	}
}


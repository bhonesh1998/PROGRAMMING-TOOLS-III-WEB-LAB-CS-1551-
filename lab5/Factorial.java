/*
NAME - BHONESH CHAWLA
REGNO - 20164017
BATCH - CSA
CONTACT - 8619127663
*/


import java.util.*;
import java.math.*;

class Factorial
{
    
    public Factorial( long n)
    {
          System.out.println("Factorial of "+n+" is");
        System.out.println(ComputeFact(n));
    }
    
    public long ComputeFact(long x)
    {
            if(x==0 || x==1 ) return 1;
            else return x*ComputeFact(x-1);
    }
    
     public static void main (String[] args) 
    {
        Scanner s = new Scanner(System.in);
          System.out.println("Enter value of n ");
        long ss = s.nextLong();
       Factorial fac = new Factorial(ss);
       
        
    }
}

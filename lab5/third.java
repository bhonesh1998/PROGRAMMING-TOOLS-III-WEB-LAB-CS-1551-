/*
NAME - BHONESH CHAWLA
REGNO - 20164017
BATCH - CSA
CONTACT - 8619127663
*/


import java.util.*;
import java.math.*;

class third
{
    public static double radius;
    public third()
    {
         radius=0;
        
    }
     public static void main (String[] args) 
    {
       Scanner s = new Scanner(System.in);
          System.out.println("enter radius of sphere ");
       radius = s.nextDouble();
         System.out.println("area is "+(4*Math.PI*radius*radius));
        
    }
}

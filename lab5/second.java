/*
NAME - BHONESH CHAWLA
REGNO - 20164017
BATCH - CSA
CONTACT - 8619127663
*/


import java.util.*;


class second

{
    public static Scanner s = new Scanner(System.in);
    public static int length;
    public static int breadth;
    public static int height ;
    static void getlength()
    {
            System.out.println("enter length");
            length= s.nextInt();
    }
    static void getbreath()
    {
         System.out.println("enter breadth");
            breadth = s.nextInt();
    }
    static void getheight()
    { System.out.println("enter height");
            height = s.nextInt();
    }
    
    
     public static void main (String[] args) 
    {
        getheight();
        getbreath();
        getlength();
        
         System.out.println("volume is "+height*length*breadth);
        
    }
}

/*
NAME - BHONESH CHAWLA
REGNO - 20164017
BATCH - CSA
CONTACT - 8619127663
*/


import java.util.*;
class first
{
    
     public static void main (String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter value of N  ");
        int N= s.nextInt();
        int i;
        
        String name[]=new String[N];
        int age[]=new int[N];
        String dob[]=new String[N];
        String batch[]=new String[N];
        String contact[]=new String[N];
        
        for(i=0;i<N;i++)
        {
            System.out.println("Enter name of student "+(i+1));
            name[i]=s.next();
            System.out.println("Enter age of student "+(i+1));
            age[i]=s.nextInt();
            System.out.println("Enter dob of student "+(i+1));
            dob[i]=s.next();
            System.out.println("Enter batch of student "+(i+1));
            batch[i]=s.next();
            System.out.println("Enter contact of student "+(i+1));
            contact[i]=s.next();
        }
        System.out.println("Displaying information");
            for(i=0;i<N;i++)
        {
            System.out.println("Name of student "+(i+1)+" "+name[i]);
           
            System.out.println("Age of student "+(i+1)+" "+age[i]);
            
            System.out.println("DOB of student "+(i+1)+" "+dob[i]);
           
            System.out.println("Batch of student "+(i+1)+" "+batch[i]);
           
            System.out.println("Contact of student "+(i+1)+" "+contact[i]);
          
        }
        
        
    }
}

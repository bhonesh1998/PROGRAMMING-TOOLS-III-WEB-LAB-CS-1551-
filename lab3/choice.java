import java.util.*;
class choice
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i;
System.out.println("What is the command keyword to exit loop in java?");
System.out.println("a:Int");
System.out.println("b:Continue");
System.out.println("c:break");
System.out.println("d:Exit");
char c=sc.next().charAt(0);
while(true)
{

switch(c)
{
case 'a':
case 'b':
case 'd':System.out.println("Wrong Answer");
break;
case 'c':System.out.println("Correct");
break;
default:System.out.println("Invalid option");
break;
}

if(c=='c')
break;

c=sc.next().charAt(0);
}

}
}




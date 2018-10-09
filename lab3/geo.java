import java.util.*;
class geo
{
public static void main(String[] args)
{
double r,a,n;
Scanner sc=new Scanner(System.in);
a=sc.nextDouble();
r=sc.nextDouble();
n=sc.nextDouble();
int i;
for(i=0;i<n;i++)
{
System.out.print(a+" ");
a=a*r;
}
}
}

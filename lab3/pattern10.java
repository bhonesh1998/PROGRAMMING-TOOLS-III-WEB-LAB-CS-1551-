class pattern10
{
public static void main(String[] args)
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<=5;j++)
{

if(i==j||i+j==6)
System.out.print("$");

else if(i==1||j==1||j==5||i==5)
System.out.print("*");

else
System.out.print(" ");
}
System.out.println();
}
}
}

class pattern
{
public static void main(String[] args)
{
int i,j;
for(i=1;i<=7;i++)
{
for(j=1;j<=7;j++)
{
if(j<=i)
System.out.print(j);
else
System.out.print('*');
}
System.out.println();
}
}
}

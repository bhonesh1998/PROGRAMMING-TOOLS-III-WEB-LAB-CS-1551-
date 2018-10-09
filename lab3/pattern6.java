class pattern6
{
public static void main(String[] args)
{
int i,j,y;
char c='A';
for(i=7;i>=1;i--)
{
for(j=0;j<i;j++)
{
System.out.print((char)(c+j));
}
int x=7-i;
for(j=1;j<=2*x-1;j++)
System.out.print(" ");
if(i==7)
y=6;
else
y=i;
for(j=y-1;j>=0;j--)
{
System.out.print((char)(j+c));
}
System.out.println();
}
}
}


import java.util.*;
class matrix
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a,b,m,n,k,i,j;
System.out.println("Enter the dimensions of matrixes");
a=sc.nextInt();
b=sc.nextInt();
m=sc.nextInt();
n=sc.nextInt();
int x[][]=new int[a][b];
int y[][]=new int[m][n];
System.out.println("Enter First matrix");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
x[i][j]=sc.nextInt();
}
}

System.out.println("Enter Second matrix");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
y[i][j]=sc.nextInt();
}
}
int z[][]=new int[a][n];

for(i=0;i<a;i++)
{
for(j=0;j<n;j++)
{
for(k=0;k<m;k++)
{
z[i][j]+=x[i][k]*y[k][j];
}
}
}
for(i=0;i<a;i++)
{
for(j=0;j<n;j++)
{
System.out.print(z[i][j]+"  ");
}
System.out.println();
}
}
}

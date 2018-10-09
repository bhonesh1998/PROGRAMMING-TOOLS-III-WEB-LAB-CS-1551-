import java.util.*;

public class second{
double[][] sales;
second()
{

sales=new double[6][4];
int i,j;
System.out.println("enter data:");
for(i=0;i<6;i++)
{
System.out.println("For division"+(i+1)+":");
input(i);
}
}

void input(int i)
{ int j; Scanner sc=new Scanner(System.in);
for(j=0;j<4;j++)
{
sales[i][j]=sc.nextDouble();
}
}

void display_div(int i)
{
System.out.println("Sales of division"+i+":");
int j;
for(j=0;j<4;j++)
System.out.print(sales[i-1][j]+" ");
}

void change(int i)
{
int j;
System.out.println("Changes in sales for division "+i+":");
for(j=1;j<4;j++)
System.out.print(sales[i-1][j]-sales[i-1][j-1]+" ");
}

void total_qua(int i)
{
System.out.print("Sales for quator "+i+":");
int j; double total=0.0;
for(j=0;j<6;j++)
total=total+sales[j][i-1];
System.out.println(total);
}

void averagesales()
{
int i,j;
for(i=0;i<6;i++)
{
double total=0;
int t=i+1;
for(j=0;j<4;j++)
total+=sales[i][j];
total/=4;
System.out.println("Average sales for division "+t+":"+total);
}

}

void heighestsale()
{
int i,j;
for(i=0;i<4;i++)
{
int t=i+1; int k=0;;
double tot=-1.0;
for(j=0;j<6;j++)
if(sales[j][i]>tot)
{
tot=sales[j][i]; k=j+1;
}
System.out.println("heighest sale in quater "+t+":division "+k);

}


}

public static void main(String args[]){
second sec=new second();
int choice=0; int g=0;
Scanner sc=new Scanner(System.in);
System.out.print("\n1.list of sales by division\n2.division increase or decrease\n3.total sales in quater\n4.total average sales\n5.division with heigest sales\n6.exit\nchoice:");
choice=sc.nextInt();
switch(choice)
{
case 1:

for(g=1;g<7;g++)
{
sec.display_div(g);
System.out.println("");
}
break;
case 2:

for(g=1;g<7;g++)
{
sec.change(g);
System.out.println("");
}
break;
case 3:

for(g=1;g<5;g++)
{
sec.total_qua(g);
System.out.println("");
}
break;
case 4:
sec.averagesales(); System.out.println("");
break;
case 5:
sec.heighestsale();System.out.println("");
break;
default:;
}

}

}

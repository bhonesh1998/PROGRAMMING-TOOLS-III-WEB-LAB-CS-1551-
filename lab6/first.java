import java.util.*;

public class first
{
public static void main(String args[])
{
rainfall obj=new rainfall();
obj.totalrain();
obj.average();
obj.maxandmin();
}
}

class rainfall{
double[] rain;
public rainfall()
{ Scanner sc=new Scanner(System.in);
rain=new double[12];
System.out.println("Enter rainfall data: ");
for(int i=0;i<12;i++)
rain[i]=sc.nextDouble();

}

public void totalrain()
{
double total=0.0;
for(int i=0;i<12;i++)
total=total+rain[i];
System.out.println("Total rainfall: "+total);
}

public void average()
{
double total=0.0;
for(int i=0;i<12;i++)
total=+rain[i];
total=total/12.0;
System.out.println("average rainfall: "+total);
}
public void maxandmin()
{
double maxi=-1.0; int indMax=0;
double mini=9999.0; int indMin=0;
for(int i=0;i<12;i++)
{
if(rain[i]>maxi)
{maxi=rain[i]; indMax=i+1;
}
if(rain[i]<mini)
{mini=rain[i]; indMin=i+1;
}
}
System.out.println("Month with max rainfall:"+indMax);
System.out.println("Month with min rainfall:"+indMin);
}

}

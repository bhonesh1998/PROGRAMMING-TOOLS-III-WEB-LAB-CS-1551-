import java.util.*;

public class third{

static int getTotal(int arr[],int n)
{
int i;
int total=0;
for(i=0;i<n;i++)
total+=arr[i];
return total;
}

static int getAverage(int arr[],int n)
{
int total=getTotal(arr,n);
total=total/n;
return total;
}

static int getHighest(int arr[],int n)
{
int i;
int hei=-1;
for(i=0;i<n;i++)
if(arr[i]>hei)
hei=arr[i];
return hei;

}

static int getLowest(int arr[],int n)
{
int i;
int hei=9999;
for(i=0;i<n;i++)
if(arr[i]<hei)
hei=arr[i];
return hei;

}

public static void main(String[] args){
int arr[]={2,4,5,7,11,76,32,1,54,10};
int n=10;
int total=getTotal(arr,n);
int aver=getAverage(arr,n);
int high=getHighest(arr,n);
int low=getLowest(arr,n);
System.out.println("Array:");
int k;
for(k=0;k<n;k++)
System.out.print(arr[k]+" ");
System.out.println("\nTotal:"+total+"\nAverage:"+aver+"\nHighest:"+high+"\nlowest:"+low);
}

}

import java.util.*;
import java.math.*;


class sol
{
int i ,j ;
    int m,n;
    sol(int a1 , int b1)
    {
        m=a1;n=b1;
    }
    
    int sum(int [][] b)
    {
        int ans =0,i,j;
           for(i=0;i<m;i++)
	    {
	        for(j=0;j<n;j++)
	        {
	            ans+=b[i][j];
	        }
	    }
	 return ans;
    }
    
    double avg(int [][]b)
    {
        double p = (double)sum(b)/(m*n);
        return p;
    }
    
    int totrow(int [][]b,int x)
    {
        int ss = 0;
        for(j=0;j<n;j++)
        ss+=b[x][j];
        
        return ss ; 
    }
     int totcol(int [][]b,int x)
    {
        int ss = 0;
        for(j=0;j<m;j++)
        ss+=b[j][x];
        
        return ss ; 
    }
    int maxrow(int [][]b,int x)
    
    {
        int p = Integer.MIN_VALUE;
         for(j=0;j<m;j++)
        {
            if(b[x][j]>p)
                p=b[x][j];
            
        }
        return p ;
        
    }
    int minrow(int [][]b,int x)
    {
        int p = Integer.MAX_VALUE;
         for(j=0;j<m;j++)
        {
            if(b[x][j]<p)
                p=b[x][j];
            
        }
        return p ;
        
    }
    
    
    
}



class q4
{ 
	public static void main (String[] args) 
	{ 
	    System.out.println("enter size of array");
	    Scanner s = new Scanner(System.in);
	    int m = s.nextInt();
	    int n = s.nextInt();
	    int i,j;
	    int a[][]= new int[m][n];
	    for(i=0;i<m;i++)
	    {
	        for(j=0;j<n;j++)
	        {
	            a[i][j]=s.nextInt();
	        }
	    }
	 
	    sol ob = new sol(m,n);
	    System.out.println("total of array is");
	    System.out.println(ob.sum(a));
	     System.out.println("average of array is");
	    System.out.println(ob.avg(a));
	    int aa ;
	     System.out.println("enter row number (0-based)");
	      aa = s.nextInt();
	      System.out.println("row total of array is");
	    System.out.println(ob.totrow(a,aa));
	    
	      System.out.println("enter column number (0-based)");
	     aa = s.nextInt();
	      System.out.println("column total of array is");
	    System.out.println(ob.totcol(a,aa));
	    
	    System.out.println("enter row number (0-based) (to get maximum of row )");
	     aa = s.nextInt();
	      System.out.println("row max of array is");
	    System.out.println(ob.maxrow(a,aa));
	    
	       System.out.println("enter row number (0-based) (to get minimum of row )");
	     aa = s.nextInt();
	      System.out.println("row min of array is");
	    System.out.println(ob.minrow(a,aa));
	    
	    
	    
	   
	    
	} 
}


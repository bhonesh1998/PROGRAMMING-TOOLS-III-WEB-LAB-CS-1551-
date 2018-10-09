/*
NAME - BHONESH CHAWLA
REGNO - 20164017
BATCH - CSA
CONTACT - 8619127663
*/




import java.util.*;

class Employee
{
            	private int id;
             	private int w;
             	private int pay;
                private int wage;
                public void getdata()
                {
                    Scanner sc=new Scanner(System.in);
                    this.id=sc.nextInt();
                    this.w=sc.nextInt();
                    this.pay=sc.nextInt();
                    this.wage=this.calcu(w,pay);
                }
              public int calcu(int hour,int sal)
               {
                   return sal*(hour*7)*52/12;
               }
              public void showData()
                {
                System.out.println("My id is "+this.id+" and my wage is "+this.wage);
		}
}
class fifth
{
           public static void main(String args[])
           {
             Employee info[]=new Employee[4];
             for(int i=0;i<4;i++)
                {
                  System.out.println("the data of the "+(i+1)+" employee");
                  info[i]=new Employee();
                  info[i].getdata();
                }
               for(int i=0;i<4;i++)
                info[i].showData();
          }
   }

/*
NAME - BHONESH CHAWLA
REGNO - 20164017
BATCH - CSA
CONTACT - 8619127663
*/

import java.util.*;
class eighth
{

	static char grd(double sc)
	{
		if(sc>=90 && sc<=100)
		return 'A';
		else if(sc>=80 && sc<=89)
		return 'B';
		else if(sc>=70 && sc<=79)
		return 'C';
else if(sc>=60 && sc<=69)
		return 'D';
else if(sc>=40 && sc<=59)
		return 'E';
else if(sc>=0 && sc<=39)
		return 'F';
	return 0;	
}

	public static void main(String a[])
	{
		Scanner s = new Scanner(System.in);
		char grades[]=new char[5];
		String name[]=new String[5];
		Double avg[]=new Double[5];
		Double t1[]=new Double[4];
		Double t2[]=new Double[4];
		Double t3[]=new Double[4];
		Double t4[]=new Double[4];
		Double t5[]=new Double[4];
		int i=0,j,x=0;
		
		for(i=0;i<5;i++) avg[i]=0.00;
		i=0;
		name[i]=s.next();
		i++;
		for(j=0;j<4;j++)
		{t1[j]=s.nextDouble();avg[x]+=t1[j];}
		x++;
name[i]=s.next();
		i++;
		for(j=0;j<4;j++)
		{t2[j]=s.nextDouble();avg[x]+=t2[j];}x++;
name[i]=s.next();
		i++;
		for(j=0;j<4;j++)
		{t3[j]=s.nextDouble();avg[x]+=t3[j];}x++;
name[i]=s.next();
		i++;
		for(j=0;j<4;j++)
		{t4[j]=s.nextDouble();avg[x]+=t4[j];}x++;
name[i]=s.next();
		i++;
		for(j=0;j<4;j++)
		{t5[j]=s.nextDouble();avg[x]+=t5[j];}

		for(i=0;i<5;i++)
		avg[i]=avg[i]/4;
		
		for(i=0;i<5;i++)
		{
			grades[i]=grd(avg[i]);
		}

		
		for(i=0;i<5;i++)


		{
		System.out.println("name is "+name[i]+" score is "+avg[i]+" grade is :"+grades[i]);
		
		}














	}


}

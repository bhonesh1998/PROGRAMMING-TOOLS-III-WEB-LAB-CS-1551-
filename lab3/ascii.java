class ascii
{
public static void main(String[] args)
{
int i,c=1;
for(i=0; ;i++)
{
System.out.print((char)(c)+"  ");
if(c%10==0)
System.out.println();
if(c==122)
break;
c++;
}
}
}


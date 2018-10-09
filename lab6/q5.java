import java.util.*;

class qu
{
    String ques,o1,o2,o3,o4;
    int ans;
    
    qu(String ques,String o1 , String o2 , String o3 , String o4 , int ans)
    {
        this.ques=ques;
        this.o1=o1;
        this.o2=o2;
        this.o3=o3;
        this.o4=o4;
        this.ans=ans;
    }
    String display()
    {
    	String s = ques + "\n" + o1 + "\n" + o2 + "\n" + o3 + "\n" + o4 +"\n";
    
    	return s ;
    }
    boolean check()
    {
    	System.out.println("Enter any option (1/2/3/4)");
    	Scanner s = new Scanner(System.in);
    	int op = s.nextInt();
    	if(op==ans) return true; else return false;
    	
    }
}



class q5 
{ 
	public static void main (String[] args) 
	{ 
	   // qu obj[] = new qu[1] ;
	   // obj[0]={"first","a","b","c","d",1};
	ArrayList<qu > list = new ArrayList<>(10);
	list.add(new qu("first","a","b","c","d",1));
	list.add(new qu("second","a","b","c","d",2));
	list.add(new qu("third","a","b","c","d",3));
	list.add(new qu("fourth","a","b","c","d",4));
	list.add(new qu("fifth","a","b","c","d",3));
	list.add(new qu("sixth","a","b","c","d",2));
	list.add(new qu("seventh","a","b","c","d",1));
	list.add(new qu("eigth","a","b","c","d",4));
	list.add(new qu("nineth","a","b","c","d",1));
	list.add(new qu("tenth","a","b","c","d",2));
	int one , two ;
	one = two =0;
		for(int i=0;i<5;i++)
		{
			System.out.println(list.get(i).display());
			if(list.get(i).check()) one++;
		}
		for(int i=5;i<10;i++)
		{
			System.out.println(list.get(i).display());
			if(list.get(i).check()) two++;
		}
		if(one>two) System.out.println("one is winner");
		else if(two>one) System.out.println("two is winner");
		else System.out.println("tie");
	} 
}


import java.util.Scanner;


public class sort {

	static int top;
	static int max=5;
	static int a[]=new int[max];
	int z[]=new int[5];
	static int i;
	int x;
	sort()
	{
		top=-1;
	}
	public void push(int s)
	{
		if(top>(max-1))
		{
			System.out.println("Overflow");
		}
		else
		{
			++top;
			a[top]=s;
			System.out.println("Inserted "+a[top]);
			
		}
		
	}
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
		}
		else
		{
			
			x=a[top];
		
			--top;
		}
		return x;	
		}
		
	
	
	public void Sort()
	{
        
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[j]>a[i]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			
		}
	}
		
		System.out.println("After sorting :");
		System.out.println("top-->"+a[top]);	
		for(int i=0;i<5;i++){
			z[i]=pop();
			System.out.println(z[i]);
			
		}
	    
		
	}
	
	public static void main(String[] args) {
	sort s=new sort();
	Scanner sc=new Scanner(System.in);
	while(i<5){
	int d=sc.nextInt();
	s.push(d);
	i++;
	}
    s.Sort();

  
}
}

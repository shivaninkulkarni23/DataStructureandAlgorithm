import java.util.Scanner;


public class reverse {

	static int max=10;
	static int a[]=new int[max];
	static int top=-1;
	reverse()
	{
		top=-1;
	}
	void push(int s)
	{
		if(top>(max-1))
		{
			System.out.println("Stack overflow");
		}
		else
		{
			++top;
			a[top]=s;
			
		}
	}
	void pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			try{
			int i=max-1;
			while(i!=0)
		{
			int x=a[top];
			System.out.println("Deleted element:"+x);
			--top;
			i--;
			
		}
			pop();
			push(top);
		}
			catch(Exception e)
			{
				System.out.println();
			}
	}
	}
	public static void main(String[] args) {
		reverse r=new reverse();
		Scanner sc=new Scanner(System.in);
		int i=0;
	while(i!=5)
	{
		int n=sc.nextInt();
		r.push(n);
		i++;
	}
		r.pop();
		if(top==-1)
			System.out.println("Underflow");
		else
		System.out.println("top--->"+a[top]);
	}

}

import java.util.Scanner;

public class stack {

	static int top;
	 static int max=5;
	static int a[]=new int[max];
	public stack() {
	top=-1;
	}
	public int whattop()
	{
	 	return a[top];
	}
	public void push(int s)
	{
		if(top>=(max-1))
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			a[++top]=s;
			System.out.println("Now top is :"+s);
		}
	}
	public void pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			int x=a[top];
			System.out.println("Deleted element:"+x);
			--top;
		}
	}
	

	public static void main(String[] args) {
		stack st=new stack();
		Scanner sc=new Scanner(System.in);
		int op;
		do
		{
		System.out.println("Enter Choice :");
		System.out.println("\n1.Know top\n2.push\n3.pop");
		op=sc.nextInt();
		switch(op)
		{
		case 1:
			if(a[top]>-1){
		System.out.println(st.whattop());}
		break;
		case 2:
		int f=sc.nextInt();
		st.push(f);
		break;
		case 3:
		st.pop();
		break;
		}
		}while(op!=4); 

	}

}

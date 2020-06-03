
import java.util.Scanner;


public class implement {
	int rear,front;
	int max=5;
	int a[]=new int[max];
	public implement() {
	rear=-1;
	front=-1;
	}
	public void enqueue(int s)
	{
		if(rear==-1&&front==-1)
		{
			rear=front=0;
			a[rear]=s;
		}
		else if(rear==(max-1))
		{
			System.out.println("Overflow..");
		}
		else
		{
			++rear;
			a[rear]=s;
		}
	}
	public void dequeue()
	{
		if(front==-1&&rear==-1){
			System.out.println("Underflow..");
		}
		else if(rear==front)
		{
			rear=-1;
			front=-1;
		}
		else
		{
			++front;
			System.out.println("Element dqueued..");
		}
		
	}
	public void display()
	{
		if(front==-1&&rear==-1)	
		{
			System.out.println("Underflow..");
		}
		else
		{
		for(int i=front;i<=rear;i++)
			{
			System.out.print(" "+a[i]);
			}
		System.out.print("front :"+a[front]);
		System.out.println("rear :"+a[rear]);
		}
	}
	public static void main(String arr[])
	{
		implement i=new implement();
		Scanner sc=new Scanner(System.in);
		int d;
		for(int j=0;j<5;j++)
		{
			d=sc.nextInt();
			i.enqueue(d);
		}
		i.display();
		i.dequeue();
		i.display();
	}

}

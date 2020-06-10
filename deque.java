import java.util.Scanner;


public class deque {
	int rear;
	int front;
	int max=10;
	int a[]=new int[max];
	deque()
	{
		rear=-1;
		front=-1;
	}
	public void insertatfront(int data)
	{
		// If queue is initially empty 
        if (front == -1) 
        { 
            front = 0; 
            rear = 0; 
        } 
          
        // front is at first position of queue 
        else if (front == 0) 
            front = max - 1 ; 
   
        else // decrement front end by '1' 
            front = front-1; 
   
        // insert current element into Deque 
        a[front] = data ; 
	}
	public void deleteatfront()
	{
		if(front==-1&&rear==-1){
			System.out.println("Underflow");
		}
		else
		{
			++front;
		}
	}
	public void traverse()
	{
	
		for(int i=front;i<=rear;i++)
			System.out.println(a[i]);
	}
	
	public void insertatrear(int data)
	{
		if(front==-1&&rear==-1)
		{
			System.out.println("Inserting at first position");
			front=0;
			rear=0;
			a[rear]=data;
		}
		else
		{
			++rear;
			a[rear]=data;
		}
	}
	public void deleteatrear()
	{
		if(rear==-1&&front==-1)
			System.out.println("Underflow");
		else
			--rear;
	}
	
	public static void main(String arr[])
	{
		deque d=new deque();
		Scanner sc=new Scanner(System.in);
		int op;
		do
		{
		System.out.println("Enter option :");
		System.out.println("\n1.insert at front\n2.delete at front\n3.traverse\n4.insertatrear\n5.deleteatrear");
		op=sc.nextInt();
		switch(op)
		{
		case 1:
			int dt=sc.nextInt();
			d.insertatfront(dt);
			
			break;
		
		case 2:
			d.deleteatfront();
			break;
		case 3:
			d.traverse();
			break;
		case 4:
			 dt=sc.nextInt();
			d.insertatrear(dt);
			break;
		case 5:
			d.deleteatrear();
			break;
		}
	}while(op!=6);

}
}

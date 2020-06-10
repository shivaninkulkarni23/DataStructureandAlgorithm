
public class priority {
	int max=10;
	int a[]=new int [max];
	int p[]=new int [max];
	int rear,front;
	public priority()
	{
	rear=-1;
	front=-1;
	}
	public void insert(int n,int pr)
	{
		if(rear>max)
		{
			System.out.println("Overflow");
		}
		if(front==-1&&rear==-1)
		{
			front=0;
			rear=0;
			a[rear]=n;
			p[rear]=pr;
		}
		else
		{
			++rear;
			int d=rear;
			a[rear]=n;
			p[d]=pr;

		}

	}
		
	public void delete()
	{
		int f = 0;
		if(front==-1&&rear==-1)
		{
			System.out.println("Empty");
		}
	
			
			 f=a[front];
			  ++front;

			  traverse();
		System.out.println("Deleted: "+f);
		
	}
	
	public void traverse()
	{
		
		for(int i=rear-1;i>=front;i--)
		{
			if(p[i]>=p[i+1])
			{
				int p1=a[i+1];
				int p2=a[i];
				a[i+1]=p2;
				a[i]=p1;
			}
		}
for(int i=front;i<=rear;i++)
{
	System.out.print(a[i]+" ");
}
System.out.print("\n");
for(int i=0;i<=rear;i++)
{
	System.out.print(i+"  ");
}
	System.out.println("rear "+a[rear]+" "+"front: "+a[front]);
}
	
	
	public static void main(String[] args) {
		priority p=new priority();
		
		p.insert(30,0);
		p.insert(10,2);
    	p.insert(20,1);
		p.insert(70,3);
		p.insert(50,4);
		p.insert(60,5);
		p.traverse();
		p.delete();
		
	}
}

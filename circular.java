class circular{
	Node root;
	Node head;
	Node last;
	class Node{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void insert(int new_data)
	{	
		 Node newNode = new Node(new_data);
		 
		   if(head==null)
			   head=newNode;
		   else
		     last.next=newNode;
		   	last=newNode;
		   	 last.next=head;
		}
	public void delete(Node n)
	{
		if(head==null)
			System.out.println("Empty");
		
		Node tnode=head;
		n.next=n.next.next;
		head=last.next;
	}

	public void traverse()
	{
		Node tnode=head;
		do
		{
			System.out.print(tnode.data+"-> ");
			tnode=tnode.next;
		}while(tnode!=head);
	}
	public static void main(String arr[])
	{
		circular c=new circular();
		c.insert(10);
		c.insert(20);
		c.insert(30);
		c.insert(40);
		c.traverse();
		c.delete(c.head.next.next.next);
		System.out.println("\n");
		c.traverse();
	}
}
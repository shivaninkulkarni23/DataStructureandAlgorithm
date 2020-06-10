import org.omg.CORBA.PUBLIC_MEMBER;

import sun.net.www.content.text.plain;


 class Doublylinked {
  Node root;
  
  Node head;
 class Node{
	 int data;
	 Node prev;
	  Node next;

	  Node(int data)
	  {  
		  this.data=data;
		  next=null;
		  prev=null;
	  }
	  
  }
 public void duplicate(int data)
 {
	 try{
	 Node last=head;
	 while(last!=null)
	 {
		 if(data==last.data)
		 {	 
		
		 delete(last.prev);
		 break;
		 }
		 last=last.next;
	 }
	 }
	 catch(Exception e){System.out.println("\nUnique Element");}
 }
	public void insert(int new_data)
	{
		Node new_node=new Node(new_data);

		if(head==null)
		{
		head=new_node;
		head.prev=null;
		head.next=null;
		}
		else
		{
			head.prev=new_node;
			new_node.next=head;
			new_node.prev=null;
			head=new_node;
		}
	}
	public void delete(Node node){
		System.out.println("Deleted duplicate :"+node.next.data);
		Node last=head;
		node.next=node.next.next;
		node.next.prev=null;
		
	}
	
		public void traverse(Node node)
		{
			 Node last = null; 
			 System.out.println(" "); 
		        while (node != null) { 
		            System.out.print(node.data + "-> "); 
		            last = node; 
		            node = node.next; 
		        }
		        
		}
	public static void main(String[] args) {
	Doublylinked d=new Doublylinked();
	d.insert(10);
	d.insert(60);
	d.insert(20);
	d.insert(10);
	d.insert(30);
	d.insert(40);
	d.traverse(d.head);
	d.duplicate(50);
	d.traverse(d.head);
	
	}

}

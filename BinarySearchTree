
public class Binsearchtree {
Node root;

class Node
{
	int key;
	Node left,right;
	Node(int key)
	{
	this.key=key;
	left=right=null;
	}
}
public Binsearchtree() {
root=null;
}
void insert(int key)
{
root=inserrec(root,key);	
}
Node inserrec(Node root,int key)
{
	if(root==null)
	{
		root=new Node(key);
		return root;
	}
	if(key<root.key)
		root.left=inserrec(root.left, key);
	else if(key>root.key)
		root.right=inserrec(root.right, key);
	
	return root;
}
void inorder()
{
	inorderRec(root);
}
void inorderRec(Node root)
{
	while(root!=null)
	{
		inorderRec(root.left);
		System.out.println(root.key);
		inorderRec(root.right);
	}
}
void deletekey(int key)
{
	root=deleterec(root,key);
}
Node deleterec(Node root,int key)
{
	if(root==null)
	{
		return root;
	}
	else if(key>root.key)
	{
		root.right=deleterec(root.right,key);
	}
	else if(key<root.key)
	{
		root.left=deleterec(root.left,key);
	}
	else
	{
		if(root.left==null)
		{
			return root.right;
		}
		if(root.right==null)
		{
			return root.left;
		}
	root.key=minval(root.right);
	root.right=deleterec(root.right, root.key);
	}
	return root;
}
int minval(Node root)
{
	int minval=root.key;
	while(root.left!=null)
	{
		minval=root.left.key;
		root=root.left;
	}
	return minval;
}

public static void main(String arr[])
{
	BinarySearchTree tree=new BinarySearchTree();
	tree.insert(50); 
	tree.insert(30); 
	tree.insert(20); 
	tree.insert(40); 
	tree.insert(70); 
	tree.insert(60); 
	tree.insert(80); 
	
	tree.deleteKey(50);
	System.out.println("Deleted 50");
	tree.inorder(); 
	tree.deleteKey(50);
	System.out.println("Deleted 80");
	tree.deleteKey(80);
	// print inorder traversal of the BST 
	tree.inorder(); 
}
}

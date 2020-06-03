import java.util.Scanner;


public class LinearSearch {
	public void search(int arr[],int s)
	{
		int f=0;
	    int count=0;
		for(int i=0;i<5;i++)
		{
			if(arr[i]==s)
			{
				f=1;
				count=i+1;
			}
		}
		if(f==1)
			System.out.println("Element found at :"+count);
		else
			System.out.println("Not found");
	}
	public static void main(String[] args) {
		LinearSearch li=new LinearSearch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array :");
		int arr[]=new int[10];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to be search :");
		int s=sc.nextInt();
		li.search(arr,s);
		
	}

}

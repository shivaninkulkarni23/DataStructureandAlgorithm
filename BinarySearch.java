import java.util.Scanner;


public class Binarysearch {

	public void search(int arr[],int s)
	{
		int count=0;
		int f=0;
		int mid;
		int beg=0;
		int end=arr.length;
		mid=beg+end/2;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[mid]==s)
				{f=1;
				count=mid+1;
				}
			
			else
			{
			if(s>mid)
				end=mid-1;
			else
				end=mid+1;
		}
		}
		if(f==1)
			System.out.println("found at: "+count);
		else
			System.out.println("Not found");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		int s=sc.nextInt();
		Binarysearch bi=new Binarysearch();
		bi.search(arr,s);

	}

}

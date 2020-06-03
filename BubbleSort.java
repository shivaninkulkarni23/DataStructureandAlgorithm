import java.util.Scanner;


public class bubblesort {

	public int[] sort(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		bubblesort bb=new bubblesort();
		int sorted[]=new int[5];
		sorted=bb.sort(arr);
		System.out.print("Sorted array:");
		for(int i=0;i<5;i++)
		{
			System.out.println(sorted[i]);
		}
		
	}

}

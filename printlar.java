package array1;

public class printlar {
	static void printlargest(int arr[],int n)
	{
		int i,first = 0,second=0,third=0;
		if(n<3)
		{
			System.out.println("invalid input");
			return;
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]>first)
			{
				third=second;
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second)
			{
				third=second;
				second=arr[i];
			}
			else
			{
				third=arr[i];
		    }
			
	}
		System.out.println("three largest numbers are"+first+" "+second+" "+third);
}

	public static void main(String[] args) {
		   int arr[] = { 12, 13, 1, 10, 34, 1 };
		   int n=arr.length;
		   printlargest(arr,n);
		
	}

}

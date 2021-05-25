package array1;

public class countpairs {
	public static void countsum(int arr[], int n)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int sum = 0;
				if((arr[i]+arr[j])==n)
					count++;
			}
		}
		System.out.println("count:"+count);
	}

	public static void main(String[] args) {
		int sum=6;
		int arr[]= {1, 5, 7, -1};
		countsum(arr,sum);
	
	}

}

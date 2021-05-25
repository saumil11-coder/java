package array1;

public class gettingmissingno {
	static int missingno(int arr[],int n)
	{
		int total=1;
		for(int i=2;i<=(n+1);i++)
		{
			total+=i;
			total=total-arr[i-2];
		}
		return total;
	}

	public static void main(String[] args) {
	 int arr[]= {1,2,3,5};
	 int n=arr.length;
	 System.out.println("missing no is"+missingno(arr,n));

	}

}

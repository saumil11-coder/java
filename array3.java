package array1;

public class array3 {
	static void reversearray(int arr[], int start ,int end)
	{
		int temp;
		while(start<end) 
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void printarray(int arr[],int size)
	{
		for(int i=0;i<size;i++) 
		{
			System.out.println(arr[i]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,12,3,4,5,5};
		printarray(arr,6);
		reversearray(arr,0,5);
		printarray(arr,6);
	
	}

}

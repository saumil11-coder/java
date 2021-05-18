package array1;
import java.io.*;
public class array7 {
	static void  countzot(int arr[], int arr_size)
	{
		int lo=0,mid = 0,temp=0;
		int high=arr_size-1;
	while (mid<=high)
		{
			switch(arr[mid])
			{
			case 0:{
				temp=arr[lo];
				arr[lo]=arr[mid];
				arr[mid]=temp;
				lo++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
				break;
			}
			
			}
			
		}
	
	}
	static void printarray(int arr[],int n)
	{
		int i=0;
		for(i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[]=new int[] {2,1,1,0,0,2};
		System.out.println("before sorting");
		printarray(arr,6);
		countzot(arr,6);
		System.out.println("after sortring ");
		printarray(arr,6);
		
	

	}

}

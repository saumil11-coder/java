package array1;
import java.io.*;

public class array2 {
	static int getmin( int arr[] ,int n) {
		int res=arr[0];
		for(int i=0;i<n;i++) {
			res= Math.min(res, arr[i]);
		}
		return res;
	}
	static int getmax(int arr[] , int n)
	{
		int res=arr[0];
		for(int i=0;i<n;i++)
		{
			res=Math.max(res,arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
	int arr[]= {12,1234,45,67,1};
	int n=arr.length;
	System.out.println("min element "+getmin(arr,n));
	System.out.println("max element"+getmax(arr,n));
	}

}

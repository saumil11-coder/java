package array1;
import java.io.*;
public class maxproductsubarray {
	static int maxsubarrayproduct(int arr[])
	{
		int result=arr[0];
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				result=Math.max(result, arr[i]);
				arr[i]*=arr[j];
			
			}
			result=Math.max(result, arr[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		 int arr[] = { 1, -2, -3, 0, 7, -8, -2 };
		 System.out.println("answer is "+maxsubarrayproduct(arr));
	}

}

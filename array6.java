package array1;
import java.io.*;

public class array6 {
public static int frequency(int arr[],int x,int n) {
	int count=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==x)
			count++;
			}
	return count;
}

	public static void main(String[] args) {
		int arr[]=new int[] {1,4,4,4,5,6};
		int x=4;
		int n=arr.length;
		System.out.println("frequency of given number is:"+frequency(arr,x,n));

	}

}

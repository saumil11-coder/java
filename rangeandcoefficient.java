package array1;
import java.io.*;


public class rangeandcoefficient {
	static float getmax(float arr[],int n)
	{
		float res= arr[0];
		for(int i=0;i<n;i++)
		{
			res=Math.min(res,arr[i]);
			
		}
		return res;
		
	}
	static float getmin(float arr[], int n)
	{
		float res=arr[0];
		for(int i=0;i<n;i++)
		{
			res=Math.max(res, arr[i]);
		}
		return res;
	}
	static void findrangeandcoefficient(float arr[],int n)
	{
		float max=getmax(arr,n);
		float min=getmin(arr,n);
		float range=max-min;
		float coefficeintofrange = range/(max+min);
		System.out.println("range"+range);	
		System.out.println("coefficientofrange"+ coefficeintofrange);
		}
	

	public static void main(String[] args) {
		float[]  arr= {5,10,15};
		int n=arr.length;
		findrangeandcoefficient(arr,n);

}
}
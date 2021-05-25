package array1;

import java.util.List;

public class repeating {
	 static void printrepeating(int arr[],int size)
	{
		int i;
		System.out.println("the repeating elements are:");
		for(i=0;i<arr.length;i++)
		{
			int j=Math.abs(arr[i]);
			if(arr[j]>=0)
				arr[j]=-arr[j];
			else {
				System.out.println(j+" ");
			}
		}
		
		
	}
	public static void main(String[] args) {
		repeating duplicate=new  repeating();
		 int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
		 int size=arr.length;
		 printrepeating(arr,size);
		

	}

}

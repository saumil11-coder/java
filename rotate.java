package array1;
import java.util.Arrays;
public class rotate {

 static 	int arr[]=new int[] {1,6,7,5,3,5,};
	static void rotation()
	{
		int i=0, j= arr.length-1;int temp;
		while(i!=j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
		}
	}
	public static void main(String[] args) {
	System.out.println("given array is");
	System.out.println(Arrays.toString(arr));
	rotation();
	System.out.println("rotated array is ");
	System.out.println(Arrays.toString(arr));
	}

}

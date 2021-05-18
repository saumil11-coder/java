package array1;
import java.util.Arrays;
import java.util.Collection;

public class array5 {
 public static  int kthsmallest(int []arr,int k)
{
	Arrays.sort(arr);
	return arr[k-1];
}

	public static void main(String[] args) {
		int []arr=new int[] {1,4,5,2,3,7};
		int k=2;
		System.out.println("kthsmalles:"+kthsmallest(arr,k));

	}

}

package array1;
import java.util.*;

public class array1 {
	static boolean findxinksize(int N,int []arr,int x,int k) {
		int i;
		boolean b=false;
		for(i=0;i<N;i=i+k) {
			for(int j=0;j<k;j++) {
				if(i+j<N && arr[i+j]==x)
					break;
				if(j==k)
					return false;
				if(i+j>=N) 
					return false;
			}
		}
		if(i>=N)
			return true;
		else return b;
		
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 3, 5, 2, 4,  9,  3,
                1, 7, 3, 11, 12, 3 };
	int x=3,k=4;
	int n=arr.length;
	if(findxinksize(n,arr,x,k))
		System.out.println("yes");
	else
		System.out.println("NO");
	}

}

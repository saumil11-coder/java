package array1;

public class findintersection {
	static void printintersection(int arr1[] , int arr2[], int m, int n) {
		int i=0;int j=0;
		while(i<m&&j<n)
		{
			if(arr1[i]<arr2[j])
				i++;
			else if(arr2 [j]< arr1[i])
				j++;
			else {
				System.out.println(arr2[j]+" ");
				i++;
			}
		}
	}

	public static void main(String[] args) {
int arr1[]= {3,6,7,8,9};
int arr2[]= {4,6,7,8,5};
int m=arr1.length;
int n=arr2.length;
printintersection(arr1,arr2,m,n);

	}

}

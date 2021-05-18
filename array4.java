package array1;

public class array4 {

    public static void main(String[] args) {
        
        int []arr=new int[] {9,7,5,4,3};
        int temp=0;
        System.out.println("orignal array");
        for(int i=0;i<arr.length;i++) 
        {
            System.out.println(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            
        }
        System.out.println();

        System.out.println("sorted aray");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    } 

}
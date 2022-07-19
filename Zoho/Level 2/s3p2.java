import java.util.Scanner;


public class s3p2 {
    public static void main(String[] args) 
    {
        /*
        Scanner s = new Scanner(System.in);

        System.out.println("Size: "); 
        int size = s.nextInt(), arr[] = new int[size];

        for(int i=0 ; i<size ; i++)
            arr[i] = s.nextInt();

        */

        int[] arr = {1,2,3,4,5,6,7,8,9};
        s3p2 obj = new s3p2();

        arr = obj.sort(arr);
        obj.printArray(arr);
        arr = obj.vinothaSort(arr);
        System.out.println();
        obj.printArray(arr);
    }

    public void printArray(int[] arr)
    {
        for (int i : arr) System.out.print(i + " ");
    }

    public int[] sort(int[] nums)
    {
        int temp = 0;
        for(int i=0 ; i<nums.length ; i++)
        {
            for(int j=i ; j<nums.length-1 ; j++)
            {
                if(nums[j] > nums[j+1]) 
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        return nums;
    }

    public int[] vinothaSort(int[] nums)
    {
        int len = nums.length;
        int[] nums2 = new int[len];

        for(int i=0 ; i<len ; i++)
        {
            if(i%2 == 0) nums2[i] = nums[len-i-1];
            else nums2[i] = nums[i];
        }

        return nums2;
    }

}

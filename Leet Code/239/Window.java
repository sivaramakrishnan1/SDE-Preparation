import java.util.Scanner;

class Window
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Window obj = new Window();
		
		int size = s.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0 ; i < size ; i++)
		{
			arr[i] = s.nextInt();
		}
		
		int k = s.nextInt();
		s.close();
		
		int[] result = obj.maxSlidingWindow(arr, k);
		
		for(int i : result)
			System.out.print(i + " ");
	}
	
	public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr = new int[nums.length - (k - 1)];
		
		for(int i = 0 ; i < arr.length ; i++) {
			int j = 0, curr = Integer.MIN_VALUE;
			
			do {
				if(nums[i+j] > curr)
					curr = nums[i+j];
			}while(++j < k);
			arr[i] = curr;
		}
		
		return arr;
    }
}
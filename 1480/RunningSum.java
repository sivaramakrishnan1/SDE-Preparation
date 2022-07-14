/**
 * RunningSum
 */
public class RunningSum {

    public static void main(String[] args) {
        RunningSum sum = new RunningSum();

        int[] nums = {1,1,2,1,1};
        int[] result = sum.runningSum(nums);

        for (int i : result) System.out.print(i + " ");
    }

    public int[] runningSum(int[] nums) 
    {
        if(nums.length == 1) return nums;
        
        for(int i = 1 ; i < nums.length ; i++)
        {
            nums[i] += nums[i-1];
        }
        
        return nums;
    }
}
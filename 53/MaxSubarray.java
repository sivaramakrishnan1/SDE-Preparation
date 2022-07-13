public class MaxSubarray {
    public static void main(String[] args) {
        MaxSubarray maxsubarr = new MaxSubarray();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsubarr.find(nums));
    }

    public int find(int[] nums)
    {

        if(nums.length == 1) return nums[0];

        int max = Integer.MIN_VALUE , sum = 0;

        for(int i=0 ; i<nums.length ; i++)
        {
            sum = sum + nums[i];
            if(sum < 0) sum = 0;
            if(sum > max) {
                max = sum;
            }
        }        
        return max;
    }
}

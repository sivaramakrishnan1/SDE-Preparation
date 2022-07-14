public class pivot {
    public static void main(String[] args) {
        
        pivot p = new pivot();

        int[] nums = {1,2,3};

        System.out.println(p.pivotIndex(nums));
    }

    public int pivotIndex(int[] nums) 
    {
        int sum = 0, leftsum = 0;
        for(int i : nums) sum += i;
        
        for(int i=0 ; i<nums.length ; i++)
        {
            if(leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}

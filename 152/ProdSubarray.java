public class ProdSubarray {
    public static void main(String[] args) {
        
        ProdSubarray prod = new ProdSubarray();

        int[] nums = {3,-1,4};

        System.out.println(prod.maxProduct(nums));
    }

    public int maxProduct(int[] nums) 
    {
        if(nums.length == 1) return nums[0];

        int max = 0 , sum = 1;

        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] == 0) { sum = 1; continue; }
            else sum = sum * nums[i];
            if(sum > max) {
                max = sum;
            }            
        }        
        return max;
        
    }
}

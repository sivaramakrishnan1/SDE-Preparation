public class poaes {
    public static void main(String[] args) {
        poaes p = new poaes();

        int[] nums = {0,4,0};
        
        nums = p.productExceptSelf(nums);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public int[] productExceptSelf(int[] nums) 
    {
        /*
        *Silly me
        int product = 1, digitCount = 0; boolean zeroPresence = false;
        
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] == 0) zeroPresence = true;
            else 
            { 
                product *= nums[i];
                digitCount++;
            }
        }
        
        int[] answer = new int[nums.length];
        
        product = (digitCount <= 1) ? 0 : product;
        
        if(zeroPresence)
            for( int i=0 ; i<nums.length ; i++)
            {
                if(nums[i] != 0) answer[i] = 0;
                else answer[i] = product;
            }
        else
            for( int i=0 ; i<nums.length ; i++)
            {
                answer[i] = product / nums[i];
            }
            
        return answer;
        */
        int val = 1;
        int zero = 0;
        
        for(int i : nums) 
            if(i != 0) val *= i;
            else zero++;
        
        if(zero == 0)
            for(int i = 0 ; i < nums.length ; i++)
            {
                nums[i] = val / nums[i];
            }
        else if(zero == 1)
            for(int i = 0 ; i < nums.length ; i++)
            {
                if(nums[i] == 0) nums[i] = val;
                else nums[i] = 0;
            }
        else
            for(int i = 0 ; i < nums.length ; i++)
            {
                nums[i] = 0;
            }
        return nums;
        
    }
}

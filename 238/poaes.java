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
    }
}

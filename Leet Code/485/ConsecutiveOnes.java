public class ConsecutiveOnes {
    public static void main(String[] args) {
        ConsecutiveOnes co = new ConsecutiveOnes();
        int[] nums = {1,1,0,1,1,1};
        System.out.println(co.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0 , bigCount = 0;
        int i = 0;
        while(i < nums.length)
        {
            while(i < nums.length && nums[i] == 1) 
            {
                count++;
                i++;
            }
            bigCount = (count > bigCount) ? count : bigCount;
            count = 0;
            i++;
        }

        return bigCount;
    }
}

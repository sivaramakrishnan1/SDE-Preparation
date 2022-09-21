public class LongAscendingSequence {
    public static void main(String[] args) {
        LongAscendingSequence las = new LongAscendingSequence();
        int[] nums = { 1,3,5,4,7 };
        System.out.println(las.findLengthOfLCIS(nums));        
    }

    public int findLengthOfLCIS(int[] nums) {
        int count = 0 , bigCount = 0;
        int i = 0;
        while(i < nums.length)
        {
            while((i < nums.length) && ((i+1) < nums.length) && nums[i] < nums[i+1])
            {
                count++;
                i++;
            }
            bigCount = (count+1 > bigCount) ? count+1 : bigCount;
            count = 0;
            i++;
        }

        return bigCount;
    }
}

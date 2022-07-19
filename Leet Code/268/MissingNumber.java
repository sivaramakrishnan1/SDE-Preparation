/**
 * MissingNumber
 */
public class MissingNumber {

    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();

        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(mn.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        
        for(int i=1 ; i<nums.length ; i++)
        {
            nums[0] += nums[i];
        }
        
        return (((nums.length * (nums.length + 1) / 2))-nums[0]);
    }
}
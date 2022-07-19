import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        
        Duplicate dup = new Duplicate();

        int[] nums = { 1,2,3,5 };
        System.out.println(dup.findDuplicate(nums));
    }

    public boolean findDuplicate(int[] nums)
    {
        /*
         * Works but not for lot of values. time limit exceeded. 
          
        for(int i=0 ; i<nums.length ; i++)
        {
            for(int j=i+1 ; j<nums.length ; j++)
            {
                if(nums[i] == nums[j]) return false;
            }
        }

        return true;
         */
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();

        for (int i : nums) 
        {
            if(map.containsKey(i)) return true;
            else map.put(i, true);
        }
        return false;
        
    }
}

class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2,7,11,15};
        int[] result = ts.twoSum(nums, 9);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++)
            {
                if((nums[i] + nums[j]) == target)
                {
                    ret = new int[]{ i,j };
                    break;
                }
            }
        }
        return ret;

        /* int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result; */
    }
}

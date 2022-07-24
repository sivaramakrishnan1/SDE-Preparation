import java.util.HashMap;

public class s3p5 {
    public static void main(String[] args) {
        s3p5 obj = new s3p5();

        int nums1[] = {2,4,5,6,7,9,10,13} , nums2[] = {2,3,4,5,6,7,8,9,11,15};

        int nums3[] = obj.mergeArrays(nums1 , nums2);
        for (int i : nums3) {
            System.out.print(i);
        }
    }

    public int[] mergeArrays(int[] nums1 , int[] nums2)
    {
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();

        int a1 = 0 , a2 = 0, key = 0;

        while(true)
        {
            if(a1 < nums1.length && map.containsValue(nums1[a1])) 
            {
                map.put(key++ , nums1[a1]);
                a1++;
            }
            if(a2 < nums2.length && map.containsValue(nums2[a2])) 
            {
                map.put(key++ , nums2[a2]);
                a2++;
            }
            if((a1 == nums1.length) && (a2 == nums2.length)) 
                break;
        }

        int[] nums = new int[map.size()];
        key = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = map.get(key++);
        }
        return nums;
    }
}

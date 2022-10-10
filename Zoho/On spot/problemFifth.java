import java.util.Scanner;

public class problemFifth {
    public static int[] sortNumbers(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < size; i++)
            nums[i] = s.nextInt();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] * nums[j] * nums[k] > max)
                        max = nums[i] * nums[j] * nums[k];
                }
            }
        }

        System.out.println(max);
        /*
         * nums = sortNumbers(nums);
         * 
         * int length = nums.length - 1;
         * System.out.println(nums[length] * nums[length - 1] * nums[length - 2]);
         */
    }
}

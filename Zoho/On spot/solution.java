import java.util.Scanner;

class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < size; i++)
            nums[i] = s.nextInt();

        nums = sortNumbers(nums);

        int front = 0, back = size - 1;

        while (front < back)
            System.out.print(" " + nums[front++] + " " + nums[back--]);
            
        if (size % 2 == 1)
            System.out.println(" " + nums[front]);
        s.close();
    }

    public static int[] sortNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
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
}
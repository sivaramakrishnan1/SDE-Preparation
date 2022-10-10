/*
 * 1.) Display all the numbers between 0 and 200 satisfying all the below conditions.

Conditions:

i) Sum of the digits should be 9

ii) Digits should be in ascending order i.e., the digit on the left should be lesser than the digit in the right

For Example: 27 -> 2+7=9 and 2 is less than 7

For Example: 135 -> 1+3+5=9 and 1 is less than 3 is less than 5
 */

public class problemUnknown {

    public static void main(String[] args) {
        int[] arr = solution();
        for (int i : arr) {
            if (i == 0)
                break;
            System.out.print(i + " ");
        }
    }

    public static int[] solution() {
        int[] arr = new int[190];
        int limit = 0;
        arr[limit++] = 9;

        for (int i = 9; i < 201; i+=9) {
            if (checkNumber(i))
                    arr[limit++] = i;
        }
        return arr;
    }

    public static boolean checkNumber(int val) {
        if(val == 9) return true;
        int[] num = new int[5];
        int limit = 0;

        while (val > 0) {
            num[limit++] = (val % 10);
            val = val / 10;
        }
        limit--;

        while (limit >= 1) {
            if (num[limit] < num[limit - 1])
                limit--;
            else
                return false;
        }

        return true;
    }
}
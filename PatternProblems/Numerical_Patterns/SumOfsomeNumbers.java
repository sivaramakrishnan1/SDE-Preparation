/*
 * { 3, 6, 4, 8, 5, 5 }
 * sum of all numbers. but dont add the odd number followed by a even number. 
 */

import java.util.Scanner;

public class SumOfsomeNumbers {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int nums[] = new int[size];

        for(int i=0 ; i<size ; i++) nums[i] = s.nextInt();

        for(int i = 1 ; i < size ; i++)
            if(nums[i] % 2 == 0) nums[0] += nums[i];
            else if(nums[i-1] % 2 != 0) nums[0] += nums[i];

        System.out.println(nums[0]);
        s.close();
    }
}

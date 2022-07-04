
/**
 * wiggle wiggle
 */

import java.util.Scanner;

public class wiggle {

    public static void main(String[] args) {
        // usual initialization
        Scanner s = new Scanner(System.in);

        // problem initialization
        int arr[] = new int[] { 3, 3, 3, 2, 5 };
        System.out.println(doWiggle(arr));

        s.close();
    }

    public static int doWiggle(int ar[]) {
        if (ar.length <= 1) return ar.length; 

        int count = 1, front = 0, back = 1;
        boolean vary = true;

        while (back < ar.length) {
            if( count == 1 && ( ar[back] != ar[front]) )
            {
                vary = (ar[back] > ar[front]);
            }
            if (ar[back] > ar[front] && vary) 
            {
                back++;
                front++;
                count++;
                vary = !vary;
            } 
            else if (ar[back] <= ar[front] && vary) 
            {
                back++;
                front++;
            }
            else if (ar[back] < ar[front] && !vary) 
            {
                back++;
                front++;
                count++;
                vary = !vary;
            } 
            else 
            {
                front++;
                back++;
            }
            if (back == ar.length) break;
        }
        return count;
    }
}
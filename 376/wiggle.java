/**
 * wiggle wiggle
 */

import java.util.Scanner;

public class wiggle {

    public static void main(String[] args) {
        // usual initialization
        Scanner s = new Scanner(System.in);

        // problem initialization
        int arr[] = new int[]{1,17,5,10,13,15,10,5,16,8};
        System.out.println(doWiggle(arr));
        
        s.close();
    }

    public static int doWiggle(int ar[]) {

        if( ar.length <= 2) { return ar.length;}

        int count = 1, front=0,back=1;

        while(back < ar.length)
        {
            if(ar[back] > ar[front] && (back%2!=0))
            {
                back++;
                front++;
                count++;
            }
            else if(ar[back] <= ar[front] && (back%2!=0)){
                back++;
            }

            else if(ar[back] > ar[front] && (back%2==0))
            {
                count++;
            }
            else{
                back++;
            }
            if( back == ar.length) break;
        }
        
        return count;
    }
}
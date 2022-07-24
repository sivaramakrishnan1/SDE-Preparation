// import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        /* Scanner s = new Scanner(System.in);
        int val = s.nextInt(); */

        int val = 5;

        int mid = val;
        for(int i=0 ; i<val ; i++)
        {
            for(int j=0 ; j<=mid+i ; j++)
            {
                if(j >= mid-i && j<=mid+i)
                {
                    System.out.print('*');                    
                }
                else System.out.print(' ');
            }
            System.out.println();
        }
    }
}

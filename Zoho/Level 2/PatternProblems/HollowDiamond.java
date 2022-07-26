public class HollowDiamond {
    public static void main(String[] args) {
        
        int val = 7;
        int mid = ( val % 2 == 0) ? val / 2 : ( val / 2 ) + 1;
        for (int i = 0; i < val; i++) 
        {
            for(int j=0 ; j < val ; j++)
            {
                if( i + j == mid-1) System.out.print("* ");
                else if( j - i == mid-1) System.out.print("* ");
                else if( i - j == mid-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
/*

   *  
  * *
 *   *
*


 */
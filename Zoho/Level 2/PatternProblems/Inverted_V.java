public class Inverted_V {
    public static void main(String[] args) {
        
        int val = 6;
        
        /* for(int i = 0 ; i < val ; i++)
        {
            int  left = val / 2;
            int right = left;
            for(int j = 1 ; j <= val ; j++)
            {
                if( j == left || j == right) 
                {
                    System.out.print("*");
                    left--;
                    right++;
                }
                else System.out.print(" ");
            }
            System.out.println();
        } */
        int mid = (val % 2 == 0) ? val / 2 : (val / 2) -1;
        for (int i = 0; i < val; i++) {
            for (int j = 0; j < val * 2; j++) {
                if(i+j == (mid * 2)-1 || j-i == (mid * 2)-1) 
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

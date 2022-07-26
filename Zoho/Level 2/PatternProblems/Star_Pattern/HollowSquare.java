public class HollowSquare {
    public static void main(String[] args) {
        
        int val = 5;

        for(int i = 1 ; i <= val ; i++)
        {
            for( int j = 1 ; j <= val ; j++)
            {
                if(i == 1 || i == val) System.out.print("* ");
                else if(j == 1 || j == val) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

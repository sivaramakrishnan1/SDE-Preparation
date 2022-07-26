public class HollowHalfPyramid {
    public static void main(String[] args) {
        
        int val = 5;

        for(int i = 1 ; i <= val ; i++)
        {
            for( int j = 1 ; j <= val ; j++)
            {
                if(i == val || j == 1 || i == j) System.out.print("* "); 
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

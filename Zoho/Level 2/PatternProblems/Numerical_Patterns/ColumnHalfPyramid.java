public class ColumnHalfPyramid {
    public static void main(String[] args) {
        
        int val = 5;

        for(int i = 1 ; i <= val ; i++)
        {
            for( int j = 1 ; j <= i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

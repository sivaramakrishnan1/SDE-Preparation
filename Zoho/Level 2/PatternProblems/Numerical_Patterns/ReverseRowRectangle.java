public class ReverseRowRectangle {
    public static void main(String[] args) {
        
        int val = 5;

        for(int i = val ; i >= 1 ; i--)
        {
            for( int j = 1 ; j <= val ; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

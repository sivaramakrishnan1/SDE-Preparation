public class ReverseColumnRectangle {
    public static void main(String[] args) {
        
        int val = 5;

        for(int i = 1 ; i <= val ; i++)
        {
            for( int j = val ; j >= 1 ; j --)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

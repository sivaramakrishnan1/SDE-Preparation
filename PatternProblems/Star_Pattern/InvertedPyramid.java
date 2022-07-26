public class InvertedPyramid {
    public static void main(String[] args) {
        int val = 6;
        int i , j ;

        for(i = val ; i > 0 ; i--)
        {
            for(j = 0 ; j < (val - i) ; j++) 
                System.out.print(" ");
            for(j = 1 ; j <= (i*2)-1 ; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}

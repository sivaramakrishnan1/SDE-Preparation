public class InvertedRightTriangle {
    public static void main(String[] args) {
        int val = 6, i, j;

        for(i = 1 ; i <= val ; i++)
        {
            for(j = 0 ; j <= (val - i) ; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

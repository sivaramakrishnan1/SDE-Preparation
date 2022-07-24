public class InvertedMirrorRightTriangle {
    public static void main(String[] args) {
        int val = 6;
        int i , j , k;

        for(i = 0 ; i < val ; i++)
        {
            for(j = 1 ; j <= i ; j++)
            {
                System.out.print(" ");
            }
            for(k = j ; k <= val ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class MirrorRightTriangle {
    public static void main(String[] args) {
        int val = 6;

        for(int i = 1 ; i <= val ; i++)
        {
            for(int j = 1 ; j <= val - i ; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

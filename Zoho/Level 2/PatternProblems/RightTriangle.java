public class RightTriangle {
    public static void main(String[] args) {
        int val = 6;

        for(int i=1 ; i<= val ; i++)
        {
            for(int j=1 ; j <= i ; j ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

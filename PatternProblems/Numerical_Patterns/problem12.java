public class problem12 {
    public static void main(String[] args) {
        
        int val = 5;

        for(int i = 1 ; i <= val ; i++)
        {
            for(int j = 1 ; j <= val - i ; j++)
            {
                System.out.print(" ");
            }

            for(int j = (i * 2) - 1 ; j >= 1 ; j--)
            {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}

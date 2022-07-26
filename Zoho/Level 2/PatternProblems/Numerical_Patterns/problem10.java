public class problem10 {
    public static void main(String[] args) {
        
        int val = 5;

        for(int i = 1 ; i <= val ; i++)
        {
            for(int j = 1 ; j <= val - i ; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1 ; j <= (i*2) - 1 ; j++)
            {
                System.out.print((i*2) - 1);
            }
            System.out.println();
        }
    }
}

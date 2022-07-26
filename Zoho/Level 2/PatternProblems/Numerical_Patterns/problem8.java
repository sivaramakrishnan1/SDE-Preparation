public class problem8 {
    public static void main(String[] args) {
        
        int val = 5;

        for(int i = 1 ; i <= val ; i++)
        {
            for(int j = 1 ; j <= val ; j++)
            {
                if( j < i) System.out.print(" ");
                else System.out.print(j-i+1);
            }
            System.out.println();
        }
    }
}

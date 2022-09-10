public class problem15 {
    public static void main(String[] args) {
        int val = 5;

        for(int i = 0 ; i < val ; i++)
        {
            for(int j = 0 ; j < val ; j++)
            {
                if(i-j != 0) System.out.print(val-2-i + " ");
                else System.out.print(val-2 + " ");
            }
            System.out.println();
        }
    }
}

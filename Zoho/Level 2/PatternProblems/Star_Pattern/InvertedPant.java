public class InvertedPant {
    public static void main(String[] args) {
        
        int val = 5;

        for(int i = 1 ; i <= val ; i++)
        {
            for(int j = 1 ; j <= val * 2 ; j++)
            {
                if(j <= i || i + j > (val * 2)) 
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

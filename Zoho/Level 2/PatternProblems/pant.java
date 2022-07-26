public class pant {
    public static void main(String[] args) {
        
        int val = 5;
        for(int i = 1 ; i <= val ; i++)
        {
            for(int j = -1 ; j < (val * 2) ; j++)
            {
                if(j >= (val - i) && j < (val + i - 1)) 
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}

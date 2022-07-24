public class Just_V {
    public static void main(String[] args) {
        
        int val = 6;

        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= val * 2; j++) {
                if(i == j || i + j == (val * 2)) 
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

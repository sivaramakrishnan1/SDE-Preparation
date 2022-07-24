public class HollowDiamond {
    public static void main(String[] args) {
        
        int val = 6;

        for (int i = 1; i <= val*2; i++) {
            for (int j = 1; j <= val * 2; j++) {
                if(( j % val) + i == val) 
                    System.out.print("* ");
                else System.out.print("- ");
            }
            System.out.println();
        }
    }
}

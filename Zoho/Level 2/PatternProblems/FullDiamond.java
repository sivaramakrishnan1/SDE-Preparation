public class FullDiamond {
    public static void main(String[] args) {
        
        int val = 6, limit;


        for(int i = val-1 ; i > -(val) ; i--)
        {
            limit = (i < 0) ? -i : i;
            for (int j = 0; j < limit; j++) {
                System.out.print("  ");                
            }

            for( int j = 1 ; j < (val - limit)*2 ; j++) System.out.print("* ");
            System.out.println();
        }
    }
}

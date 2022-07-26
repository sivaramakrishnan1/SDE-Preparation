public class HalfSandClock {
    public static void main(String[] args) {
        
        int val = 5, limit;

        for(int i=val-1 ; i > -(val) ; i--)
        {
            limit = (i >= 0) ? i+1  : (-i)+1;

            for(int j = 0 ; j < limit ; j++)
                System.out.print("* ");
            
            System.out.println();
        }
    }   
}

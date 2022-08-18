public class XOX 
{
    public static void main(String[] args) 
    {
        int n = 7 , m = 7;

        for(int i = 1 ; i <= m ; i++)
        { 
            for(int j = 1 ; j <= n ; j++) 
            { 
                if( i == 1 || i == m || j == 1 || j == n) 
                    System.out.print("X ");
                else if( j % 2 != 0 && j < (n/2)) 
                    System.out.print("X ");
                else if( j % 2 == 0 && j > (n/2)) 
                    System.out.print("X ");                    
                else 
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

}

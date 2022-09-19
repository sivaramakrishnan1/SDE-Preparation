import java.util.Scanner;

public class recordBreaking {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int cases = s.nextInt();

        for (int i = 0; i < cases; i++) {
            System.out.println("Case #" + i + ": " + (int)solution());
        }
    }

    public static int solution()
    {
        boolean falling = false;
        int size = s.nextInt();
        int arr[] = new int[size];
        int count = 0 ;
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = s.nextInt();
        }

        return 0;
    }
}

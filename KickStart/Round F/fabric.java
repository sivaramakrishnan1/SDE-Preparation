import java.util.Scanner;
import java.util.ArrayList;

public class fabric{

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int test = s.nextInt();
        for (int i = 0; i < test; i++) {
            System.out.println("Case #" + (i+1) +": " + solution());
        }        
    }

    public static int solution()
    {
        int n = s.nextInt();
        cloth cl[] = new cl[n];

        for (int i = 0; i < n; i++) {
            String c = s.next();
            int d = s.nextInt();
            int u = s.nextInt();
            cl
        }
    }
}

public class cloth extends fabric{
    private String color;
    private int dur, id;

    cloth(String color, int dur, int id)
    {
        this.color = color;
        this.dur = dur;
        this.id = id;
    }
}
import java.util.Scanner;

public class problem {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int bags = 0 , kids = 0;

        int cases = s.nextInt();
        for(int i = 1 ; i <= cases ; i++)
        {
            bags = s.nextInt();
            kids = s.nextInt();
            System.out.println("Case #" + i + ": " + (int)solution(bags , kids));
        }
    }

    public static int solution(int bags, int kids)
    {
        int candies = 0;

        for (int i = 0; i < bags; i++) candies += s.nextInt();

        return (candies % kids);
    }
}

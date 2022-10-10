import java.util.Scanner;

public class problemFourth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < size; i++)
            nums[i] = s.nextInt();

        int val = s.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if((nums[i] + nums[j]) == val)
                {
                    System.out.println("( " + nums[i] + " , " + nums[j] + " )");
                }
            }
        }
        
        s.close();
    }
}

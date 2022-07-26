public class RevHPyramid {
    public static void main(String[] args) {
        int val = 5;

        for (int i = val; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val - i + 1);
            }
            System.out.println();
        }
    }
}

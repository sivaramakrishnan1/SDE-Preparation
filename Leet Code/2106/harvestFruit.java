public class harvestFruit {
    public static void main(String[] args) {
        int[][] fruits = { { 0, 9 }, { 4, 1 }, { 5, 7 }, { 6, 2 }, { 7, 4 }, { 10, 9 } };
        int startPos = 5, k = 4;
        System.out.println(maxTotalFruits(fruits, startPos, k));
    }

    public static int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int total = 0;

        for (int i = 0; i < k; i++) {
            int goToPos = 0;

            for (int j = 0; j < fruits.length; j++) {
                int dif = (fruits[j] [0] - pos > -1) ? fruits[j][0] - startPos : (fruits[j][0] - startPos) * -1;
                if (dif < fruits[goToPos][0] && fruits[j][1] != 0)
                goToPos = j;
            }
            total += fruits[goToPos][1];
            fruits[goToPos][1] = 0;
            startPos = goToPos;
        }

        return total;
    }

    public static int closePosition(int[][] fruits, int pos) {

        return min;
    }
}

public class PerformOperation {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (int i = 0; i < operations.length; i++) {
            if(operations[i].charAt(0) == '+' || operations[i].charAt(2) == '+') x++;
            else x--;
        }

        return x;
    }
}

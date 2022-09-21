public class BinarySwap {

    public static void main(String[] args) {
        BinarySwap obj = new BinarySwap();
        String str = "111000";
        System.out.println(obj.minSwaps(str));
    }

    public int minSwaps(String s) {
        /*
         * boolean[] b = new boolean[s.length()];
         * for (int i = 0; i < s.length(); i++) {
         * if (s.charAt(i) == '1') b[i] = true;
         * else b[i] = false;
         * }
         * 
         * boolean temp;
         * 
         * for (int i = 1; i < b.length ; i++) {
         * if (b[i] == b[i - 1]) {
         * if (b[b.length - i] != b[i]) {
         * count++;
         * temp = b[i];
         * b[i] = b[b.length - i];
         * b[b.length - i] = temp;
         * }
         * }
         * }
         */
        if (s.length() < 2)
            return 0;
        int count = 0;

        char c = s.charAt(0), temp;
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1] )
                    count++;
        }

        return count;
    }
}

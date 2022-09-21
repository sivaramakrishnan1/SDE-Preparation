public class Make69 {
    public static void main(String[] args) {
        int num = 669;
        System.out.println(maximum69Number(num));
    }

    public static int maximum69Number(int num) {
        String s = "";
        boolean first = true;

        while (num > 0) {
            s = num % 10 + s;
            num /= 10;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '6' && first) {
                num += 9;
                num *= 10;
                first = false;
            } else if (s.charAt(i) == '6') {
                num += 6;
                num *= 10;
            } else {
                num += 9;
                num *= 10;
            }
        }
        System.out.println(num / 10);

        return num / 10;
    }
}

public class ZigZag {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3; 

        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
        String res = "";
        int size = 0, i = 0;

        while(size <= s.length())
        {
            res += s.charAt(i);
            i = (i + numRows) % (s.length() - 1);
            i++;
            size++;
        }

        return res;
    }
}

public class thousandSeparator {
    public static void main(String[] args) {
        int n = 1234;
        thousandSeparator obj = new thousandSeparator();
        System.out.println(obj.thousandsSeparator(n));
    }

    public String thousandsSeparator(int n) {
        if(n < 1000) return String.valueOf(n);
        String res = "";
        int i = 0;
        while(n != 0)
        {
            int rem = n % 10;
            if(i % 3 == 0 && i != 0) res = rem + "." + res;
            else res = rem + res;
            n /= 10;
            i++;
        }

        return res;
    }
}

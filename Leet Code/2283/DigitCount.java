public class DigitCount {
    public static void main(String[] args) {
        String num = "1211";
        System.out.println(digitCount(num));
    }

    public static boolean digitCount(String num) {
        
        for(int i = 0 ; i < num.length() ; i++)
        {
            int digit = num.charAt(i) - 48;

            for(int j = 0 ; j < num.length() ; j++)
            {
                if(i == (num.charAt(j) - 48))
                {
                    digit--;
                }
            }
            if(digit != 0) return false;
        }

        return true;
    }
}

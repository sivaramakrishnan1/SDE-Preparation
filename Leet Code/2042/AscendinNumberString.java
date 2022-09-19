public class AscendinNumberString {
    public static void main(String[] args) {
        String s = "1 box has 2 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(s));
    }

    public static boolean areNumbersAscending(String s) {
        boolean intpart = false;
            int i = 0, prev = 0 , current = 0;
            while (i < s.length()) {
                if(s.charAt(i) > 47 && s.charAt(i) < 58 && s.charAt(i+1) == ' ')
                {
                    if( Integer.valueOf(s.charAt(i)) > prev ) 
                }
            }

        /*
        int past = 0, current = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) > 47 && (int) s.charAt(i) < 58) {
                while (s.charAt(i++) != ' ') {
                    current += Integer.valueOf(s.charAt(i));
                    current *= 10;
                }
                if (past >= (current/10))
                    return false;
                else {
                    past = current/10;
                    current = 0;
                }
            }
        }
        return true;*/
    }
}

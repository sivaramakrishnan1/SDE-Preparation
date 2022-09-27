import java.util.HashMap;

/**
 * NumberOfNumbers
 */
public class NumberOfNumbers {

    public static void main(String[] args) {
        NumberOfNumbers obj = new NumberOfNumbers();
        String word = "192383183928778851682383a2089984061937879119";
        System.out.println(obj.numDifferentIntegers(word));
    }

    public int numDifferentIntegers(String word) {
        String num = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) > 47 && word.charAt(i) < 58) {
                while (i < word.length() && word.charAt(i) > 47 && word.charAt(i) < 58) {
                    num += word.charAt(i);
                    i++;
                }
                if (map.containsKey(num)) {
                    num = "";
                    continue;
                } else
                    map.put(num, 1);
                num = "";
            }
        }
        return map.size();
    }

    /*
     * public int numDifferentIntegers(String word) {
     * char[] str = new char[word.length()];
     * HashMap<Integer , Integer> map = new HashMap<>();
     * 
     * for (int i = 0; i < word.length(); i++) {
     * char c = word.charAt(i);
     * if (c < 48 && c > 57)
     * str[i] = c;
     * }
     * int i = 0;
     * while( i < str.length)
     * {
     * if(str[i] > 47 && str[i] < 58)
     * {
     * 
     * }
     * }
     * 
     * return 0;
     * }
     */
}
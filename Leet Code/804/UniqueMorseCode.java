import java.util.HashMap;

import javax.naming.ldap.HasControls;

public class UniqueMorseCode {
    public static void main(String[] args) {
        String[] words = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};

        UniqueMorseCode umc = new UniqueMorseCode();

        System.out.println(umc.uniqueMorseRepresentations(words));
    }

    public int uniqueMorseRepresentations(String[] words) {
        int result = 0;
        HashMap<String , Integer> map = new HashMap<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String word = "";
        for (String string : words) {
            for (char c : string.toCharArray()) {
                word = word + morse[c - 'a'];
            }
            System.out.println(word);
            if(map.containsKey(word)) map.replace(word, (map.get(word))+1);
            else map.put(word, 1);
            word = "";
        }


        for (String val : map.keySet()) {
            result++;
        }

        return result;
    }
}

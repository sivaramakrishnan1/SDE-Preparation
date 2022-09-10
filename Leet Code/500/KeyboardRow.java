import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = { "Hello", "Alaska", "Dad", "Peace" };

        String[] newWords = findWords(words);
        for (String string : newWords) {
            System.out.println(string);
        }
    }

    public static String[] findWords(String[] words)
    {
        int[] values = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};

        for(int i = 0 ; i < words.length ; i++) 
        {
            String s = words[i].toLowerCase();
            int val = values[(s.charAt(0)) - 97];
            
            for (int j = 0 ; j < s.length() ; j++)
                if(values[(s.charAt(j)) - 97] != val) words[i] = null;
        } 

        int val = 0;
        for (String string : words) {
            if(string != null) val++; 
        }

        String[] newWords = new String[val];

        val = 0;
        for(int i = 0 ; i < words.length ; i++)
        {
            if(words[i] != null) newWords[val++] = words[i];
        }
        return newWords;
    }
/*
    static HashMap<Character , Integer> initalize() {
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('q', 1);
        map.put('w', 1);
        map.put('e', 1);
        map.put('r', 1);
        map.put('t', 1);
        map.put('y', 1);
        map.put('u', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('p', 1);
        map.put('a', 2);
        map.put('s', 2);
        map.put('d', 2);
        map.put('f', 2);
        map.put('g', 2);
        map.put('h', 2);
        map.put('j', 2);
        map.put('k', 2);
        map.put('l', 2);
        map.put('z', 3);
        map.put('x', 3);
        map.put('c', 3);
        map.put('v', 3);
        map.put('b', 3);
        map.put('n', 3);
        map.put('m', 3);

        return map;
    }
    */
}

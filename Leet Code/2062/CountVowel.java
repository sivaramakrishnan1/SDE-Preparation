public class CountVowel {
    public static void main(String[] args) {
        CountVowel cv = new CountVowel();
        String word = "cuaieuouac";
        System.out.println(cv.countVowelSubstrings(word));
    }

    public int countVowelSubstrings(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.length() - i < 4)
                break;
            else if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u') {
                count += checkVowels(word, i);
            }
        }

        return count;
    }

    public int checkVowels(String word, int pos) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        int count = 0;
        while (pos < word.length() && (word.charAt(pos) == 'a' || word.charAt(pos) == 'e' || word.charAt(pos) == 'i'
                || word.charAt(pos) == 'o' || word.charAt(pos) == 'u')) {
            switch (word.charAt(pos)) {
                case 'a': {
                    a++;
                    break;
                }
                case 'e': {
                    e++;
                    break;
                }
                case 'i': {
                    i++;
                    break;
                }
                case 'o': {
                    o++;
                    break;
                }
                case 'u': {
                    u++;
                    break;
                }
                default : pos = word.length();
            }
            pos++;
        }
        if (a != 0 && e != 0 && i != 0 && o != 0 && u != 0) {
            count = (a + e + i + o + u) - 4;
            return count;
        }
        else return 0;
    }
}
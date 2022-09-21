public class Prefix {
    public static void main(String[] args) {
        String[] words = { "ycwj","hak","v","kjg","zw","vtes","vom","ii","as","v","vo","v","w","vomy","loa","fbm","j","v","vo","e","y","t","eh","yk","bt","x","vomy","vom","yab", "v","sydi","wnb","z","v","iygp","vomy" };
        System.out.println(countPrefixes(words, "vomy"));
    }
    /*
     * ["ycwj","hak","v","kjg","zw","vtes","vom","ii","as","v","vo","v","w","vomy",
     * "loa","fbm","j","v","vo","e","y","t","eh","yk","bt","x","vomy","vom","yab",
     * "v","sydi","wnb","z","v","iygp","vomy"]
     * "vomy"
     */

    public static int countPrefixes(String[] words, String s) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
                if (words[i].length() > s.length()) {
                    continue;
                }
                if (check(words[i] , s)) {
                    count++;
                    System.out.println(words[i]);
                }
            }

        return count;
    }

    public static boolean check(String word , String s)
    {
        for(int i = 0 ; i < word.length() ; i++) 
        {
            if(s.charAt(i) != word.charAt(i)) return false;
        }

        return true;
    }
}

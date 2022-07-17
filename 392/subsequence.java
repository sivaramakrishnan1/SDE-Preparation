public class subsequence {
    public static void main(String[] args) {        
        subsequence seq = new subsequence();

        String s = "aaaaaa", t = "bbaaaa";
        System.out.println(seq.isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) 
    {
        if(s.length() > t.length()) return false;

        int i=0, j=0;
        while(i < s.length())
        {
            if(s.charAt(i) != t.charAt(j)) 
            {
                ++j;
            }
            else 
            { 
                i++; 
            }
            if(j >= t.length()) return false;
        }
        return true;                
    }
}

public class s3p6 {
    public static void main(String[] args) {
        s3p6 obj = new s3p6();

        String s = "  one two three  ";
        String res = obj.stringReverse(s);
        System.out.println(res);
    }

    public String stringReverse(String s)
    {
        int index = (s.charAt(0) == ' ') ? 0 : 1;
        String res = "";

        for (int i = 0 ; i < s.length() ; i++) 
            if(s.charAt(i) == ' ' && (i != s.length()-1) && s.charAt(i+1) != ' ' ) 
                index++;

        String arr[] = new String[index];

        for(int i = 0 ; i < s.length() ; i++)
        {
            while( i < s.length() && s.charAt(i) == ' ') { i++; }
            if(s.charAt(i) != ' ' ) res += s.charAt(i);
            else if(s.charAt(i) == ' ' && res != "")
            {
                arr[--index] = res;
                res = "";
            }
        }        
        arr[--index] = res;
        res = "";

        for (String string : arr) {
            res += string + " ";
        }
        return res;
    }
}
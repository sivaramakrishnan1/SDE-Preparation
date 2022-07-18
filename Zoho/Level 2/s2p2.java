/**
 * s2p2
 */
public class s2p2 {

    public static void main(String[] args) {
        s2p2 obj = new s2p2();

        String s = "((abc)((de))";

        obj.printPerfect(s);
    }

    public void printPerfect(String s)
    {
        int arr[] = new int[s.length()];
        char[] chars = s.toCharArray();

        int dump = 0;
        for(int i=0 ; i<s.length() ; i++)
        {
            if(chars[i] == '(') dump++;
            else if(chars[i] == ')') dump--;
            arr[i] = dump;
            if(dump < 0 && ( chars[i] == '(' || chars[i] == ')')) chars[i] = '.';
        }
        dump=0;

        for(int i=s.length()-1 ; i>=0 ; i--)
        {
            if(chars[i] == '(') dump--;
            else if(chars[i] == ')') dump++;
            arr[i] = dump;
            if(dump < 0 && ( chars[i] == '(' || chars[i] == ')')) chars[i] = '.';
        }

        for (char c : chars) {
            if(c != '.') System.out.print(c);
        }
    }
}
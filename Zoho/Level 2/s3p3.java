/**
 * s3p3
 */
public class s3p3 {

    public static void main(String[] args) {
        s3p3 obj = new s3p3();

        obj.printPattern("SLIMSHADY");
    }

    public void printPattern(String s) {
        char c[];
        char x[] = new char[s.length()];

        for(int i=0 ; i<s.length() ; i++) 
            x[i] = ' ';

        for(int i=0 ; i<s.length() ; i++)
        {
            c = x.clone();
            c[i] = s.charAt(i);
            c[c.length -1 -i] = s.charAt(s.length() -1 -i);
            System.out.println(new String(c));
        }
    }
}
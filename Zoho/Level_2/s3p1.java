// Input: a1b10 Output: abbbbbbbbbb

import java.util.Scanner;

public class s3p1 {
    public static void main(String[] args) 
    {
        s3p1 obj = new s3p1();
        Scanner s = new Scanner(System.in);
        // String exp = "a5b4c3d2e1";
        String exp = s.next();

        obj.printPattern(exp);
        s.close();
    }

    public void printPattern(String exp)
    {
        char c = ' ';
        int val = 0, limit = 0;

        while(limit < exp.length())
        {
            c = exp.charAt(limit++);
            val = ((int)exp.charAt(limit++)) - 48;

            if(limit < (exp.length()) && (exp.charAt(limit) >= '0' && exp.charAt(limit) <= '9'))
            {
                val *= 10;
                val += ((int)exp.charAt(limit++)) - 48;
                limit++;
            }

            for(int i=0 ; i<val ; i++)
            {
                System.out.print(c);
            }
        }

    }
}

// ! incomplete

import java.util.Scanner;

public class s4p4 {
    static int ones = 0 , twos = 0;
    public static void main(String[] args) {
        s4p4 obj = new s4p4();
        Scanner s = new Scanner(System.in);
        String val = "1";
        int n = s.nextInt();

        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(val);
            val = obj.count(val);
        }
        s.close();
    }

    public String count(String val)
    {
        ones = 0;
        twos = 0;

        for(int i = 0 ; i < val.length() ; i++)
        {
            if(val.length() == 0) 
            {
                if(val.charAt(i) == '1')
                    return "11";
                else
                    return "12";
            }
            while(val.charAt(i) == val.charAt(i+1) && val.charAt(i) == '1')
            {
                ones++; i++;
            }
        }

        return " ";
    }
}
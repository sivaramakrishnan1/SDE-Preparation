public class s3p4 {
    public static void main(String[] args) {
        s3p4 obj = new s3p4();

        String str1 = "testing12" , str2 = "1234";
        System.out.println(obj.findBeginning(str1 , str2));
    }

    public int findBeginning(String s1 , String s2)
    {
        int startPos = -1, count = 0;

        for(int i=0 ; i<s1.length() ; i++)
        {
            if(s1.charAt(i) == s2.charAt(count))
            {
                if(count == 0) startPos = i; 
                count++;
            } else {
                count = 0;
                startPos = -1;
            }
            if(count == s2.length()) return startPos;
            if(i == s1.length()-1 && count != s2.length()) return -1;             
        }
        return startPos;
    }
}

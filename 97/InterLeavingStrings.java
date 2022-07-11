
public class InterLeavingStrings {

    public static void main(String[] args) {
        InterLeavingStrings ils = new InterLeavingStrings();

        // correct
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        // incorrect
        // String s1 = "aabcc" , s2 = "dbbca" , s3 = "aadbbcbcac";
        System.out.println(ils.solve(s1 , s2 , s3));
    }

    public boolean solve(String s1 , String s2 , String s3)
    {
        int s1Limit = 0 , s2Limit = 0;
        
        for(int i=0 ; i<s3.length() ; i++)
        {
            if(s1.length() != s1Limit && s2.length() != s2Limit)
            {
                if(s3.charAt(i) == s1.charAt(s1Limit)) 
                {
                    s1Limit++;
                    continue;
                }
                else if(s3.charAt(i) == s2.charAt(s2Limit)) 
                {
                    s2Limit++;
                    continue;
                }
            }
            else return false;            
        }        
        return true;
    }
}
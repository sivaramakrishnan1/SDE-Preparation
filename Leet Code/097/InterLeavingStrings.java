// ! Can't complete this in java, trying in C++


public class InterLeavingStrings {

    public static void main(String[] args) {
        InterLeavingStrings ils = new InterLeavingStrings();

        // correct
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        // incorrect
        // String s1 = "aabcc" , s2 = "dbbca" , s3 = "aadbbcbcac";
        System.out.println(ils.solve(s1, s2, s3));
    }

    public boolean solve(String s1, String s2, String s3) 
    {
        
        if (s3.length() != s1.length() + s2.length()) return false;
        // int l1 = 0 , l2 = 0 ;
        /*
        for (int i = 0; i < s3.length(); i++) 
        {
            if(s3.charAt(i) == s1.charAt(l1)) { l1++; s3.charAt(i) = '0'; }
            else if(s3.charAt(i) == s2.charAt(l2)) { l2++; s3.charAt(i) = "0"; 

        } */

        // smallest string in remove
        // String remove = (s1.length() >= s2.length()) ? s1 : s2;
        // int l1 = 0, l2 = 0; // limit1 and limit2
        /*
        while (true) {
            if (remove.charAt(l1) == s3.charAt(l2)) {
                s3 = s3.substring(l2, 4);
                l1++;
                l2++;
                System.out.println(s3);
            } else {
                l2++;
            }
            if (l2 > s3.length())
                break;
        }
         */
        
        return true;
    }
}
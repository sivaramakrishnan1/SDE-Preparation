import java.util.Scanner;

class LongestUniqueSubstring
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		LongestUniqueSubstring lus = new LongestUniqueSubstring();
		System.out.println(lus.longestPalindrome(str));
	}
	
	public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        if(s.length() == 2) 
            if(s.charAt(0) == s.charAt(1)) return s;
            else return s.charAt(0) + "";

        String max = "";

        for(int i = 0 ; i < s.length() ; i++)
        {
            for(int j = s.length() - 1 ; j > i ; j--)
            {
				System.out.println(max.length() + " " + (j-i));
                if(isPallindrome(s, i, j) && j - i > max.length()-1)
                {
                    max = substring(s, i, j);
                }
            }
        }

        return max;
    }

    private String substring(String str, int start, int end)
    {
        String res = "";

        for(int i = start ; i <= end ; i++)
        res += str.charAt(i);

        return res;
    }

    private boolean isPallindrome(String str, int start, int end)
    {
        System.out.print(str.substring(start, end+1) + " " + start + " " + end);
        while(start < end)
        {
            if(str.charAt(start) != str.charAt(end)) {
				System.out.print(" -> " + false + " \n");
				return false;
			}
            start++;
            end--;
        }
        System.out.print(" -> " + (start >= end) + " \n");
        return start >= end;
    }
}
import java.util.*;

public class IsomorphicStrings {
    public static void main(String[] args) 
    {
        IsomorphicStrings iString = new IsomorphicStrings();

        String s = "foo", t = "bar";

        System.out.println(iString.isIsomorphic(s,t));
    }

    public boolean isIsomorphic(String s, String t) 
    {
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(!map.containsKey(s.charAt(i)))
                if(!map.containsValue(t.charAt(i))) 
                    map.put(s.charAt(i) , t.charAt(i));
                else return false;   
            else if(map.get(s.charAt(i)) != t.charAt(i)) return false;                
        }
        
        return true;
    }
}

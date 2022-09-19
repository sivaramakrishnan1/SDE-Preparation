public class longOnes {
    public static void main(String[] args) {
        String s = "11111111111111111111111111111111111111111111111111";
        longOnes obj = new longOnes();
        System.out.println(obj.checkZeroOnes(s));
    }

    public boolean checkZeroOnes(String s) 
    {
        if(s.length() == 1 && s.charAt(0) == '1') return true;
        else if(s.length() == 1 && s.charAt(0) == '0') return false;
        
        int longone = 0 , longzero = 0 , currentOne = 0 , currentZero = 0;

        int i = 0;
        while(i < s.length())
        {
            currentOne = currentZero = 0;
            while(s.charAt(i) == '1')
            {
                currentOne++;
                i++;
                if(i == s.length()) break;
            }
            longone = (currentOne > longone ) ? currentOne : longone;

            if(i == s.length()) break;
            while(s.charAt(i) == '0')
            {
                currentZero++;
                i++;
                if(i == s.length()) break;
            }
            longzero = (currentZero > longzero) ? currentZero : longzero;
        }

        return (longone > longzero);        
    }
}

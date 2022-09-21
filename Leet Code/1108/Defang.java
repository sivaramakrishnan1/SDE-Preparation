public class Defang {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    } 

    public static String defangIPaddr(String address) {
        String res = "";
        for(int i=0 ; i < address.length() ; i++)
        {
            if(address.charAt(i) == '.') res += "[.]";
            else res += address.charAt(i);
        }
        
        return res;
    }
}

public class LinesToPrintString {
    public static void main(String[] args) {
        LinesToPrintString object = new LinesToPrintString();

        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";

        int[] result = object.numberOfLines(widths, s);

        System.out.println(result[0] + " " + result[1]);
    }

    public int[] numberOfLines(int[] widths, String s) {
        int count = 1 , sum = 0;
        
        for(char c : s.toCharArray())
        {
            int i = widths[c - 'a'];
            
            if(sum + i > 100) {
                count++;
                sum = i;
                System.out.println();
            }
            else sum += i;
        }
        
        return new int[]{count, sum};
    }
}

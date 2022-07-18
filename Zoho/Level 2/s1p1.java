public class s1p1 {
    public static void main(String[] args) {
        s1p1 obj = new s1p1();

        obj.printPattern();
    }

    public void printPattern()
    {
        String txt = "PROGRAM";
        int chumma=0;

        for(int i=0 ; i<txt.length() ; i++)
        {
            for(int j=0 ; j<txt.length() ; j++)
            {
                if(i == j) System.out.print(txt.charAt(i));
                else if(i+j == txt.length()-1) System.out.print(txt.charAt(j));
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

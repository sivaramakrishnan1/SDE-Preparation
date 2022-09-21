public class AddOne {
    public static void main(String[] args) {
        int[] digits = {9,9};
        AddOne ao = new AddOne();
        digits = ao.plusOne(digits);

        for (int i : digits) {
            System.out.print(i + " ");
        }
    }

    public int[] plusOne(int[] digits) {        
        for(int i = digits.length -1 ; i > -1  ; i--)
        {
            if(digits[i] == 9 && i == 0) {
                digits[i] = 0;
                digits = addElement(digits); 
                break;
            }
            if(digits[i] == 9)
            {
                digits[i] = 0;
            }
            else
            {
                digits[i]++;            
                break;
            }
        }
        return digits;
    }

    public int[] addElement(int[] digits)
    {
        int[] digitNew = new int[digits.length + 1];

        digitNew[0] = 1;

        for(int i = 1 ; i < digits.length ; i++)
        {
            digitNew[i] = digits[i - 1];
        }

        return digitNew;
    }
}

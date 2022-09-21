import javax.lang.model.util.ElementScanner14;

public class FormatNumber {
    public static void main(String[] args) {
        FormatNumber fn = new FormatNumber();
        String number = "9964-";
        System.out.println(fn.reformatNumber(number));
    }

    public String reformatNumber(String number) {
        String OGNumber = "";
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '-' && number.charAt(i) != ' ')
                OGNumber += number.charAt(i);
        }
        System.out.println(OGNumber);
        number = "";
        if (OGNumber.length() < 4)
            return OGNumber;
        else if (OGNumber.length() == 4) {
            number = OGNumber.charAt(0) + "" + OGNumber.charAt(1) + "-" + OGNumber.charAt(2) + "" + OGNumber.charAt(3);
            return number;
        }
        int len = OGNumber.length() - 1;
        if (OGNumber.length() % 3 == 1) {
            number = "-" + OGNumber.charAt(len - 3) + "" + OGNumber.charAt(len - 2) + "-" + OGNumber.charAt(len - 1)
                    + ""
                    + OGNumber.charAt(len);
            len -= 4;
        } else if (OGNumber.length() % 3 == 2) {
            number = "-" + OGNumber.charAt(len - 1) + "" + OGNumber.charAt(len);
            len -= 2;
        }
        while (len > -1) {
            if (len % 3 == 0 && len != 0)
                number = "-" + OGNumber.charAt(len--) + number;
            else
                number = OGNumber.charAt(len--) + number;
        }

        return number;
    }
}

/*
 * 
 * for (int i = 0; i < OGNumber.length(); i++) {
 * System.out.println(number);
 * 
 * while((OGNumber.length() - i != 4 || OGNumber.length() - i != 2) &&
 * OGNumber.length() -1 > i)
 * {
 * System.out.println(number);
 * 
 * if (i % 3 == 0 && i != 0)
 * number += "-" + OGNumber.charAt(i);
 * else number += OGNumber.charAt(i);
 * i++;
 * }
 * if (OGNumber.length() - i == 4) {
 * number += "-" + OGNumber.charAt(i) + "" + OGNumber.charAt(++i) + "" +
 * OGNumber.charAt(++i);
 * } else if (OGNumber.length() - i == 2) {
 * number += "-" + OGNumber.charAt(i) + "" + OGNumber.charAt(++i) + "";
 * } else {
 * number += OGNumber.charAt(i);
 * }
 * }
 */

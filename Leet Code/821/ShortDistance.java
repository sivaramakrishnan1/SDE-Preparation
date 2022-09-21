import java.io.FileReader;

public class ShortDistance {
    public static void main(String[] args) {
        ShortDistance obj = new ShortDistance();
        String s = "loveleetcode";
        char c = 'e';
        int[] arr = obj.shortestToChar(s, c);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public int[] shortestToChar(String s, char c) {
        int res[] = new int[s.length()];

        int pos = s.length() - 1;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == c) {
                pos = i;
                res[i] = 0;
                i++;
            } else {
                res[i] = i - pos;
                i++;
            }
        }

        i--;
        boolean fisrtEncounter = false;

        while (i > -1) {
            if (s.charAt(i) == c && !fisrtEncounter)
                fisrtEncounter = true;
            if (s.charAt(i) == c) {
                pos = i;
                res[i] = 0;
                i--;
            } else if (res[i] < 0) {
                res[i] = pos - i;
            } else if (fisrtEncounter) {
                res[i] = ((pos - i) < res[i]) ? pos - i : res[i];
                i--;
            } else {
                i--;
            }
        }

        return res;
    }
}

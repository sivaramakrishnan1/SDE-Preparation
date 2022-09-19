import java.util.Scanner;

/**
 ** Input
3
5 3 6 2 3
EEWNS
4 3 3 1 1
SESE
11 5 8 3 4
NEESSWWNESE

 ** Output
 Case #1: 3 2
Case #2: 3 3
Case #3: 3 7

 */
public class wiggleWalk {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int cases = s.nextInt();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= cases; i++) {
            int res[] = solution();
            System.out.println("Case #" + i + ": " + res[0] + " " + res[1]);
        }
    }

    public static int[] solution() {
        int instrutions = s.nextInt();
        int totRow = s.nextInt();
        int totCol = s.nextInt();
        int r = s.nextInt();
        int c = s.nextInt();
        boolean matrix[][] = new boolean[totRow][totCol];
        r -= 1;
        c -= 1;
        for (int i = 0; i < totRow; i++) {
            for (int j = 0; j < totCol; j++) {
                if (totCol == c && totRow == r)
                    matrix[i][j] = true;
                else
                    matrix[i][j] = false;
            }
        }

        String ins = s.next();

        for (int i = 0; i < instrutions; i++) {
            if (ins.charAt(i) == 'E') {
                matrix[r][c] = true;
                do {
                    c++;
                } while (matrix[r][c] != false);
            } else if (ins.charAt(i) == 'W') {
                matrix[r][c] = true;
                do {
                    c--;
                } while (matrix[r][c] != false);
            } else if (ins.charAt(i) == 'N') {
                matrix[r][c] = true;
                do {
                    r--;
                } while (matrix[r][c] != false);
            } else if (ins.charAt(i) == 'S') {
                matrix[r][c] = true;
                do {
                    r++;
                } while (matrix[r][c] != false);
            }
        }

        return new int[] { r+1, c+1 };
    }
}

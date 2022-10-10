import java.util.Scanner;

public class game {
    static int row, column;

    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter game board size : ");
        row = s.nextInt();
        column = s.nextInt();

        int board[][] = new int[(row * 2) - 1][column];
        int result[][] = new int[row - 2][column - 2];

        board = initializeBoard(board);
        int offset = 1;

        while (true) {
            printBoard(board, result);
            int from, to;
            if (offset == 1)
                System.out.print("Player 1: ");
            else
                System.out.println("Player 2: ");

            System.out.println("Make your move");
            from = s.nextInt();
            to = s.nextInt();
            if (from == 0 && to == 0) {
                System.out.println("Exiting ... ");
                break;
            }
            if (!isValidMove(from, to)) {
                System.out.println();
                System.out.println("!!! Invalid move from " + from + " to " + to + " !!!");
                System.out.println();
                Thread.sleep(1000);
                continue;
            }
            offset *= -1;
            int ro, col;
            if (from - to == 1 || to - from == 1) {
                col = 0;
                ro = 0;
                col = (to < from) ? to % (column + 1) : from % (column + 1);
                col--;
                ro = (to < from) ? to / row : from / row;
                ro *= 2;
            } else {
                col = 0;
                ro = 0;
                col = (to < from) ? to % (column + 1) : from % (column + 1);
                col--;
                ro = (to < from) ? to / row : from / row;
                ro = (ro * 2) + 1;
            }
            if (board[ro][col] == 1) {
                System.out.println();
                System.out.println("!!! Invalid move from " + from + " to " + to + " !!!");
                System.out.println();
                Thread.sleep(1000);
                continue;
            }
            board[ro][col] = 1;
        }
    }

    public static boolean isValidMove(int from, int to) {
        if (from < 1 || to < 1 || from > row * column || to > row * column)
            return false;
        if (from - to != 1 || from - to != 1 && (from / column) == (to / column))
            return true;
        if (from + row == to || from - row == to)
            return true;
        return true;
    }

    public static int[][] initializeBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i % 2 == 0 && j == board[i].length - 1) {
                    board[i][j] = -1;
                } else {
                    board[i][j] = 0;
                }
            }
        }

        return board;
    }

    public static void printBoard(int[][] board, int[][] result) {
        int num = 0;
        for (int i = 0; i < (row * 2) - 1; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < column; j++) {
                    System.out.print(++num);
                    if (board[i][j] == -1)
                        continue;
                    else if (board[i][j] == 0)
                        System.out.print(" ");
                    else
                        System.out.print("-");
                }
            } else {
                for (int j = 0; j < column; j++) {
                    if (board[i][j] == -1)
                        continue;
                    else if (board[i][j] == 0)
                        System.out.print(" ");
                    else
                        System.out.print("|");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
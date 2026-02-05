import java.util.Scanner;

public class TicTacToe {
    String board[][] = new String[3][3];
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Integer.toString((i * 3) + j + 1);
            }
        }
    }
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
             System.out.println("|---|---|---|");
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + board[i][j] + "  ");
            }
                System.out.println("|");
        }
    }
    public boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return true;
            }
            if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
                return true;
            }
        }
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return true;
        }
        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return true;
        }
        return false;
    }
    public boolean checkMove(int move) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        if(board[row][col].equals("X") || board[row][col].equals("O")) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player 1: X");
        System.out.println("Player 2: O");
        game.initializeBoard();
        game.printBoard();
        while(!game.checkWin()) {
        System.out.println("Player 1, enter your move (1-9): ");
            int move = sc.nextInt();
            int row = (move - 1) / 3;
            int col = (move - 1) % 3;
            game.board[row][col] = "X";
            game.printBoard();
            if (game.checkWin()) {
                System.out.println("Player 1 wins!");
                break;
            }
            System.out.println("Player 2, enter your move (1-9): ");
            move = sc.nextInt();
            row = (move - 1) / 3;
            col = (move - 1) % 3;
            game.board[row][col] = "O";
            game.printBoard();
            if (game.checkWin()) {
                System.out.println("Player 2 wins!");
                break;
            }
        }
    }
}

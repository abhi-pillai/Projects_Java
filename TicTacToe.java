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
        if (move < 1 || move > 9) {
        return false;
    }
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        if(board[row][col].equals("X") || board[row][col].equals("O")) {
            return false;
        }
        return true;
    }
    public void makeMove(int move, String player) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        board[row][col] = player;
    }
    public boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!board[i][j].equals("X") && !board[i][j].equals("O")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner sc = new Scanner(System.in);
        String playAgain;
        try{
        do{
        System.out.println("\t---------------- Welcome to Tic Tac Toe! ----------------");
        System.out.println("| Player 1: X  |");
        System.out.println("| Player 2: O  |");
        System.out.println("\n");
        game.initializeBoard();
        game.printBoard();
        System.out.println("\n");
        while(!game.checkWin()) {
            System.out.print("Player 1, enter your move (1-9): ");
            int move1 = sc.nextInt();
            while(!game.checkMove(move1)) {
                System.out.print("Invalid move. Player 1, enter your move (1-9): ");
                move1 = sc.nextInt();
            }
            game.makeMove(move1, "X");
            game.printBoard();
            System.out.println("\n");
            if(game.checkWin()) {
                System.out.println("Player 1 wins!");
                break;
            }
            if(game.checkDraw()) {
                System.out.println("\n");
                System.out.println("It's a draw!");
                break;
            }
            System.out.print("Player 2, enter your move (1-9): ");
            int move2 = sc.nextInt();
            while(!game.checkMove(move2)) {
                System.out.print("Invalid move. Player 2, enter your move (1-9): ");
                move2 = sc.nextInt();
            }
            game.makeMove(move2, "O");
            game.printBoard();
            System.out.println("\n");
            if(game.checkWin()) {
                System.out.println("Player 2 wins!");
                break;
            }
            if(game.checkDraw()) {
                System.out.println("\n");
                System.out.println("It's a draw!");
                break;
            }
        }
        System.out.println("Do you want to play again? (yes/no)");
        playAgain = sc.next();
        System.out.println("\n");
    }while(playAgain.equalsIgnoreCase("yes"));
            System.out.println("\n");
            System.out.println("Game Over!\nThanks for playing!");
    } catch(Exception e) {
            System.out.println("\n");
            System.out.println("Exiting the game. Goodbye!!!!");
            System.out.println("\n");
        }
        finally {
            sc.close();
        }
    }
}

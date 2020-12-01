import java.util.*;
public class TikTakToe {
    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLS = 3;
    private String regex = "\\s{3}";
    
    public TikTakToe(){
        board = new String[ROWS][COLS];
    }

    // initializing board
    public void initializeBoard(){
        for(int i = 0; i<ROWS; i++){
            for(int j = 0; j<COLS; j++){
                board[i][j] = "   ";
            }
        }
    }


    //setting player move
    public void setPlay(int i, int j, String player){
        if(this.board[i][j].matches(regex)){
            board[i][j] = " " +  player + " "; 
        }
    }

    //
    public boolean isGameOver(){
        //checking rows
        for(int i = 0; i<ROWS; i++){
            if(!board[i][0].matches(regex) && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])){
                return true;
            }
        }
        for(int j = 0; j<COLS;j++){
            if(!board[0][j].matches(regex) && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])){
                return true;
            }
        }

        //checking diagonals
        if(!board[0][0].matches(regex) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])){
            return true;
        }
        if(!board[0][2].matches(regex) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])){
            return true;
        }

        return false;
    }

    //it returns strBoard for playing
    public String printBoard(){
        String strBoard = "";
        for(int i = 0; i<ROWS; i++){
            for(int j = 0; j<COLS;j++){
                if(j != COLS-1)
                    strBoard += board[i][j] + "|";
                else
                    strBoard += board[i][j];
            }
            if(i != COLS-1)
                strBoard += "\n---+---+---\n";
        }
        return strBoard;
    }


    //mainMethod
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TikTakToe game = new TikTakToe();
        game.initializeBoard();
        String player = "X";
        do{
            System.out.println(game.printBoard());
            System.out.println("Enter coordinates for rows: ");
            int row = sc.nextInt();
            System.out.println("Enter coordinates for col: ");
            int col = sc.nextInt();
            game.setPlay(row, col, player);
            if(game.isGameOver()){
                System.out.println(game.printBoard());
                System.out.println("Game Over" + "\n" + player + " wins!");
                break;
            }
            if(player == "X"){
                player = "0";
            }else{
                player = "X";
            }
        }while(true);
        sc.close();
    }

}

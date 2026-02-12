package tictactoe.Model;


public class Board {

    private char[][]board;
    public static final int SIZE=3;

    public Board(){
        board=new char[SIZE][SIZE];
        reset();
    }

    public void reset(){
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                board[i][j]=' ';
            }
        }
    }

    public boolean placeMark(int cell, char mark) {
        if(cell<1||cell>9)return false;
        int row=(cell-1)/3;
        int column=(cell-1)%3;
        if(board[row][column]==' '){
            board [row][column]=mark;
            return true;
        }
        return false;
    }
    public Boolean isFull(){
        for(char[]row:board){
            for(char c:row){
                if(c==' ')return false;
            }
        }
        return true;
    }

    public Boolean checkWin(char mark){

        for(int i=0;i<SIZE;i++){
            if(board[i][0]==mark&&board[i][1]==mark&&board[i][2]==mark)return true;
            if(board[0][i]==mark&&board[1][i]==mark&&board[2][i]==mark)return true;
        }
        return(board[0][0] == mark && board[1][1] == mark && board[2][2] == mark) ||
               (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark);
    }

    public char[][] getBoard() {
        return board;
    }
    
}

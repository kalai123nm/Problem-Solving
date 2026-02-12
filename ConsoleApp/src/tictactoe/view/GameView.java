package tictactoe.view;

import tictactoe.Model.Board;

public class GameView {
    public void displayBoard(Board board){
        char[][]b=board.getBoard();
        int cell=1;
        System.out.println("\nBoard: ");
        for(int i=0;i<Board.SIZE;i++){
            for(int j=0;j<Board.SIZE;j++){
                if(b[i][j]==' '){
                    System.out.print(" "+cell+" ");
                }else{
                    System.out.print(" "+b[i][j]+" ");
                }if(j<2)System.out.print("|");
                cell++;
            }
            System.out.println();
            if(i<2)System.out.println("---+---+---");
        }System.out.println();
    }

    public void showMessage(String msg){
        System.out.println(msg);
    }
}

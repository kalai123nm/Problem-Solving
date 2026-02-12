package tictactoe.Strategy;

import java.util.Scanner;

import tictactoe.Model.Board;

public class PlayerMoveStrategy implements MoveStrategy{
    private Scanner scan=new Scanner(System.in);

    @Override
    public void makeMove(Board board, char mark) {
        int cell;
        while(true){
            System.out.println("Choose 1-9");
            cell=scan.nextInt();
            if(board.placeMark(cell,mark))break;
            System.out.println("Invalid move! try again");

        }
    }
    
}

package tictactoe.controller;

import java.util.Random;

import tictactoe.Model.Board;
import tictactoe.Model.Player;
import tictactoe.view.GameView;

public class GameContoller {
    private static GameContoller instance;
    private Board board;
    private GameView view;
    private Player currentPlayer;
    private Player player1,player2;

    private GameContoller(){
        board=new Board();
        view=new GameView();
    }
    public static GameContoller getInstance(){
        if(instance==null){
            instance=new GameContoller();
        }
        return instance;
    }
    public void startGame(Player p1, Player p2){
        player1=p1;
        player2=p2;
        currentPlayer=new Random().nextBoolean()?player1:player2;
        view.showMessage("\nToss result: "+currentPlayer.getName()+" starts the game");
        int moveCount=0;
        while(true){
            view.displayBoard(board);
            view.showMessage(currentPlayer.getName()+"'s turn ("+currentPlayer.getMark()+")");
            currentPlayer.makeMove(board);
            moveCount++;

            if(moveCount>=3 && board.checkWin(currentPlayer.getMark())){
                view.displayBoard(board);
                view.showMessage("Winner is "+currentPlayer.getName());
                break;
            }
            if(board.isFull()){
                view.displayBoard(board);
                view.showMessage("Match Draw!");
                break;
            }
            switchPlayer();
        }
    }
    private void switchPlayer(){
        currentPlayer=(currentPlayer==player1)?player2:player1;
    }
}

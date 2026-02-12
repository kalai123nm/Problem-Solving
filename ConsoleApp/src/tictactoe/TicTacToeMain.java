package tictactoe;
import java.util.Scanner;

import tictactoe.Model.Player;
import tictactoe.Strategy.PlayerMoveStrategy;
import tictactoe.controller.GameContoller;

public class TicTacToeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Player1 Name: ");
        String p1Name=sc.nextLine();
        System.out.println("Enter Player2 Name: ");
        String p2Name=sc.nextLine();

        Player p1=new Player(p1Name,'X',new PlayerMoveStrategy());
        Player p2 = new Player(p2Name,'O',new PlayerMoveStrategy()); 

        GameContoller controller=GameContoller.getInstance();
        controller.startGame(p1,p2);
    }
}

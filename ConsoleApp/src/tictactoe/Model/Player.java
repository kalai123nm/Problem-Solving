package tictactoe.Model;

import tictactoe.Strategy.MoveStrategy;

public class Player {
    private String name;
    private char mark;
    private MoveStrategy strategy;

    public Player(String name, char mark, MoveStrategy strategy){
        this.name=name;
        this.mark=mark;
        this.strategy=strategy;
    }
    public String getName(){
        return name;
    }
    public char getMark(){
        return mark;
    }
    public void makeMove(Board board){
        strategy.makeMove(board, mark);
    }
    
}
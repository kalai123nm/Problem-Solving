package tictactoe.Strategy;

import tictactoe.Model.Board;

public interface MoveStrategy {
    void makeMove(Board board, char mark);
} 

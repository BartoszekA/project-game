package com.kodilla.game;

public class TicTacToeLogic {

    public Board nextMove(Board board, int place, Symbol symbol) {
        if (board.getBoard().get(place) instanceof Blank) {
            board.getBoard().set(place, symbol);
        }
        return board;
    }

    public boolean checkIfVictory(Board board) {

        return (board.getBoard().get(0) instanceof Cross && board.getBoard().get(1) instanceof Cross && board.getBoard().get(2) instanceof Cross) ||
                (board.getBoard().get(3) instanceof Cross && board.getBoard().get(4) instanceof Cross && board.getBoard().get(5) instanceof Cross) ||
                (board.getBoard().get(6) instanceof Cross && board.getBoard().get(7) instanceof Cross && board.getBoard().get(2) instanceof Cross) ||
                (board.getBoard().get(0) instanceof Cross && board.getBoard().get(3) instanceof Cross && board.getBoard().get(6) instanceof Cross) ||
                (board.getBoard().get(1) instanceof Cross && board.getBoard().get(4) instanceof Cross && board.getBoard().get(7) instanceof Cross) ||
                (board.getBoard().get(2) instanceof Cross && board.getBoard().get(5) instanceof Cross && board.getBoard().get(8) instanceof Cross) ||
                (board.getBoard().get(0) instanceof Cross && board.getBoard().get(4) instanceof Cross && board.getBoard().get(8) instanceof Cross) ||
                (board.getBoard().get(2) instanceof Cross && board.getBoard().get(4) instanceof Cross && board.getBoard().get(6) instanceof Cross) ||

                (board.getBoard().get(0) instanceof Circle && board.getBoard().get(1) instanceof Circle && board.getBoard().get(2) instanceof Circle) ||
                (board.getBoard().get(3) instanceof Circle && board.getBoard().get(4) instanceof Circle && board.getBoard().get(5) instanceof Circle) ||
                (board.getBoard().get(6) instanceof Circle && board.getBoard().get(7) instanceof Circle && board.getBoard().get(2) instanceof Circle) ||
                (board.getBoard().get(0) instanceof Circle && board.getBoard().get(3) instanceof Circle && board.getBoard().get(6) instanceof Circle) ||
                (board.getBoard().get(1) instanceof Circle && board.getBoard().get(4) instanceof Circle && board.getBoard().get(7) instanceof Circle) ||
                (board.getBoard().get(2) instanceof Circle && board.getBoard().get(5) instanceof Circle && board.getBoard().get(8) instanceof Circle) ||
                (board.getBoard().get(0) instanceof Circle && board.getBoard().get(4) instanceof Circle && board.getBoard().get(8) instanceof Circle) ||
                (board.getBoard().get(2) instanceof Circle && board.getBoard().get(4) instanceof Circle && board.getBoard().get(6) instanceof Circle);



    }

    public boolean checkLoss(Board board) {
        for(Symbol item : board.getBoard()) {
            if (item instanceof Blank) return true;
        }
        return false;
    }
}

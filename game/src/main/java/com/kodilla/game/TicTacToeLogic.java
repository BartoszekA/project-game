package com.kodilla.game;

public class TicTacToeLogic {
    private Symbol currentSymbol;
    private Board currentBoard;

    public Board getCurrentBoard() {
        return currentBoard;
    }

    public Board nextMove(Board board, int place, Symbol symbol) {

        if (board.getBoard().get(place) instanceof Blank) {
            board.getBoard().set(place, symbol);
            currentSymbol = symbol;
            currentBoard = board;
        }
        return board;
    }

    public boolean checkIfVictory(Board board) {

        return (board.getBoard().get(0) instanceof Cross && board.getBoard().get(1) instanceof Cross && board.getBoard().get(2) instanceof Cross) ||
                (board.getBoard().get(3) instanceof Cross && board.getBoard().get(4) instanceof Cross && board.getBoard().get(5) instanceof Cross) ||
                (board.getBoard().get(6) instanceof Cross && board.getBoard().get(7) instanceof Cross && board.getBoard().get(8) instanceof Cross) ||
                (board.getBoard().get(0) instanceof Cross && board.getBoard().get(3) instanceof Cross && board.getBoard().get(6) instanceof Cross) ||
                (board.getBoard().get(1) instanceof Cross && board.getBoard().get(4) instanceof Cross && board.getBoard().get(7) instanceof Cross) ||
                (board.getBoard().get(2) instanceof Cross && board.getBoard().get(5) instanceof Cross && board.getBoard().get(8) instanceof Cross) ||
                (board.getBoard().get(0) instanceof Cross && board.getBoard().get(4) instanceof Cross && board.getBoard().get(8) instanceof Cross) ||
                (board.getBoard().get(2) instanceof Cross && board.getBoard().get(4) instanceof Cross && board.getBoard().get(6) instanceof Cross) ||

                (board.getBoard().get(0) instanceof Circle && board.getBoard().get(1) instanceof Circle && board.getBoard().get(2) instanceof Circle) ||
                (board.getBoard().get(3) instanceof Circle && board.getBoard().get(4) instanceof Circle && board.getBoard().get(5) instanceof Circle) ||
                (board.getBoard().get(6) instanceof Circle && board.getBoard().get(7) instanceof Circle && board.getBoard().get(8) instanceof Circle) ||
                (board.getBoard().get(0) instanceof Circle && board.getBoard().get(3) instanceof Circle && board.getBoard().get(6) instanceof Circle) ||
                (board.getBoard().get(1) instanceof Circle && board.getBoard().get(4) instanceof Circle && board.getBoard().get(7) instanceof Circle) ||
                (board.getBoard().get(2) instanceof Circle && board.getBoard().get(5) instanceof Circle && board.getBoard().get(8) instanceof Circle) ||
                (board.getBoard().get(0) instanceof Circle && board.getBoard().get(4) instanceof Circle && board.getBoard().get(8) instanceof Circle) ||
                (board.getBoard().get(2) instanceof Circle && board.getBoard().get(4) instanceof Circle && board.getBoard().get(6) instanceof Circle);
    }

    public boolean areAnyBlankFieldsOnBoard(Board board) {
        for(Symbol item : board.getBoard()) {
            if (item instanceof Blank) return true;
        }
        return false;
    }

    public Symbol getNextSymbol(){
        if (currentSymbol instanceof Circle) {
            return new Cross();
        } else {
            return new Circle();
        }
    }
}

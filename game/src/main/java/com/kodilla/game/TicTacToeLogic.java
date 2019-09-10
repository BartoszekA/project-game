package com.kodilla.game;

import java.util.ArrayList;

public class TicTacToeLogic {

    public ArrayList<Symbol> nextMove(ArrayList<Symbol> board, int place, Symbol symbol) {
        if (board.get(place) instanceof Blank) {
            board.set(place, symbol);
        }
        return board;
    }

    public boolean checkIfVictory(ArrayList<Symbol> board) {

        return (board.get(0) instanceof Cross && board.get(1) instanceof Cross && board.get(2) instanceof Cross) ||
                (board.get(3) instanceof Cross && board.get(4) instanceof Cross && board.get(5) instanceof Cross) ||
                (board.get(6) instanceof Cross && board.get(7) instanceof Cross && board.get(2) instanceof Cross) ||
                (board.get(0) instanceof Cross && board.get(3) instanceof Cross && board.get(6) instanceof Cross) ||
                (board.get(1) instanceof Cross && board.get(4) instanceof Cross && board.get(7) instanceof Cross) ||
                (board.get(2) instanceof Cross && board.get(5) instanceof Cross && board.get(8) instanceof Cross) ||
                (board.get(0) instanceof Cross && board.get(4) instanceof Cross && board.get(8) instanceof Cross) ||
                (board.get(2) instanceof Cross && board.get(4) instanceof Cross && board.get(6) instanceof Cross) ||

                (board.get(0) instanceof Circle && board.get(1) instanceof Circle && board.get(2) instanceof Circle) ||
                (board.get(3) instanceof Circle && board.get(4) instanceof Circle && board.get(5) instanceof Circle) ||
                (board.get(6) instanceof Circle && board.get(7) instanceof Circle && board.get(2) instanceof Circle) ||
                (board.get(0) instanceof Circle && board.get(3) instanceof Circle && board.get(6) instanceof Circle) ||
                (board.get(1) instanceof Circle && board.get(4) instanceof Circle && board.get(7) instanceof Circle) ||
                (board.get(2) instanceof Circle && board.get(5) instanceof Circle && board.get(8) instanceof Circle) ||
                (board.get(0) instanceof Circle && board.get(4) instanceof Circle && board.get(8) instanceof Circle) ||
                (board.get(2) instanceof Circle && board.get(4) instanceof Circle && board.get(6) instanceof Circle);

    }

    public boolean checkLoss(ArrayList<Symbol> board) {
        for(Symbol item : board) {
            if (item instanceof Blank) return true;
        }
        return false;
    }
}

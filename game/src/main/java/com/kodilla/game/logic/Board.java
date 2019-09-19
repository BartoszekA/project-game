package com.kodilla.game.logic;

import java.util.ArrayList;

public class Board {
    ArrayList<Symbol> board;

    public Board(ArrayList<Symbol> board) {
        this.board = board;
    }

    public ArrayList<Symbol> getBoard() {
        return board;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Board)) return false;

        Board board1 = (Board) o;

        return board != null ? board.equals(board1.board) : board1.board == null;
    }

    @Override
    public int hashCode() {
        return board != null ? board.hashCode() : 0;
    }

    public static Board createBoard() {
        ArrayList<Symbol> emptyBoard = new ArrayList<>();
        emptyBoard.add(new Blank());
        emptyBoard.add(new Blank());
        emptyBoard.add(new Blank());
        emptyBoard.add(new Blank());
        emptyBoard.add(new Blank());
        emptyBoard.add(new Blank());
        emptyBoard.add(new Blank());
        emptyBoard.add(new Blank());
        emptyBoard.add(new Blank());

        Board board = new Board(emptyBoard);

        return board;
    }
}

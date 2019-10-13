package com.kodilla.game.ui;

import com.kodilla.game.logic.Blank;
import com.kodilla.game.logic.Board;
import com.kodilla.game.logic.Symbol;
import com.kodilla.game.logic.TicTacToeLogic;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

import java.util.List;
import java.util.Random;

public class Computer {
   private VictoryChecker victoryChecker;
   private GridPane gridPane;
   private Board board;
   private TicTacToeLogic logic;
   private MoveDrawer moveDrawer;

    public Computer(VictoryChecker victoryChecker, GridPane gridPane, Board board, TicTacToeLogic logic, MoveDrawer moveDrawer) {
        this.victoryChecker = victoryChecker;
        this.gridPane = gridPane;
        this.board = board;
        this.logic = logic;
        this.moveDrawer = moveDrawer;
    }


    public Board computerMove(List<Rectangle> fields) {
        Random random = new Random();
        int a = random.nextInt(fields.size());
        System.out.println(a);
        if (board.getBoard().get(a) instanceof Blank) {
            Symbol nextSymbol = logic.getNextSymbol();
            if (nextSymbol instanceof com.kodilla.game.logic.Circle) {
                moveDrawer.drawCircle(gridPane, gridPane.getColumnIndex(fields.get(a)), gridPane.getRowIndex(fields.get(a)));
            } else {
                moveDrawer.drawCross(gridPane, gridPane.getColumnIndex(fields.get(a)), gridPane.getRowIndex(fields.get(a)));
            }
            logic.nextMove(board, a, nextSymbol);
            boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
            if (victory) {
                victoryChecker.victory("Przegrałeś! Koniec gry.");
            } else {
                System.out.println("Try again!");
            }
        } else {
            if (logic.areAnyBlankFieldsOnBoard(board)) {
                a = random.nextInt(fields.size());
                computerMove(fields);
            }
        }
        return board;
    }
}

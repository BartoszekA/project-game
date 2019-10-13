package com.kodilla.game.ui;

import com.kodilla.game.logic.Blank;
import com.kodilla.game.logic.Board;
import com.kodilla.game.logic.Symbol;
import com.kodilla.game.logic.TicTacToeLogic;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.List;

public class Assigner {
    private Computer computer;
    private VictoryChecker victoryChecker;
    private MoveDrawer moveDrawer;

    private Board board;
    private TicTacToeLogic logic;
    private GridPane gridPane;

    public Assigner(Computer computer, VictoryChecker victoryChecker, MoveDrawer moveDrawer, Board board, TicTacToeLogic logic, GridPane gridPane) {
        this.computer = computer;
        this.victoryChecker = victoryChecker;
        this.moveDrawer = moveDrawer;
        this.board = board;
        this.logic = logic;
        this.gridPane = gridPane;
    }


    public void assignFieldHandler(List<Rectangle> fields) {

        fields.get(0).setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                createHandler(0,0, fields, 0);
            }
        });

        fields.get(1).setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                createHandler(0,1, fields, 1);
            }
        });

        fields.get(2).setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                createHandler(0,2, fields, 2);
            }
        });

        fields.get(3).setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                createHandler(1,0, fields, 3);
            }
        });

        fields.get(4).setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                createHandler(1,1, fields, 4);
            }
        });

        fields.get(5).setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                createHandler(1,2, fields, 5);
            }
        });

        fields.get(6).setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                createHandler(2,0, fields, 6);
            }
        });

        fields.get(7).setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                createHandler(2,1, fields, 7);
            }
        });

        fields.get(8).setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                createHandler(2, 2, fields, 8);
            }
        });
    }


    private void createHandler(int row, int column, List<Rectangle> fields, int place) {
        if (board.getBoard().get(place) instanceof Blank) {
            Symbol nextSymbol = logic.getNextSymbol();
            if (nextSymbol instanceof com.kodilla.game.logic.Circle) {
                moveDrawer.drawCircle(gridPane, row, column);
            } else {
                moveDrawer.drawCross(gridPane, row, column);
            }
            logic.nextMove(board, place, nextSymbol);
            boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
            if (victory) {
                System.out.println("Victory!");
                victoryChecker.victory("Wygrałeś!");
            } else {
                System.out.println("Try again!");
                computer.computerMove(fields);
            }
        }
    }
}

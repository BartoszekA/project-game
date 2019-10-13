package com.kodilla.game.ui;

import com.kodilla.game.logic.Board;
import com.kodilla.game.logic.TicTacToeLogic;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.List;


public class TicTacToe extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {
        Board board = Board.createBoard();
        TicTacToeLogic logic = new TicTacToeLogic();
        RectangleFactory rectangleFactory = new RectangleFactory();
        MoveDrawer moveDrawer = new MoveDrawer();
        GridFactory pane = new GridFactory();
        GridPane grid = pane.createGrid(myStage);
        VictoryChecker victoryChecker = new VictoryChecker(myStage);
        Computer computer = new Computer(victoryChecker, grid, board, logic, moveDrawer);
        Assigner assigner = new Assigner(computer, victoryChecker, moveDrawer, board, logic, grid);
        List<Rectangle> fields = rectangleFactory.getFields(grid);

        assigner.assignFieldHandler(fields);
        grid.getChildren().addAll(fields);
    }
}


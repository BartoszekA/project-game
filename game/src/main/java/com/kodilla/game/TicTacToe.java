package com.kodilla.game;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class TicTacToe extends Application {

    private Image imgback = new Image("https://i.ibb.co/z8tdB6T/imgbckgrd.jpg");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage)  {

        BackgroundSize backgroundSize = new BackgroundSize(600, 600, false, false, false, false);
        BackgroundImage backgroundImage = new BackgroundImage(imgback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        //grid.setAlignment(Pos.TOP_LEFT);
        grid.setBackground(background);
        grid.setPadding(new Insets(100, 150, 200, 150));
        grid.setGridLinesVisible(true);
        grid.getColumnConstraints().add(new ColumnConstraints(100));
        grid.getColumnConstraints().add(new ColumnConstraints(100));
        grid.getColumnConstraints().add(new ColumnConstraints(100));
        grid.getRowConstraints().add(new RowConstraints(100));
        grid.getRowConstraints().add(new RowConstraints(100));
        grid.getRowConstraints().add(new RowConstraints(100));



        Circle circle = new Circle();
        //circle.setCenterX(200);
        //circle.setCenterY(200);
        circle.setRadius(25);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.RED);
        circle.setStrokeWidth(5);
        //circle.relocate(250, 300);

        grid.setConstraints(circle, 0, 0);



        Line lineA = new Line(100, 150, 200, 250);
        lineA.setStroke(Color.RED);
        lineA.setStrokeWidth(5);

        Line lineB = new Line(100, 250, 200, 150);
        lineB.setStroke(Color.RED);
        lineB.setStrokeWidth(5);

        grid.setConstraints(lineA, 1, 0);
        grid.setConstraints(lineB, 1, 0);

        grid.getChildren().addAll(circle, lineA, lineB);

        Scene scene = new Scene(grid, 600, 600, Color.BLACK);

        myStage.setTitle("Kółko i krzyżyk");
        myStage.setScene(scene);
        myStage.show();
    }
}

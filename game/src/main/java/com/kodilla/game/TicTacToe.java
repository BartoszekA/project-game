package com.kodilla.game;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class TicTacToe extends Application {

    private Image imgback = new Image("https://i.ibb.co/z8tdB6T/imgbckgrd.jpg");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage)  {

        BackgroundSize backgroundSize = new BackgroundSize(600, 600, false, false, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imgback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, null);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setBackground(background);
        grid.setPadding(new Insets(100, 100, 150, 100));



        Circle circle = new Circle();
        //circle.setCenterX(200);
        //circle.setCenterY(200);
        circle.setRadius(25);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5);

        grid.setConstraints(circle, 0, 0);

        grid.getChildren().add(circle);

        Scene scene = new Scene(grid, 600, 600, Color.BLACK);

        myStage.setTitle("Kółko i krzyżyk");
        myStage.setScene(scene);
        myStage.show();
    }
}

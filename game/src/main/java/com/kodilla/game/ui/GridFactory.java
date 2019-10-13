package com.kodilla.game.ui;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GridFactory {

    public GridPane createGrid(Stage myStage) {

        BorderPane root = new BorderPane();
        Menu menu1 = new Menu("Plik");
        MenuItem closeGame = new MenuItem("Zakończ grę");
        closeGame.setOnAction(e -> Platform.exit());

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu1);
        menu1.getItems().add(closeGame);

        Image imgback = new Image("https://i.ibb.co/SJtMQts/imgbck.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(600, 600, false, false, false, false);
        BackgroundImage backgroundImage = new BackgroundImage(imgback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setBackground(background);
        grid.setPadding(new Insets(100, 150, 200, 150));

        grid.getColumnConstraints().add(new ColumnConstraints(100));
        grid.getColumnConstraints().add(new ColumnConstraints(100));
        grid.getColumnConstraints().add(new ColumnConstraints(100));
        grid.getRowConstraints().add(new RowConstraints(100));
        grid.getRowConstraints().add(new RowConstraints(100));
        grid.getRowConstraints().add(new RowConstraints(100));


        Scene scene = new Scene(root, 600, 600, Color.BLACK);
        myStage.setResizable(false);
        myStage.setTitle("Kółko i krzyżyk");
        myStage.setScene(scene);
        myStage.show();

        root.setTop(menuBar);
        root.setCenter(grid);

        return grid;
    }
}

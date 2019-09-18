package com.kodilla.game;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class TicTacToe extends Application {

    private Image imgback = new Image("https://i.ibb.co/z8tdB6T/imgbckgrd.jpg");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {

        Board board = Board.createBoard();
        TicTacToeLogic logic = new TicTacToeLogic();

        BackgroundSize backgroundSize = new BackgroundSize(600, 600, false, false, false, false);
        BackgroundImage backgroundImage = new BackgroundImage(imgback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        // Menu
        BorderPane root = new BorderPane();
        Menu menu1 = new Menu("Plik");
        MenuItem newGame = new MenuItem("Nowa gra");
        MenuItem closeGame = new MenuItem("Zakończ grę");
        closeGame.setOnAction(e -> Platform.exit());

        Menu menu2 = new Menu("Opcje");
        Menu menu3 = new Menu("Pomoc");
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(menu1, menu2, menu3);
        menu1.getItems().addAll(newGame, closeGame);


        // GridPane
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

        // Panes order
        root.setTop(menuBar);
        root.setCenter(grid);

        //setGridLinesVisible to be removed then

        grid.setGridLinesVisible(true);


        //board
        Rectangle r00 = new Rectangle(100, 100);
        r00.setStroke(Color.RED);
        r00.setStrokeWidth(5);
        r00.setFill(Color.TRANSPARENT);
        grid.setConstraints(r00, 0, 0);

        Rectangle r01 = new Rectangle(100, 100);
        r01.setStroke(Color.RED);
        r01.setStrokeWidth(5);
        r01.setFill(Color.TRANSPARENT);
        grid.setConstraints(r01, 0, 1);

        Rectangle r02 = new Rectangle(100, 100);
        r02.setStroke(Color.RED);
        r02.setStrokeWidth(5);
        r02.setFill(Color.TRANSPARENT);
        grid.setConstraints(r02, 0, 2);

        Rectangle r10 = new Rectangle(100, 100);
        r10.setStroke(Color.RED);
        r10.setStrokeWidth(5);
        r10.setFill(Color.TRANSPARENT);
        grid.setConstraints(r10, 1, 0);

        Rectangle r11 = new Rectangle(100, 100);
        r11.setStroke(Color.RED);
        r11.setStrokeWidth(5);
        r11.setFill(Color.TRANSPARENT);
        grid.setConstraints(r11, 1, 1);

        Rectangle r12 = new Rectangle(100, 100);
        r12.setStroke(Color.RED);
        r12.setStrokeWidth(5);
        r12.setFill(Color.TRANSPARENT);
        grid.setConstraints(r12, 1, 2);

        Rectangle r20 = new Rectangle(100, 100);
        r20.setStroke(Color.RED);
        r20.setStrokeWidth(5);
        r20.setFill(Color.TRANSPARENT);
        grid.setConstraints(r20, 2, 0);

        Rectangle r21 = new Rectangle(100, 100);
        r21.setStroke(Color.RED);
        r21.setStrokeWidth(5);
        r21.setFill(Color.TRANSPARENT);
        grid.setConstraints(r21, 2, 1);

        Rectangle r22 = new Rectangle(100, 100);
        r22.setStroke(Color.RED);
        r22.setStrokeWidth(5);
        r22.setFill(Color.TRANSPARENT);
        grid.setConstraints(r22, 2, 2);

        List<Rectangle> fields = Arrays.asList(r00, r01, r02, r10, r11, r12, r20, r21, r22);


        r00.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (board.getBoard().get(0) instanceof Blank) {
                    Symbol nextSymbol = logic.getNextSymbol();
                    if (nextSymbol instanceof com.kodilla.game.Circle) {
                        drawCircle(grid, grid.getColumnIndex(r00), grid.getRowIndex(r00));
                    } else {
                        drawCross(grid, grid.getColumnIndex(r00), grid.getRowIndex(r00));
                    }
                    logic.nextMove(board, 0, nextSymbol);
                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
                    if (victory) {
                        System.out.println("Victory!");
                    } else {
                        System.out.println("Try again!");
                        computerMove(grid, board, logic, fields);
                    }
                }
            }
        });

        r01.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (board.getBoard().get(1) instanceof Blank) {
                    Symbol nextSymbol = logic.getNextSymbol();
                    if (nextSymbol instanceof com.kodilla.game.Circle) {
                        drawCircle(grid, grid.getColumnIndex(r01), grid.getRowIndex(r01));
                    } else {
                        drawCross(grid, grid.getColumnIndex(r01), grid.getRowIndex(r01));
                    }
                    logic.nextMove(board, 1, nextSymbol);
                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
                    if (victory) {
                        System.out.println("Victory!");
                    } else {
                        System.out.println("Try again!");
                        computerMove(grid, board, logic, fields);
                    }
                }
            }
        });

        r02.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (board.getBoard().get(2) instanceof Blank) {
                    Symbol nextSymbol = logic.getNextSymbol();
                    if (nextSymbol instanceof com.kodilla.game.Circle) {
                        drawCircle(grid, grid.getColumnIndex(r02), grid.getRowIndex(r02));
                    } else {
                        drawCross(grid, grid.getColumnIndex(r02), grid.getRowIndex(r02));
                    }
                    logic.nextMove(board, 2, nextSymbol);
                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
                    if (victory) {
                        System.out.println("Victory!");
                    } else {
                        System.out.println("Try again!");
                        computerMove(grid, board, logic, fields);
                    }
                }
            }
        });

        r10.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (board.getBoard().get(3) instanceof Blank) {
                    Symbol nextSymbol = logic.getNextSymbol();
                    if (nextSymbol instanceof com.kodilla.game.Circle) {
                        drawCircle(grid, grid.getColumnIndex(r10), grid.getRowIndex(r10));
                    } else {
                        drawCross(grid, grid.getColumnIndex(r10), grid.getRowIndex(r10));
                    }
                    logic.nextMove(board, 3, nextSymbol);
                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
                    if (victory) {
                        System.out.println("Victory!");
                    } else {
                        System.out.println("Try again!");
                        computerMove(grid, board, logic, fields);
                    }
                }
            }
        });

        r11.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (board.getBoard().get(4) instanceof Blank) {
                    Symbol nextSymbol = logic.getNextSymbol();
                    if (nextSymbol instanceof com.kodilla.game.Circle) {
                        drawCircle(grid, grid.getColumnIndex(r11), grid.getRowIndex(r11));
                    } else {
                        drawCross(grid, grid.getColumnIndex(r11), grid.getRowIndex(r11));
                    }
                    logic.nextMove(board, 4, nextSymbol);
                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
                    if (victory) {
                        System.out.println("Victory!");
                    } else {
                        System.out.println("Try again!");
                        computerMove(grid, board, logic, fields);
                    }
                }
            }
        });

        r12.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (board.getBoard().get(5) instanceof Blank) {
                    Symbol nextSymbol = logic.getNextSymbol();
                    if (nextSymbol instanceof com.kodilla.game.Circle) {
                        drawCircle(grid, grid.getColumnIndex(r12), grid.getRowIndex(r12));
                    } else {
                        drawCross(grid, grid.getColumnIndex(r12), grid.getRowIndex(r12));
                    }
                    logic.nextMove(board, 5, nextSymbol);
                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
                    if (victory) {
                        System.out.println("Victory!");
                    } else {
                        System.out.println("Try again!");
                        computerMove(grid, board, logic, fields);
                    }
                }
            }
        });

        r20.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (board.getBoard().get(6) instanceof Blank) {
                    Symbol nextSymbol = logic.getNextSymbol();
                    if (nextSymbol instanceof com.kodilla.game.Circle) {
                        drawCircle(grid, grid.getColumnIndex(r20), grid.getRowIndex(r20));
                    } else {
                        drawCross(grid, grid.getColumnIndex(r20), grid.getRowIndex(r20));
                    }
                    logic.nextMove(board, 6, nextSymbol);
                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
                    if (victory) {
                        System.out.println("Victory!");
                    } else {
                        System.out.println("Try again!");
                        computerMove(grid, board, logic, fields);
                    }
                }
            }
        });

        r21.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (board.getBoard().get(7) instanceof Blank) {
                    Symbol nextSymbol = logic.getNextSymbol();
                    if (nextSymbol instanceof com.kodilla.game.Circle) {
                        drawCircle(grid, grid.getColumnIndex(r21), grid.getRowIndex(r21));
                    } else {
                        drawCross(grid, grid.getColumnIndex(r21), grid.getRowIndex(r21));
                    }
                    logic.nextMove(board, 7, nextSymbol);
                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
                    if (victory) {
                        System.out.println("Victory!");
                    } else {
                        System.out.println("Try again!");
                        computerMove(grid, board, logic, fields);
                    }
                }
            }
        });

        r22.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (board.getBoard().get(8) instanceof Blank) {
                    Symbol nextSymbol = logic.getNextSymbol();
                    if (nextSymbol instanceof com.kodilla.game.Circle) {
                        drawCircle(grid, grid.getColumnIndex(r22), grid.getRowIndex(r22));
                    } else {
                        drawCross(grid, grid.getColumnIndex(r22), grid.getRowIndex(r22));
                    }
                    logic.nextMove(board, 8, nextSymbol);
                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
                    if (victory) {
                        System.out.println("Victory!");
                    } else {
                        System.out.println("Try again!");
                        computerMove(grid, board, logic, fields);
                    }
                }
            }
        });


        grid.getChildren().addAll(r00, r01, r02, r10, r11, r12, r20, r21, r22);

        Scene scene = new Scene(root, 600, 600, Color.BLACK);

        myStage.setTitle("Kółko i krzyżyk");
        myStage.setScene(scene);
        myStage.show();
    }

    private void drawCircle(GridPane grid, int a, int b) {
        Circle circle = new Circle();
        circle.setRadius(45);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.RED);
        circle.setStrokeWidth(5);
        grid.setConstraints(circle, a, b);
        grid.getChildren().add(circle);
    }

    private void drawCross(GridPane grid, int a, int b) {
        Line lineA = new Line(a + 1 * 100, b + 1 * 150, a + 1 * 200, b + 1 * 250);
        lineA.setStroke(Color.RED);
        lineA.setStrokeWidth(5);

        Line lineB = new Line(a + 1 * 100, b + 1 * 250, a + 1 * 200, b + 1 * 150);
        lineB.setStroke(Color.RED);
        lineB.setStrokeWidth(5);

        grid.setConstraints(lineA, a, b);
        grid.setConstraints(lineB, a, b);
        grid.getChildren().addAll(lineA, lineB);
    }

    private Board computerMove(GridPane grid, Board board, TicTacToeLogic logic, List<Rectangle> fields) {
        Random random = new Random();
        int a = random.nextInt(fields.size());
        System.out.println(a);
        if (board.getBoard().get(a) instanceof Blank) {
            Symbol nextSymbol = logic.getNextSymbol();
            if (nextSymbol instanceof com.kodilla.game.Circle) {
                drawCircle(grid, grid.getColumnIndex(fields.get(a)), grid.getRowIndex(fields.get(a)));
            } else {
                drawCross(grid, grid.getColumnIndex(fields.get(a)), grid.getRowIndex(fields.get(a)));
            }
            logic.nextMove(board, a, nextSymbol);
            boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
            if (victory) {
                System.out.println("Victory!");
            } else {
                System.out.println("Try again!");
            }
        } else {
            a = random.nextInt(fields.size());
            computerMove(grid, board, logic, fields);
        }
        return board;
    }
}


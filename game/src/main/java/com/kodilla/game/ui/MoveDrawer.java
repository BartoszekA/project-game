package com.kodilla.game.ui;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class MoveDrawer {

    public void drawCircle(GridPane grid, int a, int b) {
        Circle circle = new Circle();
        circle.setRadius(45);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.DEEPPINK);
        circle.setStrokeWidth(5);
        grid.setConstraints(circle, a, b);
        grid.getChildren().add(circle);
    }

    public void drawCross(GridPane grid, int a, int b) {
        Line lineA = new Line(a + 1 * 100, b + 1 * 150, a + 1 * 200, b + 1 * 250);
        lineA.setStroke(Color.DEEPPINK);
        lineA.setStrokeWidth(5);

        Line lineB = new Line(a + 1 * 100, b + 1 * 250, a + 1 * 200, b + 1 * 150);
        lineB.setStroke(Color.DEEPPINK);
        lineB.setStrokeWidth(5);

        grid.setConstraints(lineA, a, b);
        grid.setConstraints(lineB, a, b);
        grid.getChildren().addAll(lineA, lineB);
    }

}

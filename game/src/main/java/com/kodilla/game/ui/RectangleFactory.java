package com.kodilla.game.ui;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.*;

public class RectangleFactory {

    public List<Rectangle> getFields(GridPane grid) {

        Rectangle r00 = new Rectangle(100, 100);
        r00.setStroke(Color.DARKVIOLET);
        r00.setStrokeWidth(5);
        r00.setFill(Color.TRANSPARENT);
        grid.setConstraints(r00, 0, 0);

        Rectangle r01 = new Rectangle(100, 100);
        r01.setStroke(Color.DARKVIOLET);
        r01.setStrokeWidth(5);
        r01.setFill(Color.TRANSPARENT);
        grid.setConstraints(r01, 0, 1);

        Rectangle r02 = new Rectangle(100, 100);
        r02.setStroke(Color.DARKVIOLET);
        r02.setStrokeWidth(5);
        r02.setFill(Color.TRANSPARENT);
        grid.setConstraints(r02, 0, 2);

        Rectangle r10 = new Rectangle(100, 100);
        r10.setStroke(Color.DARKVIOLET);
        r10.setStrokeWidth(5);
        r10.setFill(Color.TRANSPARENT);
        grid.setConstraints(r10, 1, 0);

        Rectangle r11 = new Rectangle(100, 100);
        r11.setStroke(Color.DARKVIOLET);
        r11.setStrokeWidth(5);
        r11.setFill(Color.TRANSPARENT);
        grid.setConstraints(r11, 1, 1);

        Rectangle r12 = new Rectangle(100, 100);
        r12.setStroke(Color.DARKVIOLET);
        r12.setStrokeWidth(5);
        r12.setFill(Color.TRANSPARENT);
        grid.setConstraints(r12, 1, 2);

        Rectangle r20 = new Rectangle(100, 100);
        r20.setStroke(Color.DARKVIOLET);
        r20.setStrokeWidth(5);
        r20.setFill(Color.TRANSPARENT);
        grid.setConstraints(r20, 2, 0);

        Rectangle r21 = new Rectangle(100, 100);
        r21.setStroke(Color.DARKVIOLET);
        r21.setStrokeWidth(5);
        r21.setFill(Color.TRANSPARENT);
        grid.setConstraints(r21, 2, 1);

        Rectangle r22 = new Rectangle(100, 100);
        r22.setStroke(Color.DARKVIOLET);
        r22.setStrokeWidth(5);
        r22.setFill(Color.TRANSPARENT);
        grid.setConstraints(r22, 2, 2);

        List<Rectangle> fields = Arrays.asList(r00, r01, r02, r10, r11, r12, r20, r21, r22);

        return fields;
    }
}
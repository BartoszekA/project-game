package com.kodilla.game.ui;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.stage.Popup;
import javafx.stage.PopupWindow;
import javafx.stage.Stage;

public class VictoryChecker {
    private Stage stage;

    public VictoryChecker(Stage stage) {
        this.stage = stage;
    }

    public void victory(String message) {
        Popup popup = new Popup();
        Button btn = new Button(message);
        btn.setOnAction(e -> Platform.exit());
        popup.getContent().add(btn);
        popup.setAnchorLocation(PopupWindow.AnchorLocation.CONTENT_BOTTOM_LEFT);
        popup.show(stage);
    }
}

package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DecisionController {

    @FXML
    private Label message;

    public void setTxt(String text) {
        this.message.setText(text);
    }
}


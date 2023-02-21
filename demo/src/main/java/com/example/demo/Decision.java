package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Decision extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("decision.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 440);
        stage.setTitle("Guess The Game");
        stage.setScene(scene);
        String msg;
        stage.show();

    }
}

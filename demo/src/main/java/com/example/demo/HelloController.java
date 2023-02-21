package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    String name;
    int x,count=2,a;

    @FXML
    private Label changetext;

    @FXML
    private TextField playername;

    @FXML
    private Label selectmsg;



    @FXML
    void Numberbtn(ActionEvent event) {
        int min = 1;
        int max = 3;
         x = (int) (Math.random()*(max-min+1)+min);
         selectmsg.setText("Your Number Iis Generated Guess the Number and select the proper Circle");

    }
    void action() throws IOException {
        if(a==x)
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Decision.fxml"));
            Parent root = loader.load();
            DecisionController decisionController = loader.getController();
            decisionController.setTxt("YOU WON!");
            Stage msgStage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            msgStage.setScene(new Scene(root, 500, 500));
        } else if (x!=a && count!=1) {
            count--;
            changetext.setText("Attempts left: 1");
        }
        else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Decision.fxml"));
            Parent root = loader.load();
            DecisionController decisionController = loader.getController();
            decisionController.setTxt(name+" YOU LOST!");
            Stage msgStage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            msgStage.setScene(new Scene(root, 500, 500));
        }
    }

    @FXML
    void action1(MouseEvent event) throws IOException {
         a=1;
        if(a==x)
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Decision.fxml"));
            Parent root = loader.load();
            DecisionController decisionController = loader.getController();
            decisionController.setTxt("YOU WON!");
            Stage msgStage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            msgStage.setScene(new Scene(root, 500, 500));
        } else if (x!=a && count!=1) {
            count--;
            changetext.setText("Attempts left: 1");
        }
        else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Decision.fxml"));
            Parent root = loader.load();
            DecisionController decisionController = loader.getController();
            decisionController.setTxt(name+" YOU LOST!");
            Stage msgStage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            msgStage.setScene(new Scene(root, 500, 500));
        }

    }

    @FXML
    void action2(MouseEvent event) throws IOException {
         a=2;
        if(a==x)
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Decision.fxml"));
            Parent root = loader.load();
            DecisionController decisionController = loader.getController();
            decisionController.setTxt("YOU WON!");
            Stage msgStage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            msgStage.setScene(new Scene(root, 500, 500));
        } else if (x!=a && count!=1) {
            count--;
            changetext.setText("Attempts left: 1");
        }
        else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Decision.fxml"));
            Parent root = loader.load();
            DecisionController decisionController = loader.getController();
            decisionController.setTxt(name+" YOU LOST!");
            Stage msgStage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            msgStage.setScene(new Scene(root, 500, 500));
        }

    }

    @FXML
    void action3(MouseEvent event) throws IOException {
         a=3;
        if(a==x)
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Decision.fxml"));
            Parent root = loader.load();
            DecisionController decisionController = loader.getController();
            decisionController.setTxt("YOU WON!");
            Stage msgStage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            msgStage.setScene(new Scene(root, 500, 500));
        } else if (x!=a && count!=1) {
            count--;
            changetext.setText("Attempts left: 1");
        }
        else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Decision.fxml"));
            Parent root = loader.load();
            DecisionController decisionController = loader.getController();
            decisionController.setTxt(name+" YOU LOST!");
            Stage msgStage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            msgStage.setScene(new Scene(root, 500, 500));
        }

    }

    @FXML
    void btnsubmit(ActionEvent event) {
         name=playername.getText();
    }

}

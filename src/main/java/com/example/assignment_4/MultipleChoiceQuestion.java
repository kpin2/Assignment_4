package com.example.assignment_4;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MultipleChoiceQuestion extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Multiple Choice Question");

        Rectangle questionRect = new Rectangle(300, 50);



        Label questionLabel = new Label("What is the result of 2 + 2?");
        Button answerA = new Button("4");
        Button answerB = new Button("5");
        Button answerC = new Button("6");
        Button answerD = new Button("7");

        answerA.setOnAction(e -> {
            answerA.setText("Correct!");
            answerB.setDisable(true);
            answerC.setDisable(true);
            answerD.setDisable(true);
        });

        answerB.setOnAction(e -> {
            answerB.setText("Incorrect");
            answerA.setDisable(true);
            answerC.setDisable(true);
            answerD.setDisable(true);
        });

        answerC.setOnAction(e -> {
            answerC.setText("Incorrect");
            answerA.setDisable(true);
            answerB.setDisable(true);
            answerD.setDisable(true);
        });

        answerD.setOnAction(e -> {
            answerD.setText("Incorrect");
            answerA.setDisable(true);
            answerB.setDisable(true);
            answerC.setDisable(true);
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(questionLabel, answerA, answerB, answerC, answerD, questionRect);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


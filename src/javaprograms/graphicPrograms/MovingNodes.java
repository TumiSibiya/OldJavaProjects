package javaprograms.graphicPrograms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Khaya
 */
import javafx.application.Application;
import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import javafx.scene.layout.StackPane;
import javafx.geometry.Orientation;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import java.time.LocalTime;
import javafx.util.Duration;

public class MovingNodes extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane pane = new StackPane();
        pane.setStyle("-fx-background-color:black;");
        //shapes
        Circle circle = new Circle(0, 0, 200);
 //       circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Rectangle rectangle = new Rectangle(20, 20, 20, 20);

        for(int count =0; count < 360;count++){ 
            circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        }
        rectangle.setStroke(Color.BLACK);

        pane.getChildren().addAll(circle, rectangle);

        //animation
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(3000));
        pt.setPath(circle);
        pt.setNode(rectangle);

        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play();

        circle.setOnMousePressed(e -> {
            circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            pt.pause();
        });
        circle.setOnMouseReleased(e -> pt.play());

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

    public static void main(String... args) {

        Application.launch(args);
    }
}

package javaprograms.graphicPrograms;
import javafx.application.Application;

//animation
import javafx.animation.PathTransition;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
//layouts
import javafx.scene.layout.Pane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
    //properties
    import javafx.geometry.Pos;
    import javafx.geometry.Orientation;
    import javafx.geometry.Insets;
//nodes
import javafx.scene.control.Button;
//shapes
import javafx.scene.shape.Circle;
//color
import javafx.scene.paint.Color;
//scene and stage
import javafx.scene.Scene;
import javafx.stage.Stage;
//event handlers
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.NodeOrientation;
//duration
import javafx.util.Duration;
//time
import java.time.LocalTime;
/**
 *
 * @author Tumi Sibiya
 * 
 */
public class AnimationProgram0 extends Application{

    @Override
    public void start(Stage primaryStage){

        //Shape
        Circle circle = new Circle();
        Circle tinyCircle = new Circle();
        Circle tinytinyCircle = new Circle();
        
        circle.setRadius(110);
        tinyCircle.setRadius(59);
        tinytinyCircle.setRadius(29);
        
        circle.setFill(Color.BLACK);
        tinyCircle.setFill(Color.BLACK);
        tinytinyCircle.setFill(Color.color(Math.random(),Math.random(),
                Math.random()));
        
        //nodes
        Button pauseButton = new Button("pause");
        Button playButton  = new Button("play");
        //panes
           //pane
            StackPane pane = new StackPane();
            pane.setPadding(new Insets(10,10,10,10));
            pane.getChildren().addAll(circle, tinyCircle, tinytinyCircle);
            pane.setStyle("-fx-background-color:black; -fx-border-color:black;");
           //FlowPane
            FlowPane fpane = new FlowPane();
            fpane.setPadding(new Insets(10,10,10,10));
            fpane.setHgap(10);
            fpane.getChildren().addAll(playButton, pauseButton);
           //BorderPane
            BorderPane bpane = new BorderPane();
            bpane.setCenter(pane);
            bpane.setBottom(fpane);
            
        //animation
            PathTransition pt = new PathTransition();
            PathTransition pt1 = new PathTransition();
            
            FadeTransition ft = new FadeTransition(Duration.seconds(10), 
            tinyCircle);
//pt            
            pt.setDuration(Duration.millis(40000));
            pt.setPath(circle);
            pt.setNode(tinyCircle);
            pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
            pt.setCycleCount(Timeline.INDEFINITE);
            pt.setAutoReverse(false);
            pt.play();
//pt1
            pt1.setDuration(Duration.millis(4000));
            pt1.setPath(tinyCircle);
            pt1.setNode(tinytinyCircle);
            pt1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
            pt1.setCycleCount(Timeline.INDEFINITE);
            pt1.setAutoReverse(true);
            pt1.play();
//ft    
            ft.setFromValue(1);
            ft.setToValue(0.1);
            ft.setCycleCount(Timeline.INDEFINITE);
            ft.setAutoReverse(true);
            ft.play();
            
            //handlers
               playButton.setOnAction((ActionEvent e) ->{
                   pt.play();
                   pt1.play();
               });
                
               pauseButton.setOnAction((ActionEvent e)->{
                   pt.pause();
                   pt1.pause();
               });
            
               circle.setOnMousePressed((e)->{
                   ft.pause();
                   circle.setFill(Color.color(Math.random(), Math.random(), 
                           Math.random(),Math.random()));
               });
               tinytinyCircle.setOnMousePressed(e-> 
                       tinytinyCircle.setFill(Color.color(Math.random(),
                               Math.random(),Math.random()))
               
               );
               pane.setOnMousePressed(e->{
                  
               });
               
        //scene and stage
               //Scene
               Scene animation = new Scene(bpane,400,400);
               //stage
               primaryStage.setScene(animation);
               primaryStage.centerOnScreen();
               primaryStage.show();
            
    }
    public static void main(String... args){
        Application.launch(args);
    }
}
package javaprograms.graphicPrograms;
/**
 *
 * @author Tumi Sibiya
 */
import javafx.application.Application;
import javafx.geometry.Insets;
//Pane
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
        //properties
//Shapes
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;
//Color
import javafx.scene.paint.Color;
//Scene And Stage
import javafx.scene.Scene;
import javafx.stage.Stage;
public class EllipseMagic extends Application{
    
    @Override
    public void start(Stage primaryStage){
        
       Pane pane = new StackPane();
       //pane.setRotate(-21);
       //pane.setPadding(new Insets(500,0,0,400));
       for(int count=0; count<16; count++){
       
           Ellipse el = new Ellipse(200,20,100,800);
           Circle cir = new Circle();
           Sphere sp = new Sphere();
           
           //Ellipse Properties
   el.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
   //el.setFill(Color.color(Math.random(),Math.random(), Math.random(),Math.random()));
          el.setStyle("-fx-fill-color :black;");
    el.setRotate(count *10000/1152);
        
            //Circle Properties
  //cir.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
   
   cir.setFill(Color.rgb(200, count, count));
   cir.setRadius(300);
   
        //Sphere
   sp.setRadius(10);
   //sp.setFocusTraversable(false);
   sp.setScaleX(count);
   sp.setScaleY(count);
   
   pane.getChildren().add(cir);
   pane.getChildren().add(el);
   pane.getChildren().add(sp);
       }
       
       pane.setStyle("-fx-border-color :black ; -fx-background-color: white;");
       Scene e = new Scene(pane);
       primaryStage.setScene(e);
       primaryStage.show();
       
       
    }
    
    public static void main(String... args){
        Application.launch(args);
    }
}

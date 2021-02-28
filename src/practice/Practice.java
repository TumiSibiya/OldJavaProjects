package practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;

import java.time.LocalDate;

public class Practice extends Application{
    @Override
    public void start(Stage testStage){
        
       StackPane pane = new StackPane();
       
       ComboBox comboBox = new ComboBox();
       comboBox.setId(STYLESHEET_MODENA);
       
       pane.getChildren().add(comboBox);
       Scene testScene = new Scene(pane);
       testStage.setScene(testScene);
       testStage.show();
    }
    public static void main(String... args){
        Application.launch(args);
    }
    
}
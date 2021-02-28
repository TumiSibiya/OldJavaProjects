package copies;
import projects.telecomUSSDProgram.*;
import javafx.application.Application;
//layouts
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
    //configure layouts
    import javafx.geometry.Insets;
    import javafx.geometry.Pos;
    import javafx.geometry.Orientation;
//nodes
    //textfiels
    import javafx.scene.control.TextField;
    //button
    import javafx.scene.control.Button;
    //Text
    import javafx.scene.text.Text;
//Stage abd Scene
import javafx.scene.Scene;
import javafx.stage.Stage;
//handlers
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
//Exceoptions
/**
 *
 * @author Khaya
 */
public class USSD extends Application{
    
    public static void main(String... args){
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage){
       new MainMenu().nevigator();
    }
}

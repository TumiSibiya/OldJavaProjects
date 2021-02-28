package javaprograms.uiprograms.com.eKhaya;
/**
 *
 * @author Tumi Sibiya
 */
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DisplayMessage {
    //for sudden program exceptions
    
    Insets defaultInsets = new Insets(15,15,15,15);
    
    public void incorrectMobileOrIdNumber(){
    
             
        Stage incorrectMobileOrIdNumberStage = new CreateNewStage().getNewStage();
        BorderPane bpane = new CreateNewLayout().getNewBorderPane();
        StackPane spane = new CreateNewLayout().getNewStackPane();
        HBox hbox = new CreateNewLayout().getNewHBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(19,0,0,0));
        hbox.getChildren().add(new Label("Invalid ID or mobile\nmobile number !"));
        
        Button okButton = new Button("ok");
        
        spane.setPadding(defaultInsets);
        spane.getChildren().add(okButton);

        bpane.setTop(hbox);
        bpane.setBottom(spane);
        bpane.setPadding(defaultInsets);
        
        //setScene
        Scene incorrectMobileOrIdNumberScene= new Scene(bpane, 200,150);
        incorrectMobileOrIdNumberStage.setScene(incorrectMobileOrIdNumberScene);
        incorrectMobileOrIdNumberStage.setResizable(false);
        incorrectMobileOrIdNumberStage.show();
        
        //handle
        okButton.setOnAction(e-> incorrectMobileOrIdNumberStage.close());

    
    }
    public void invalidMobileNumber(){
             
        Stage invalidMobileNumberStage = new CreateNewStage().getNewStage();
        BorderPane bpane = new CreateNewLayout().getNewBorderPane();
        StackPane spane = new CreateNewLayout().getNewStackPane();
        HBox hbox = new CreateNewLayout().getNewHBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(19,0,0,0));
        hbox.getChildren().add(new Label("Invalid mobile number"));
        
        Button okButton = new Button("ok");
        
        spane.setPadding(defaultInsets);
        spane.getChildren().add(okButton);

        bpane.setTop(hbox);
        bpane.setBottom(spane);
        bpane.setPadding(defaultInsets);
        
        //setScene
        Scene invalidMobileNumberScene = new Scene(bpane, 200,150);
        invalidMobileNumberStage.setScene(invalidMobileNumberScene);
        invalidMobileNumberStage.setResizable(false);
        invalidMobileNumberStage.show();
        
        //handle
        okButton.setOnAction(e-> invalidMobileNumberStage.close());

    }
    public void textFieldIsEmpty(){
     
        Stage textFieldIsEmptyStage = new CreateNewStage().getNewStage();
        BorderPane bpane = new CreateNewLayout().getNewBorderPane();
        StackPane spane = new CreateNewLayout().getNewStackPane();
        HBox hbox = new CreateNewLayout().getNewHBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(19,0,0,0));
        hbox.getChildren().add(new Label("Enter all fields"));
        
        Button okButton = new Button("ok");
        
        spane.setPadding(defaultInsets);
        spane.getChildren().add(okButton);

        bpane.setTop(hbox);
        bpane.setBottom(spane);
        bpane.setPadding(defaultInsets);
        
        //setScene
        Scene unknownErrorScene = new Scene(bpane, 200,150);
        textFieldIsEmptyStage.setScene(unknownErrorScene);
        textFieldIsEmptyStage.setResizable(false);
        textFieldIsEmptyStage.show();
        
        //handle
        okButton.setOnAction(e-> textFieldIsEmptyStage.close());

    }
    public void accountWasCreated(){
     
        Stage unknownErrorStage = new CreateNewStage().getNewStage();
        BorderPane bpane = new CreateNewLayout().getNewBorderPane();
        StackPane spane = new CreateNewLayout().getNewStackPane();
        HBox hbox = new CreateNewLayout().getNewHBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(new Label("Account was successfully created"));
        
        Button okButton = new Button("ok");
        
        spane.setPadding(defaultInsets);
        spane.getChildren().add(okButton);

        bpane.setCenter(hbox);
        bpane.setBottom(spane);
        bpane.setPadding(defaultInsets);
        //setScene
        Scene unknownErrorScene = new Scene(bpane,200,150);
        unknownErrorStage.setScene(unknownErrorScene);
        unknownErrorStage.setResizable(false);
        unknownErrorStage.show();
        
        //handle
        okButton.setOnAction(e-> unknownErrorStage.close());
    }
    public void incorrectID(){
             
        Stage incorrectStage = new CreateNewStage().getNewStage();
        BorderPane bpane = new CreateNewLayout().getNewBorderPane();
        StackPane spane = new CreateNewLayout().getNewStackPane();
        HBox hbox = new CreateNewLayout().getNewHBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(defaultInsets);
        hbox.getChildren().add(new Label("Oops  :-(\n incorrect ID "));
        
        Button okButton = new Button("ok");
        
        spane.setPadding(new Insets(20,15,0,15));
        spane.getChildren().add(okButton);
        

        bpane.setCenter(hbox);
        bpane.setBottom(spane);
        bpane.setPadding(defaultInsets);
        //setScene
        Scene unknownErrorScene = new Scene(bpane, 200,150);
        incorrectStage.setScene(unknownErrorScene);
        incorrectStage.setResizable(false);
        incorrectStage.show();
        
        //handle
        okButton.setOnAction(e-> incorrectStage.close());
    }
    public void unknownError(){
        Stage unknownErrorStage = new CreateNewStage().getNewStage();
        BorderPane bpane = new CreateNewLayout().getNewBorderPane();
        StackPane spane = new CreateNewLayout().getNewStackPane();
        HBox hbox = new CreateNewLayout().getNewHBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(defaultInsets);
        hbox.getChildren().add(new Label("Oops, something went wrong"));
        
        Button okButton = new Button("ok");
        
        spane.getChildren().add(okButton);
        spane.setPadding(defaultInsets);

        bpane.setCenter(hbox);
        bpane.setBottom(spane);
        bpane.setPadding(defaultInsets);
        
        //setScene
        Scene unknownErrorScene = new Scene(bpane, 150,150);
        unknownErrorStage.setScene(unknownErrorScene);
        unknownErrorStage.setResizable(false);
        unknownErrorStage.show();
        
        //handle
        okButton.setOnAction(e-> unknownErrorStage.close());
    }
}

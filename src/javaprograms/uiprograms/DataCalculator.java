package javaprograms.uiprograms;
/**
 *
 * @author Khaya
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

//nodes
    //layout
    import javafx.scene.layout.BorderPane;
    import javafx.scene.layout.FlowPane;
    import javafx.scene.layout.VBox;
    import javafx.scene.layout.HBox;
    
    
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
    //Labels
import javafx.scene.control.Label;
    //textfield
import javafx.scene.control.TextField;
    //button
import javafx.scene.control.Button;

//time
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Month;

//excptions
import java.util.InputMismatchException;


public class DataCalculator extends Application{
   
    
    //sort textfield
    TextField dateTextField = new TextField();
    TextField monthTextField = new TextField();
    TextField yearTextField = new TextField();
    
    TextField daysLivedTextField = new TextField();
    TextField monthsLivedTextField = new TextField();
    TextField yearsLivedTextField = new TextField();
    
    //sort buttons
    Button calculateButton = new Button("calculate");
    
    
    //actions handlers
    public void setNodeActions(){
    
        //calculateActionHandler
        calculateButton.setOnAction( e->{
            getDetails();
        });
        //textfield
        daysLivedTextField.setEditable(false);
        monthsLivedTextField.setEditable(false);
        yearsLivedTextField.setEditable(false);
        
    }
    //get horizontal layout
    public HBox getHBoxLayout(){
        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(15,15,15,15));//setting padding
        
        hbox.setStyle("-fx-background-color: white");
        //hbox nodes
        dateTextField.setPrefColumnCount(2);
        monthTextField.setPrefColumnCount(2);
        yearTextField.setPrefColumnCount(4);
        hbox.getChildren().addAll(new Label("Date"), dateTextField,
                                  new Label("Month"), monthTextField, 
                                  new Label("Year"), yearTextField);
     return hbox;
    }
    //get vertical layout
    public FlowPane getFlowPane(){
        FlowPane flowpane = new FlowPane(Orientation.VERTICAL);
        
        flowpane.setPadding(new Insets(16,16,16,16));
        flowpane.setStyle("-fx-backgrount-color:azure");
        
        daysLivedTextField.setPrefColumnCount(6);
        monthsLivedTextField.setPrefColumnCount(4);
        yearsLivedTextField.setPrefColumnCount(3);
        
        flowpane.getChildren().addAll(new Label("Lived "),new Label("Days"),daysLivedTextField, 
                                      new Label("Months"),monthsLivedTextField, 
                                      new Label("Years"),yearsLivedTextField);
        return flowpane;
    }
    public HBox getBottomHBoxLayout(){
        HBox bottomHbox = new HBox();
        bottomHbox.setPadding(new Insets(5,5,5,5));
        bottomHbox.setStyle("-fx-backgound-color:azure");
        bottomHbox.setAlignment(Pos.CENTER_RIGHT);
        bottomHbox.getChildren().add(calculateButton);
        
    return bottomHbox;
    }
    //start
    @Override
    public void start(Stage dataCalculatorStage){
        //
        BorderPane dataCollectorPane = new BorderPane();
        dataCollectorPane.setPadding(new Insets(20,20,20,20));
        dataCollectorPane.setTop(getHBoxLayout());
        dataCollectorPane.setCenter(getFlowPane());
        dataCollectorPane.setBottom(getBottomHBoxLayout());
        
        setNodeActions();
        
        Scene dataCalculatorScene = new Scene(dataCollectorPane, 400,400);
        
        dataCalculatorStage.setScene(dataCalculatorScene);
        dataCalculatorStage.setResizable(false);
        dataCalculatorStage.setTitle("Data Calculator");
        
        dataCalculatorStage.show();
    }
    
    //main
    public static void main(String[] args){
        Application.launch(args);
    }
   
   //-------------------------------------------------------------------------------------------
    
    //user date of birth
    private String date;
    private String month;
    private String year;
   //computed age 
    private long dd;
    private long mm;
    private long yyyy;
    
//details from textfield
    protected void getDetails(){
        try{
            
            date = dateTextField.getText();
            month = monthTextField.getText();
            year = yearTextField.getText();
            
            compute(date, month, year);
            
            daysLivedTextField.setText(String.valueOf(dd));
            monthsLivedTextField.setText(String.valueOf(mm));
            yearsLivedTextField.setText(String.valueOf(yyyy));
            
            
                }catch(ClassCastException cce){
        
                    System.out.println("ClassCastException occured");
                }catch(Exception ex){
                System.out.println("something went wrong");
            }
    }
    //funny fact
    protected DayOfWeek getFunnyFact(LocalDate f){
        DayOfWeek u = f.getDayOfWeek();
      return u;
    }
    //computing 
    private void compute(String d, String m , String y)
                         throws ClassCastException{
    
        LocalDate x = LocalDate.now();
        
        LocalDate dateOfBirth = LocalDate.of(Integer.parseInt(y), Integer.parseInt(m), 
                    Integer.parseInt(d));
        
                    //logic 
                    if(x.getMonthValue() <= dateOfBirth.getMonthValue()){
                        
                    }else{
                        
                        yyyy = x.getYear() - Long.parseLong(y) -1;
                                                   //compute months elapsed
     
                        mm = ( 12 * yyyy) + x.getMonthValue();
                                                   //compute days elapsed
        
                        dd = ( 12 * 365) * yyyy;
        
                    }
                        
    
    }
}



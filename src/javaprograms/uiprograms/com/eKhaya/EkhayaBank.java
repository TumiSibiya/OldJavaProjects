package javaprograms.uiprograms.com.eKhaya;
import javaprograms.uiprograms.com.eKhaya.AccountManagement;
/**
 *
 * @author Tumi Sibiya
 */

//application
import javafx.application.Application;
            //gui
//data types
import java.math.BigInteger;
//layouts
import javafx.scene.layout.*;
    //configuration layouts
    import javafx.geometry.Pos;
    import javafx.geometry.Orientation;
//nodes
    //buttons
    import javafx.scene.control.Button;
    //labels
    
    import javafx.scene.control.Label;
    //text
    import javafx.scene.text.Font;
    //textfields
    import javafx.scene.control.TextField;
    import javafx.scene.control.PasswordField;
    //geometry
    import javafx.geometry.*;
//stage
import javafx.stage.Stage;
import javafx.scene.Scene;

//excpetion
import java.util.InputMismatchException;
import java.lang.IndexOutOfBoundsException;
import java.lang.NumberFormatException;
//handlers
import javafx.event.ActionEvent;



public class EkhayaBank extends Application{
    
  
    NewNodes accessNewNodes = new NewNodes();
    CreateNewStage accessCreateNewStage = new CreateNewStage();
    CreateNewLayout accessCreateNewLayout = new CreateNewLayout();
    
   
    @Override
    public void start(Stage primaryStage){
        
        Label companyNameLabel = new Label("EKhaya Banking Group");
        companyNameLabel.setGraphicTextGap(5);
        companyNameLabel.setFont(Font.font(STYLESHEET_MODENA));
        
        StackPane stackpane = accessCreateNewLayout.getNewStackPane();
        
        Scene companyNameScene = new Scene(stackpane, 300,200);
        
        stackpane.setStyle("-fx-background-color:white");
        
        stackpane.gAssemblyetChildren().add(companyNameLabel);
        primaryStage.setScene(companyNameScene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Welcome");
        primaryStage.show();
        
        //handlers
        stackpane.setOnMouseClicked(e->{
            loginOrCreate();
            primaryStage.close();
        });

        
    }
    public void loginOrCreate(){
    

    Pane pane = new Pane();
    StackPane spane = new StackPane();
    FlowPane fpane = new FlowPane();
    GridPane gpane = new GridPane();
    HBox hbox = new HBox(10);
    BorderPane bpane = new BorderPane();
    

    //buttons
       Button createAccountButton = new NewNodes().getNewCreateButton();
       Button loginAccountButton = new NewNodes().getNewLoginButton();
    //textfield
       TextField userNameTextField = new NewNodes().getNewTextField();
    //passwordField 
       PasswordField passwaordField = new NewNodes().getNewPasswordField();
       
        //setLabels
        gpane.add(new Label(accessNewNodes.companyNameLabel), 0,0, 2,1);
        gpane.add(new Label(accessNewNodes.usernameLabel), 0,1);
        gpane.add(new Label(accessNewNodes.passwordlabel),0,2);
        //setFields
        gpane.add(userNameTextField, 1,1);
        gpane.add(passwaordField , 1, 2);
    
        //setButtons
        hbox.getChildren().addAll(loginAccountButton, createAccountButton);
        hbox.setPadding(new Insets(15,15,15,15));
        hbox.setAlignment(Pos.TOP_RIGHT);
        gpane.add(hbox, 1,3);
        
        //setLayout
        gpane.setPadding(new Insets(15,15,15,15));
        gpane.setHgap(15);
        gpane.setVgap(15);
        
        bpane.setCenter(gpane);
        bpane.setPadding(new Insets(50,50,50,50));
        
        //Stage
        
        Stage loginOrCreateStage = new Stage();
        
        //set Scene adn Stage
        Scene loginOrCreateScene = new Scene(bpane);
        loginOrCreateStage.setScene(loginOrCreateScene);
        loginOrCreateStage.setResizable(false);
        loginOrCreateStage.show();
        
        //handler
        loginAccountButton.setOnAction( e->{
            loginAccountStage();
            loginOrCreateStage.close();
        });
        
        createAccountButton.setOnAction( e-> {
            createAccountStage();
            loginOrCreateStage.close();
        });
        
    }
    //login account stage
    public void loginAccountStage(){
        
    }
    //create account stage
    public void createAccountStage(){
        
       String stageTitle = "Create Account";
       
       Stage createAccountStage = accessCreateNewStage.getNewStage();
       GridPane createAccountPane = accessCreateNewLayout.getNewGridPane();
       BorderPane createAccountBpane = accessCreateNewLayout.getNewBorderPane();
       
       //set labels
       
       createAccountPane.add(new Label(accessNewNodes.firsNameLabel), 0,0);
       createAccountPane.add(new Label(accessNewNodes.secondNameLabel), 0,1);
       createAccountPane.add(new Label(accessNewNodes.passwordlabel), 0,2);
       createAccountPane.add(new Label(accessNewNodes.IDnumbeLabel), 0,3);
       createAccountPane.add(new Label(accessNewNodes.mobilNumber), 0,4);
       //set nodes
       TextField fN = accessNewNodes.getNewTextField();
       TextField sN = accessNewNodes.getNewTextField();
       TextField pF = accessNewNodes.getNewPasswordField();
       TextField ID_No = accessNewNodes.getNewTextField();
       TextField mobile_No = accessNewNodes.getNewTextField();
       
       createAccountPane.add(fN, 1,0);
       createAccountPane.add(sN, 1,1);
       createAccountPane.add(pF, 1,2);
       createAccountPane.add(ID_No, 1,3);
       createAccountPane.add(mobile_No, 1,4);
       
       Button cancelButton = new NewNodes().getNewCancelButton();
       Button saveButton = new NewNodes().getNewSaveButton();

       //layout
       
        createAccountPane.setHgap(15);
        createAccountPane.setVgap(15);
        FlowPane pane = accessCreateNewLayout.getNewFlowPane();
        pane.setPadding(new Insets(20,20,20,20));
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(15);
        pane.getChildren().addAll(saveButton, cancelButton);
        
        createAccountBpane.setPadding(new Insets(20,20,20,20));
        createAccountBpane.setCenter(createAccountPane);
        createAccountBpane.setBottom(pane);
        
        Scene createAccountScene = new Scene(createAccountBpane);
        createAccountStage.setScene(createAccountScene);
        createAccountStage.setTitle(stageTitle);
        createAccountStage.setResizable(false);
        createAccountStage.show();
        
        
        //handlers
        
        saveButton.setOnAction((ActionEvent e)->{
            
            String s1 = fN.getText();
            String s2 = sN.getText();
            String s3 = pF.getText();
            String s4 = ID_No.getText();
            String s5 = mobile_No.getText();
            
            //check for empty fields
            
            System.out.println("s1 is "+ s1);
            if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() ||
                  s4.isEmpty() || s5.isEmpty()){
                new DisplayMessage().textFieldIsEmpty();
               
            }//else begins
            else{
                //validator instance ref : accessValidator
                Validator accessValidator = new Validator();
                
            //formatting idNumber
                
            boolean idIsValid = accessValidator.validateIdNumber(
                   new Validator().formateAndTrim(s4));
            //formatting mobileNumber
            boolean mobileIsValid = accessValidator.validateMobileNumber(
                    new Validator().formateAndTrim(s5));
            
            System.out.println("idIsValid : "+idIsValid+"\nmobileIsValid : "+mobileIsValid);
            
            
            if(idIsValid && mobileIsValid){
                    new Create().process(s1, s2, s3, s4, s5);
                }else if(idIsValid == false){
                    new DisplayMessage().incorrectID();
                }else
                    new DisplayMessage().invalidMobileNumber();
                
            }//end of else 
            
        });
        
        cancelButton.setOnAction( e->{
            loginOrCreate();
            createAccountStage.close();
        });
    }      
    //class create Account
    class Create extends AccountManagement{
    
      private void process(String s1  , String s2, String s3 ,String s4, String s5 ){
        System.out.println("Now inside Create");
            try{

                System.out.println("fN :"+s1+"\nsN :"+s2+"\npw :"+s3+"\nid :"+s4+"\nmN :"+s5+"k");
               
                //parse String to primitive data type
                
                BigInteger id = new BigInteger(s4);
               
                BigInteger number = new BigInteger(s5);

                //create account 
                if(createNewAccount(s1,s2,s3,id,number)==true){
                   System.out.println("Back to Create().process() , new Account Was created");
                    new DisplayMessage().accountWasCreated();
                }
                    
            }catch(NumberFormatException nfex){
                nfex.printStackTrace();
                new DisplayMessage().incorrectID();
            }catch(Exception ex){
                ex.printStackTrace();
                new DisplayMessage().textFieldIsEmpty();
            }
      }
        
    } 
    //process class
    class Process extends AccountManagement{
           
           
           Process(String identity){ 
              
              try{
              System.out.println("inside class  Process{} try");    
                  System.out.println("pds is  "+ processDataStatus);
                    
                    processDataStatus = checkForAccount(new BigInteger(identity)) == false;
                    System.out.println("pds is now " + processDataStatus);
                    
                    
                 System.out.println("done inside try-block");
                 }catch(Exception ex){
                    new DisplayMessage().incorrectID();
                 }
           }
          
        }
    //process data
    boolean processDataStatus;  
    boolean processData(String identity){
        System.out.println("inside processData()\npds is "+ processDataStatus);
        Process access = new Process(identity);
        System.out.println("processDatat() returned pds as "+ processDataStatus);
      return processDataStatus;
    }
    public static void main(String... args){
        Application.launch(args);
    }
}
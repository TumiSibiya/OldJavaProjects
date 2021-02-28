package copies;
//layouts
import javafx.scene.layout.*;
//properties
    import javafx.geometry.Insets;
    import javafx.geometry.Pos;
    import javafx.geometry.Orientation;
//nodes
    //textfields
    import javafx.scene.control.TextField;
    //buttons
    import javafx.scene.control.Button;
    //label
    import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
/**
 *
 * @author Khaya
 */
import java.util.Scanner;
public class MainMenu extends Menu{

    Displayer accessDisplyer = new Displayer();
            BorderPane pane = new BorderPane();
            FlowPane fpane = new FlowPane();
            GridPane gpane =new GridPane();
            HBox hbox = new HBox();
            
            TextField dialerField = new TextField();
            Button sendButton = new Button(new Displayer().sendButton);
            Button cancelButton = new Button(new Displayer().cancelButton);
            
        void nevigator(){
           Stage stage = new Stage();
           //flowpane
           fpane.setPadding(new Insets(20,20,20,20));
           fpane.setOrientation(Orientation.VERTICAL);
           fpane.getChildren().add(new Label());
           
           //gridpane
           gpane.add(this.cancelButton, 0,0);
           gpane.add(this.sendButton, 1,0);
           //brderpane
           pane.setCenter(fpane); 
           pane.setBottom(gpane);
           
           Scene scene = new Scene(pane, 200,200);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
            
            this.sendButton.setOnAction( e-> {
       
                if(dialerField.getText().equals(super.getUSSDCode())){
            mainMenu();
            
                }else if(!dialerField.getText().equals(super.getUSSDCode())){
            Displayer.incorrectUSSDCode();
            
                }else{
            Displayer.incorrectUSSDCode();
        
                }
            }
            );
    }
     void mainMenu(){
         
      Scanner input = new Scanner(System.in);
         
            Displayer.displayMainMenu();

            switch(input.nextByte()){
                case 1:
                         balanceMenu();
                         break;
                
                case 2 :
                         buyDataMenu();
                        break;
                case 3 :
                        buyAirtimeMenu();
                        break;
                case 4 :
                        buySmsMenu();
                        break;
                case 5 :
                        System.out.println(exitProgram());
                    break;
                    
                default :
                        mainMenu();
      }
    }
     void balanceMenu(){
     
         Scanner input = new Scanner(System.in);
         
            Displayer.displayBalanceMenu();
             byte option = input.nextByte();
             if(option ==1){
                        
                System.out.println( Displayer.displayRequestedBalance(super.getBalanceOption1()));
                        
             }else if(option ==2){
                        
                   System.out.println(Displayer.displayRequestedBalance(super.getBalanceOption2()));
                       
             }else if(option == 3){
                   System.out.println(exitProgram());
             
             }else
                        mainMenu();
     }
     void buyDataMenu(){
          
        Scanner input = new Scanner(System.in);
            
            Displayer.displayBuyDataMenu();
                    byte option = input.nextByte();
                    
                    if(option == 1){
                         
                        System.out.println(Displayer.displayPurchasedData(super.getDataOption1()));
                        
                    }else if(option == 2){
                        
                        System.out.println(Displayer.displayPurchasedData(super.getDataOption2()));
                        
                    }else if(option == 3){
                        
                        System.out.println(exitProgram());
                    }else
                        mainMenu();
     }
     void buyAirtimeMenu(){
     
         Scanner input = new Scanner(System.in);
         
                    Displayer.displayBuyAirtimeMenu();
                    
                     byte option = input.nextByte();
                     
                        if(option == 1){
                    
                        System.out.println(Displayer.displayPurchasedAirtime(super.getAirtimeOption1()));

                        }else if(option == 2){
                        
                        System.out.println(Displayer.displayPurchasedAirtime(super.getAirtimeOption2()));
                        
                        }else if(option == 3){
                        System.out.println(Displayer.displayQuitMessage());
                        }else
                        mainMenu();
     }
     void buySmsMenu(){
     
         Scanner input = new Scanner(System.in);
     
         
                    Displayer.displayBuySmsMenu();
                    byte option = input.nextByte();
                    
                    if(option == 1){
                        
                        System.out.println(Displayer.displayPurchasedSms(super.getSmsOption1()));
                        
                    }else if(option == 2){
                        
                        System.out.println(Displayer.displayPurchasedSms(super.getSmsOption2()));
                        
                    }else if(option == 3){
                        System.out.println(exitProgram());
                    }
                    else
                        mainMenu();
     }
     public String exitProgram(){
         return Displayer.displayQuitMessage();
     }
}

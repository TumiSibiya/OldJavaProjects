package copies;

import projects.telecomUSSDProgram.*;

//Panes
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.control.Button; import javafx.scene.control.Label;
//Stage
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author Khaya
 */
public class Displayer {
   
    public class UI{
    
        Stage nevigation = new Stage();
        Stage menu = new Stage();
        Stage mainMenu = new Stage();
    }
    String sendButton = "Send";
    String cancelButton = "Cancel";
    
    //Action display methods return String
    static String displayRequestedBalance(String requestedBalance){
        return "Your requested balance for " + requestedBalance;
    }
    static String displayPurchasedData(short purchasedData){
        return "You have purchased Data bundle for " + purchasedData +"MB";
    }
    static String displayPurchasedAirtime(float purchasedAirtime){
        return "Youe have purchsed Airtime R"+ purchasedAirtime;
    }
    static String displayPurchasedSms(short purchasedSms){
        return "Youe have purchased SMS bundle for R" + purchasedSms;
    }
    //Menu display methods return void
     static String displayMainMenu(){
        return ("1 - Balance\n2 - Buy Data\n"
                + "3 - Buy Airtime\n4 - Buy SMS\n5 - Quit");
    }
    public static void displayBalanceMenu(){
        System.out.println("1 - Talk Balance\n2 - Data Balance\n3 - Quit");
    }
     static void displayBuyDataMenu(){
        System.out.println("1 - 500MB\n2 - 1GB\n3 - Quit");
    }
     static void displayBuyAirtimeMenu(){
        System.out.println("1 = R20.00\n2 - R40.00\n3 - Quit");
    }
     static void displayBuySmsMenu(){
         System.out.println("1 - 50 SMS Bundle\n2 - 100 SMS bundle\n3 - Quit");
     }
     static String displayQuitMessage(){
         return "Thank you, GoodByte";
     }
     //ERROR message
     static void incorrectUSSDCode(){
         System.out.println("Enter USSD Code : *800#\n\tERROR| USSD CODE |");
     }
}
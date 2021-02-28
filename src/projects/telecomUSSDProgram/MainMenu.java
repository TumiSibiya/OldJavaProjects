package projects.telecomUSSDProgram;
/**
 *
 * @author Khaya
 */
import java.util.Scanner;
public class MainMenu extends Menu{
    
    void nevigator(){
        Scanner input = new Scanner(System.in);
       
         String userInput = input.nextLine();
        
        if(userInput.equals(super.getUSSDCode())){
            mainMenu();
        }else if(!userInput.equals(super.getUSSDCode())){
            Displayer.incorrectUSSDCode();
          
        }else 
            Displayer.incorrectUSSDCode();
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

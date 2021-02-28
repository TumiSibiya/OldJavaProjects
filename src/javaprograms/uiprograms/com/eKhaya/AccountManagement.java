package javaprograms.uiprograms.com.eKhaya;
import java.util.List;
    import java.util.ArrayList;
/**
 *
 * @author Tumi Sibiya
 */
import java.math.BigInteger;
abstract class AccountManagement {
    
     class Account{
      private String name;
      private String surname;
      private String accountPassword;
      private BigInteger ID_Number;
      private BigInteger mobileNumber;
        
        protected Account(String name, String surname,String password ,BigInteger idNumber, BigInteger mobileNumber){
            this.setName(name);
            this.setSurname(surname);
            this.setNewPassword(password);
            this.setID_Number(idNumber);
            this.setMobileNumber(mobileNumber);
        }
        
        protected void setName(String name){
            this.name = name;
        }
        protected void setSurname(String surname){
            this.surname = surname;
        }
        protected void setNewPassword(String password){
            this.accountPassword = password;
        }
        protected void setID_Number(BigInteger idNumber){
            this.ID_Number = idNumber;
        }
        protected void setMobileNumber(BigInteger number){
            this.mobileNumber = number;
        }
        protected String getAccountPassword(){
            return accountPassword;
        }
        protected BigInteger getMobileNumber(){
            return mobileNumber;
        }
        protected BigInteger getID_Number(){
            return this.ID_Number;
        }
    }
    
    static List<Account> accountList = new ArrayList<>();
    
    private boolean accessGranted(){
        return true;
    }
    protected Boolean checkForAccount(BigInteger IDnumber){

        boolean status = false;
        for(Account a : accountList){
            if(a.getID_Number() == IDnumber){
               System.out.println("--- "+ IDnumber +"---------------"+a.getID_Number() + " is already in use");
                status = true;
            }
        }
        System.out.println("inside checkForAccount()\ncheckForAccount returned "+status);
       return status;
    }
    protected Boolean searchForAccount(String password, String firstName,String secondName){
        accountList.forEach(e->{
            if(password.equals(e.accountPassword) && firstName.equals(e.name) &&
                    secondName.equals(e.surname)){
                accessGranted();
            }
        });
      return false;
    }
    protected boolean createNewAccount(String name, String password ,
     
      String surname,BigInteger idNumber, BigInteger mobileNumber){
        
       boolean status = true;
    
       if(checkForAccount(idNumber) != false){
       
            {accountList.add(
               new Account(name, surname, password, idNumber, mobileNumber)
                            );
           status = true;
       
            }
       }  
       
       System.out.println("inside createNewAccount()\n createNewAccount returned "+ status);
       return status;
    }
}

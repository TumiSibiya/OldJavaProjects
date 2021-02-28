package javaprograms.uiprograms.com.eKhaya;

/**
 *
 * @author Tumi Sibiya
 */
import java.time.LocalTime;
import java.util.Iterator;
public class Validator {
    
    private final String formatter = "[^0-9]";
    private final byte mobileNumberLength =10;
    private final byte passwordLength = 8;
    private final byte idNumberLength = 13;
    
    public String formateString(String str){
        return str.replaceAll(formatter, "");
    }
    public String trimString(String str){
       return str.trim();
    }
    public String formateAndTrim(String str){
    
       System.out.println("Before formatting "+ str);
       
        String temp = formateString(str);
        String formattedStr = null;
        System.out.println("After formatting "+ temp);
    return formattedStr = temp;
    }
    public boolean validatePassword(String password){
       /*The password should contain 
        at least 
        */
        final byte expected_Length = 8;
        final byte expected_No_Digits = 3;
        final byte expected_No_Letters =3;
        
        byte passwordStrength =0;
        
        //validing
        //checking length
        if(password.length() >= expected_Length){
            passwordStrength++; 
        }
        return false;
    }
    //idNumber
    public boolean validateIdNumber(String idNumber){
       
        boolean status = false;
        String id;
        if(idNumber.length() != idNumberLength){
            System.out.println("user id was incorrect " + LocalTime.now());
        }else{
             //formate and Trim idNumber
            id = formateString(idNumber);
            if(id.length() == idNumberLength){
                System.out.println("user id was successful "+ LocalTime.now());
                status = true;
            }
        }      
       return status;
    }
    //validate mobile Number
    public boolean validateMobileNumber(String mobileNumber){
        boolean status = false;
        String temp = formateAndTrim(mobileNumber);
        if(temp.length() == mobileNumberLength){
            status = !false;
        }
       return status;
    }
}
package projects.telecomUSSDProgram;

/**
 *
 * @author Khaya
 */
public class Menu {

    final private String USSDCode = "*800#";
    //Balance options
    final private String BalanceOption1 = "Talk Balance";
    final private String BalanceOption2 = "Data Balance";
    //Buy Data options
    final private short DataOption1 = 500;
    final private short DataOption2 = 1000;
    //Buy Airtime optiona
    final private float AirtimeOption1 = 20.00F;
    final private float AitrimOption2 = 40.00F;
    //Buy SMS ooption
    final private short SmsOption1 = 50;
    final private short SmsOption2 = 100;
    
    //The Quit method
    
    public String getUSSDCode(){
        return this.USSDCode;
    }
    public String getBalanceOption1(){
        return this.BalanceOption1;
    }
    public String getBalanceOption2(){
        return this.BalanceOption2;
    }
    public short getDataOption1(){
        return this.DataOption1;
    }
    public short getDataOption2(){
        return this.DataOption2;
    }
    public float getAirtimeOption1(){
        return this.AirtimeOption1;
    }    
    public float getAirtimeOption2(){
        return this.AitrimOption2;
    }
    public short getSmsOption1(){
        return this.SmsOption1;
    }
    public short getSmsOption2(){
        return this.SmsOption2;
    }
}

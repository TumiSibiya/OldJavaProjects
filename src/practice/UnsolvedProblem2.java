package practice;
/**
 *
 * @author Khaya
 */
import java.util.Iterator;
import java.util.Collection;
//list
import java.util.List;
    import java.util.ArrayList;
    import java.util.LinkedList;
import java.util.Arrays;
import java.util.Set;
    import java.util.TreeSet;
    import java.util.HashSet;
//iterator
import java.util.Iterator;
//scanners
import java.util.Scanner;

public class UnsolvedProblem2 {

    Set<String> a = new TreeSet<>();
    
  //generateID should return a pin like Strng for example P1257
    String generateID(){
    String stringCode = "P";
    char[] pin = new char[5];
    boolean run =false;
     for(byte count=1; count< pin.length;){
        
        while(!run){

         int digit = (int)(Math.random() *100);
            pin[count] = (char)digit;
            
            if(Character.isDigit(pin[count]) || Character.isLetter(pin[count])){
                stringCode = stringCode.concat(String.valueOf(pin));
                if(count == 4){
                    run = !run;
                    break;
                }
            }
            count++;
        }
    }
    return stringCode.concat(String.valueOf(pin)); 
    }
    class Electronic{
        private String brand;
        private String model;
        private String id;
        
        Electronic(String b, String m, String id){
            this.brand = b;
            this.model = m;
            this.id = id;
        }
        
        public String getBrand(){return this.brand;}
        public String getModel(){return this.model;}
        public String getID(){return this.id;}
    }
    public static void main(String... args){
      
       Scanner input = new Scanner(System.in);
       UnsolvedProblem2 access = new UnsolvedProblem2();
       Collection<Electronic> items = new HashSet<>();
       
        items.add(
             access.new Electronic("Dell", "Optiplex3020", access.generateID())
        );
       
        items.add(access.new Electronic(
                "Dell", "Optiplex7020", access.generateID())
        );

        
//       items.add(new Computers("Lenovo ", "G5020", access.id()));
//       items.add(new Computers("Dell ","7020", access.id()));
//       int countItems =1;
//       
//       for(Computers display: items){
//           //System.out.println(display.getID());
//           countItems++;
//       }
        items.forEach( count -> {
            System.out.println(count.getID());
            }
        );
        
    }
}
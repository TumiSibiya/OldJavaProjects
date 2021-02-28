package practice;
/**
 *
 * @author Khaya
 */
import java.util.Collection;
    //forms
    import java.util.List;
//arrays
import java.util.ArrayList;
//scanner
import java.util.Scanner;
//exceptions
import java.util.InputMismatchException;

class UnsolvedProblem1{

   private Scanner input = new Scanner(System.in);
     class Person{
         
        private String name;
        private byte age;
        
        Person(String name, byte age){
            this.name = name;
            this.age = age;
        }
    }
    Person addPerson(String name, byte age){
       return new Person(name, age);
    }
    String setName()throws InputMismatchException{
        String newName = input.nextLine();
      return newName;
    }
    byte setAge()throws InputMismatchException{
        byte newAge = input.nextByte();
      return newAge;
    }
    public static void main(String... args){
      
      List<Person> users = new ArrayList<>();
      
      System.out.println("Please enter your names below, Press 0 when finished");
        try{
           UnsolvedProblem1 access = new UnsolvedProblem1();
               for(int c =0; c < 3;c++){
                  String name = access.setName();
                  Byte age = access.setAge();
                  users.add(new UnsolvedProblem1().addPerson(name, age));
               }
               
               for(Person count : users){
                   System.out.println("Name : "+ count.name + "Age : "+ count.age);
               }
        }catch(InputMismatchException imex){
            
            for(Person count : users){
                System.out.println("Name : "+count.name + "\nAge : "+count.age);
                }
            System.out.println("Oops you invalid operation,\n\tPlease");
            imex.printStackTrace();
        }
    }
}

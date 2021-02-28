package practice;
//scanners
import java.util.Scanner;
//collection
import java.util.Collection;
  //interfaces 
     import java.util.Set;
     import java.util.List;
    //forms
    import java.util.List; import java.util.ArrayList;
    import java.util.Set;   import java.util.TreeSet;
//exceptions
import java.lang.ClassCastException;
import java.util.InputMismatchException;
public class UnsolvedProblem3 {
    
    interface Client{

        String getName();
        Byte getAge();
    }
    
   protected class Person implements Client{
        private String name;
        private byte age;
        
        Person(){}
        
        protected Person(String name){
            this.name = name;
        }
        protected Person(byte age){
            this.age = age;
        }
        protected Person(String name, byte age){
            this(age);
            this.setNewName(name);
        }
        protected void setNewName(String newName){
            this.name = newName;
        }
        @Override
        public String getName(){
            return this.name;
        }
        @Override
        public Byte getAge(){
            return this.age;
        }
    }
    private Scanner input = new Scanner(System.in);
    private List<Person> people = new ArrayList<>();
    private TreeSet<Person> registerClients = new TreeSet<>();
    
    protected TreeSet<Person> setClients(){
        int count=0, numberOfClients =0;
        
            System.out.println("Enter number of clients");
            
            UnsolvedProblem3 accessPractice = new UnsolvedProblem3();
            
            numberOfClients = input.nextInt();
            
            while(count < numberOfClients){
                System.out.println("Enter name ");
                String clientName = input.next();
                System.out.println("Enter age ");
                byte age = input.nextByte();
                
                registerClients.add(accessPractice.new Person(clientName, age));
                input.nextLine();
            }
        return registerClients;
    }
    public static void main(String... args){
        
        UnsolvedProblem3 access = new UnsolvedProblem3();
        try{
            Set<Person> clients = (TreeSet<Person>)access.setClients();

            for(Person person : clients){
                System.out.println(person.name.contains("Tumi"));
                }
            
            }catch(InputMismatchException | ClassCastException ex ){
                ex.printStackTrace();
            }
    
    }

}

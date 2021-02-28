package practice;
import java.util.List;
    import java.util.ArrayList;
import java.util.Arrays;


public class NewClass1{

    public class Person{
    
        private String firstName;
        private String lastName;
        private String sex;
        private byte age;
        private long ID;
        
        Person(String firstName, String lastName){
            this.setName(firstName);
            this.setLastName(lastName);
        }
        Person(String sex){
            this.setSex( sex);
        }
        
        Person(long id){
            this.setID(id);
        }
        protected void setName(String name){}
        protected void setLastName(String lastName){}
        protected void setSex(String sex){this.sex = sex;}
        protected void setID(long IDnumber){this.ID = IDnumber;}
        
        public String getFirstName(){return this.firstName;}
        public String getLastName(){return this.lastName;}
        public String getSex(){return this.sex;}
        public byte getAge(){return this.age;}
        public long getID(){return this.ID;}
    }
    public ArrayList<Person> generateListOfPeople(){
    
     java.util.Scanner input = new java.util.Scanner(System.in);
     System.out.println("Enter totol number of your people");
     byte length = input.nextByte();
     
        Person[] people = new Person[length];
        NewClass1 accessNewClass1 = new NewClass1();
        
        byte count = (byte)people.length;
        String fName, sName, gender;
        byte age;
        Long idNumber;
        System.out.println("Fill in the following");

        NewClass1.Person accessPerson;
        while( count >0){
            System.out.print("First Name : ");fName = input.nextLine();
            System.out.print("Second Name : " );sName = input.nextLine();
            System.out.print("Sex : ");gender = input.nextLine();
            
            input.nextLine();
            
            System.out.printf("%s","Age : ");age = input.nextByte();
            System.out.printf("%s","ID number : ");idNumber =input.nextLong();
            
            System.out.printf("Candidate to add is %s %s of gender %s aged %d and IDnumber %d ?"
                    + "(Pesss Y and N)", fName, sName,gender, age, idNumber);input.nextLine();
            String responce = input.nextLine();
            if(responce.equalsIgnoreCase("Y")){

                people[count] = new Person(fName, sName);
                count--;
            }
        }
        
       ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(people));
        
        return peopleList;
    }
    public static void main(String... args){
    }
}
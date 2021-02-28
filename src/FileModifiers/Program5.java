package FileModifiers;
//Exceptions
import java.io.IOException;
import java.io.FileNotFoundException;
//iO Classes
import java.io.File;
import java.io.PrintWriter;
//util
import java.util.Scanner;
public class Program5{

    public static void makeWrittable(String fileName)throws FileNotFoundException{
    
        File file = new File(fileName);
            file.setWritable(true);
    }
    
    public static void makeReadOnly(String fileName)throws FileNotFoundException{
    
        File file = new File(fileName);
        
        try(PrintWriter output = new PrintWriter(file)){
            
            System.out.println(file.setReadOnly());
        }
    }   
    public static void deleteFile(String fileName)throws FileNotFoundException{

            File file = new File(fileName);

            PrintWriter output = new PrintWriter(file);
            
            output.print(file.delete());
            
            output.close();
            
    }
    public static void renameFile(String fileDirectory)throws FileNotFoundException{
    
            File file = new File(fileDirectory);
            String newName = "NewNsme";
            try(PrintWriter output = new PrintWriter(file)){

                output.print(file.renameTo(file));
            }
    }
    
    public static void main(String[] args)throws IOException{

        Scanner input  = new Scanner(System.in);

        String dir;
        try{
          
            dir = input.nextLine();
                   
           renameFile(dir);
                   
          System.out.println(new FileModifiers.Program4().viewFileDetails(dir));

          makeReadOnly(dir);
          
          System.out.println("\n");
          
          System.out.println(new FileModifiers.Program4().viewFileDetails(dir));
          
          makeWrittable(dir);
          
          deleteFile(dir);
          
          System.out.println(new FileModifiers.Program4().viewFileDetails(dir));
        }catch(IllegalArgumentException iaex){  
            System.out.println("Illigal Argument");
        }catch(FileNotFoundException fnfex){
            System.out.println("File not found");
        }
    }
 }
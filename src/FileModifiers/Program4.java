package FileModifiers;
/**
 *
 * @author Tumi
 */
//Excpetions 
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
//
import java.io.File;
import java.util.Date;
import java.util.Scanner;
public class Program4 {

   /*final String userDirectory;
    
    Practice(){
        
        this.userDirectory = "uninitialized";
    }
    
    Practice(String dir){
    
        this.userDirectory = dir;
    }
     */       
    public StringBuilder viewFileDetailInCurrentDir(String fileName)throws
            FileNotFoundException{

        File file = new File(fileName);
        StringBuilder properties;
        
                properties = new StringBuilder("Name : " + file.getName() + "\nPath : " +
                file.getPath()+ "\nSize : " + file.length() + " bytes\nDate Created : " + 
                new Date(file.lastModified()) + "\nReadable : " + file.canRead()
                + "\nWrittable : " + file.canWrite() + "\nHidden : " + file.isHidden()
                + "\nFile type : " + file.isFile());
        
        return properties;
    }
    public StringBuilder viewFileDetails(String fileDirectory)throws IllegalArgumentException,
            FileNotFoundException{
    
        File file = new File(fileDirectory);

        StringBuilder properties;
        properties = new StringBuilder("Name : " + file.getName() + "\nPath : " +
             file.getPath() + "\nSize : " + file.length() + " bytes\nDate Created : " + 
             new Date(file.lastModified()) + "\nReadable : " + file.canRead()
             + "\nWrittable : " + file.canWrite() + "\nHidden : " + file.isHidden()
             + "\nFile type : " + file.isFile());
        
        if(file.isAbsolute()){
            
            properties.insert(properties.length(), "\nFoler : " + file.getParent());
            Program5.deleteFile(fileDirectory);
            
        }else if(file.exists()){
        
            properties.insert(0, "\nExistance : " + file.exists());
        }
        
        return properties;
    }
    //C:\\Users\\Khaya\\Documents\\Books and More\\To Download.txt
    public static void main(String[] args)throws IOException{
    
        Scanner input = new Scanner(System.in);
        
            String userDir;
        try{
        System.out.println("Enter File Directory");
        Program4 accessPractice4 = new Program4();
        
            userDir = input.nextLine();
          // System.out.println(accessPractice4.viewFileDetailInCurrentDir(userDir));
            
           System.out.println(accessPractice4.viewFileDetails(userDir));
            
        }catch(InputMismatchException imex){
            System.out.println("This is not a file");
        }catch(FileNotFoundException fnfex){
           System.out.println("File not found");
        }finally{
        
           // input.nextLine();
        }
            
    }
}

package projects.fileviewer;
/**
 *
 * @author Khaya
 */
//IO
import java.io.FileNotFoundException;

import java.io.File;
import java.io.PrintWriter;

//util

import java.util.Scanner;

public abstract class FileProgram {

    private String fileName;
    
    FileProgram(){
    
        this.fileName = "Unknown";
    }
    protected boolean editFile(){
    
        File file = new File(this.fileName);

       return true;
    }    
    public static void main(String[] args){
  
    }
}

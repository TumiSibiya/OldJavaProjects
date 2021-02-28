package projects.fileviewer;
/**
 *
 * @author Khaya
 */
//IO
import java.io.File;
import java.io.PrintWriter;

import java.io.FileNotFoundException;

//util

public   class FileModifier extends FileProgram {

    
    public boolean renameFile(String fileName)throws FileNotFoundException{
    
        File file = new File(fileName);
        
        return file.renameTo(file);
    }
    protected boolean deleteFile(String fileName) throws FileNotFoundException{
    
        File file = new File(fileName);
        
        return file.delete();
    }
    protected boolean makeFileReadOnly(String fileName)throws FileNotFoundException{
    
        File file = new File(fileName);
        
        return file.setReadOnly();
    }
    protected boolean makeFileWritable(String fileName)throws FileNotFoundException{
    
        File file = new File(fileName);
        
        return file.setWritable(true);
    }
    protected boolean makeFileExecutable(String fileName){
    
        File file = new File(fileName);
    
        return file.setReadable(true);
    }
}

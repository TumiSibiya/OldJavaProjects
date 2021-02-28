package FileModifiers;
/**
 *
 * @author Khaya
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ArrayElementManipulator {
    
    int[] generateArray(int elements)throws IllegalArgumentException{
    
       Random access = new Random();
       
        int[] results = new int[elements];

        int randomNumber;
        for(int count =0; count < results.length; count++){
        
            randomNumber = access.nextInt(40);
            
            results[count] = randomNumber;
        }
       return results;
    }
    
    int binarySearchArray(int[] data, int key){
    

        int low = data[0];
        int mid =0;
        int high = data.length -1;
    
        while(mid == (low + high)/2){
        
            if(key == data[mid]){
                return data[mid];
            }else if(key > data[mid]){
                return low = mid + 1;
            }else 
                return high = mid - 1;
            
        }
        return -1;
    }
    int[] bubbleSortArray(int[] data)throws ArrayIndexOutOfBoundsException{
    
        int temp;
        //int toCompare = 0;
        for(int a =0; a < data.length; a++){
            for( int b = a + 1; b < data.length; b++){
                //out of range
              if( data[a] > data[b]){
                temp = data[a];
                data[a] = data[b];
                data[b] = temp;
              }
            }
            
        }
        return data;
    }
    public static void main(String[] args){
    
        ArrayElementManipulator access = new ArrayElementManipulator();
        
        Scanner input = new Scanner(System.in);
        
       int[] data = access.generateArray(input.nextInt());
        
       System.out.println(Arrays.toString(data));
       
       System.out.println();
     }
}

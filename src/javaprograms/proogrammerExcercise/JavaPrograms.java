package javaprograms.proogrammerExcercise;

/**
 *
 * @author Tumi
 */
public class JavaPrograms {

    static char[] generate6LetterPassward(char[][] randomLetters){
    
        char[] sixLengthArray = new char[6];
        
        for(int count =0; count< sixLengthArray.length; count++){
         
            int randomLetterFrom2D0 = (int)(Math.random() * randomLetters.length );
            int randomLetterFrom2D1 = (int)(Math.random() * randomLetters[0].length );
            
            for(int count1 =0; count1 < count; count1++){
                
            sixLengthArray[count] = randomLetters[randomLetterFrom2D0][randomLetterFrom2D1];
            
            }
        }
        
      return sixLengthArray;
    }
    static char[][] generateTwoDimensional(){
    
      char[][] randomLetters = new char[4][4];
        for(int rowCount =0; rowCount < randomLetters.length; rowCount++){
        
            char aLetter = (char)((Math.random() * 26) + 65);
            
            for(int columeCount=0; columeCount < randomLetters[rowCount].length; columeCount++){
                
                randomLetters[rowCount][columeCount] = aLetter;
            }
        }
        return randomLetters;
    }
    public static void main(String[] args) {

        char[][] passwardChar = generateTwoDimensional();
 
       for(int count=0; count < 10;count++){
           char[] passwards = generate6LetterPassward(passwardChar);
           System.out.println(passwards);
       }
    }
}

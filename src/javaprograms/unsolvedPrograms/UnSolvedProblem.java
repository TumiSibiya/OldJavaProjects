package javaprograms.unsolvedPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
public class UnSolvedProblem{

    static void holdToken(ArrayList<String> token, int index){
           System.out.print(token + " " );
           System.out.println("at index " +index);
    }
    public static void main(String[] args){
    
        String sentence = "I'm am an idiot brvdsdf";
        ArrayList<String> arrayListVersion = new ArrayList<>();
        
        StringTokenizer st = new StringTokenizer(sentence," ");
        int countTokens = 1;
        String message = "Token No.";
        boolean run = false;
        while(st.hasMoreTokens()){
            
                if(st.nextToken().length() >= 4){
                    System.out.println(message.concat("")+ countTokens + " is > 4");
                        arrayListVersion.add(st.toString());
                    holdToken(arrayListVersion, countTokens);
                }
           countTokens++;
        }
    }
}
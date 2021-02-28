/*package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Spliterator;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class TestSomething{

    
    private String pinCode;
    {
        pinCode ="";
    }
    public static List<Character> createNewList(byte size){
        List<Character> characterList = new ArrayList<>();
        boolean run =false;
        byte count=0;
        while(!run){
          char ch = (char)(Math.random() *200);
            if(Character.isLetter(ch) && count <size){
                characterList.add(ch);
                count++;
            }else if(count ==size)
                run = !run;
        }
      return characterList;
    }
    public static void printIterator(List<Character> characterList){
        Iterator<Character> iteratorVersion = characterList.iterator();
        
        while(iteratorVersion.hasNext())
            System.out.print(iteratorVersion.next());
        System.out.println();
    }
    private String generatePassward(List<Character> characterList){
        char[] ch = new char[characterList.size()];
        
        characterList.forEach( e -> {
            ch[e] = characterList.get(e);
            
            if(!pinCode.equals(null)){
                pinCode.concat(String.valueOf(e));
            }
        });
        
      return pinCode;
    }
    public static void main(String... args){
//
//        byte size =5;
//        printIterator(createNewList(size));
//        printIterator(createNewList(size));
//        printIterator(createNewList(size));
        
        List<String> nameList = new ArrayList<>();
        nameList.add("Tumi");
        nameList.add("Khaya");
        nameList.add("Sibiya");
        Spliterator<String> names = nameList.spliterator();
        names.forEachRemaining(System.out::println);
        
        List numbers = java.util.Arrays.asList(1,2,3);
        numbers.forEach(System.out::println);
        System.out.println("----------spliterator Version-----------");
        Spliterator spliteratorVersion = numbers.spliterator();
        spliteratorVersion.forEachRemaining(System.out::println);
        System.out.println("----------Stream Version-----------");
        Stream streamVersion = numbers.stream();
        streamVersion.map(x->(x)).forEach(System.out::println);
    }
}*/

package practice;
class TestSomething{

    public static void main(String[] args){
    
        double i = 15/100;
        
        long amount = (long)Math.pow(1250 * (1 + i), 12*5);
        System.out.println((double)amount /10000);
    }
}
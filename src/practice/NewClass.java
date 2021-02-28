/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Collection;
    import java.util.ArrayList;

import java.util.Scanner;
/**
 *
 * @author Khaya
 */
public class NewClass {
    public String generateStrings(byte number){
        String randomString;
        boolean run;
        char[] ch = new char[number];
        
        for(int count=0; count<number;count++){
            run = true;
            while(run){
               char randomChar = (char)(Math.random()*300);
            
                if(Character.isLetter(randomChar)){
                    ch[count] = randomChar;
                    run = !run;
                }
            }
        }
        randomString = String.valueOf(ch);
      return randomString;
    }
    public static void printMessage(){
        System.out.print("Enter length of collection___:");
    }
    public static void main(String... args){
       Scanner input = new Scanner(System.in);
        Collection<String> collection = new ArrayList<>();
        byte value;
        printMessage();
        value = input.nextByte();
        collection.add(new NewClass().generateStrings(value));

        collection.forEach(System.out::print);System.out.println();
    }
}

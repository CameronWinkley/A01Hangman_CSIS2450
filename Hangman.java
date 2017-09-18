
 
package a01.hangman;
import java.util.*;
/**
 *
 * @author Stomp
 */
public class A01Hangman {

    /**
     * @param args the command line arguments
     */
    
    private static String[] words = {"jazz", "blues", "Metal", "country","gospel"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       System.out.println("welcome to hangman");
       System.out.print("Let's play a game");
       
       while(count < 7 && asterisk.contains("*"))
       {    
           System.out.println("Hint: types of music");
           System.out.print("Guess a letter: ");
           System.out.println(asterisk);
           String guess = input.next();
           game(guess);
       }
       input.close();
    }   
       
    
    public static void game(String guess)
       {
           String newasterisk = "";
           for(int i = 0; i < word.length(); i++)
           {
               if(word.charAt(i) == guess.charAt(0))
               {
                   newasterisk += guess.charAt(0);
               }else if (asterisk.charAt(i) != '*')
               {
                   newasterisk += word.charAt(i);
               }else {
                        newasterisk += "*";
               }
           }
      
       
       if(asterisk.equals(newasterisk))
       {
           count++;
           image();
           
       }else{
           asterisk = newasterisk;
       }
       if(asterisk.equals(word))
       {
           System.out.println("you win! the word to guess was " + word);
       }
       
    }
    
    public static void image()
    {
        switch(count){
            case 1: count = 1;
        
            System.out.println("----------\\");
            break;
            
            case 2: count = 2;
            System.out.println("------------");
            break;
            
            case 3: count = 3;
            System.out.println("|"
                    + "| "
                    + "|"
                    + " |"
                    + "|");
            break;
        
            
        
        
      
   }    
    }  
 }
    


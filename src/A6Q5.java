
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A6Q5 {

    
    public static void starGen(){
        //loops 15 times
        for(int loop = 15; loop >0; loop = loop -1){
        //guesses a random number between 0-6 but not one
            int randomNumber = (int)(Math.random()*6) +1;
        //if the number is picked stars are printed to screen
        if(randomNumber == 2){
            System.out.println("*");
    }
    if(randomNumber == 3){
        System.out.println("**");
    }
    if(randomNumber == 4){
        System.out.println("***");
    }
    if(randomNumber ==5){
        System.out.println("****");
    }
    if(randomNumber ==6){
        System.out.println("*****");
    }
    }
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("FUN STARS.");
    //starts method
   starGen();
   
    }
}

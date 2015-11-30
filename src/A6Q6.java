
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A6Q6 {

   
    public static int lastDiget(int r){
     //takes the last number
        int answer = r %10;
        //sends number back to the main method 
        return answer;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("number?");
       //stored user imout number
        int number =input.nextInt();
      
        int last = lastDiget (number);
      //if the number is negative it will make it positive
        if(last < 0){
           last = last *-1;
       }
      //prints out the last number
        System.out.println(last);
         
        
    }
}

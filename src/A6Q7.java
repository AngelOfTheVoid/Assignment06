
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A6Q7 {

    public static int firstDigit(int r){
      //sets fill to the number the user entered
        int fill = r;
//while the number is grater then one diget it will be devied by 10
        while(fill >10){
    fill = fill / 10;
    
}        
        
        
        //sends back the first number
        return fill;
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner(System.in);
        System.out.println("number?");
   //user inputs number
   int fNumber = input.nextInt();
  //if the number is nagative it will become positve
   if(fNumber <0){
            fNumber = fNumber *-1;
                    }
    
   int firstNum = firstDigit(fNumber);
   //outputs the first diget     
   System.out.println(firstNum);
    
    
    }
}

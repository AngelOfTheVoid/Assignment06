
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A6Q3 {

    //fix issue with spacing in output
 public static void factor(int v){
     int devisable = v;
     
     while(devisable >0 ){
    
         int factored = v % devisable;
       
         if(factored == 0){
             
             System.out.println(devisable);
   
         }
     
     devisable = devisable -1;
     System.out.println();
    }
 }   
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("plese put in the number you want to factor");
        Scanner input = new  Scanner(System.in);
    int valueE = input.nextInt();
        factor(valueE);
    
    }
}


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static double areaCircle(double r){
        double area = Math.PI*Math.pow(r,2);
        return area;
    }


 public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
     System.out.println("please enter the circle radius");
        double radius = input.nextDouble();
        double answer = areaCircle(radius);
     System.out.println("the area of your circle is " + answer);


 }


}

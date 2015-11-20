
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bettk6516
 */
public class A6Q2 {
//the method takes the exam grade, assigning it a value the determins the corroct grade 

    public static void examGrade(double g) {
        while (true) {
            if (g < 50) {
                System.out.println("game over. you got a F");
                break;
            }
            if (g <= 59) {
                System.out.println("D! for determined!");
                break;
            }
            if (g <= 69) {
                System.out.println("C, cuz you didn't try");
                break;
            }
            if (g <= 79) {
                System.out.println("B! your da best");
                break;
            }
            if (g > 80) {
                System.out.println("A!!!! good for you...");
                break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Plase enter your exam grade");
        Scanner input = new Scanner(System.in);
        //takes next double inputed by the user and stores it
        double grade = input.nextDouble();
        examGrade(grade);

    }
}

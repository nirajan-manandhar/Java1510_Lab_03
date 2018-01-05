/**
 * 
 */
package ca.bcit.comp1510.lab3;
import java.util.Random;

/**
 * Rolls various dice.
 * @author nirajanmanandhar
 * @version 1.0
 *
 */
public class Dice {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Random roll = new Random();
        
        //4 sided die
         final int faceValue4 = roll.nextInt(4) + 1;
         System.out.println("The 4-sided die rolled: " + faceValue4);
         
        //6 sided die
         final int faceValue6 = roll.nextInt(6) + 1;
         System.out.println("The 6-sided die rolled: " + faceValue6);

         
        //8 sided die
         final int faceValue8 = roll.nextInt(8) + 1;
         System.out.println("The 8-sided die rolled: " + faceValue8);

         
        //10 sided die
         final int faceValue10 = roll.nextInt(10) + 1;
         System.out.println("The 10-sided die rolled: " + faceValue10);

         
        //12 sided die
         final int faceValue12 = roll.nextInt(12) + 1;
         System.out.println("The 12-sided die rolled: " + faceValue12);

         
        //20 sided die
          final int faceValue20 = roll.nextInt(20) + 1;
         System.out.println("The 20-sided die rolled: " + faceValue20);

         //The added value of all the rolled dice
         System.out.println("The added value of all the rolled dice is: " 
         + (faceValue4 + faceValue6 + faceValue8 + faceValue10 
         + faceValue12 + faceValue20));

    }

}

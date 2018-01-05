package ca.bcit.comp1510.lab3;

import java.util.Scanner;

/**
  * FunWithStrings Class Practicing Strings.
  * 
  * @author nirajanmanandhar
  * @version 1.0
  * 
  */

public class FunWithStrings {

    /**
     * Drives the program.
     * 
     * @param args
     *            unused
     * 
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = new String();
        
        input = scan.nextLine();
        int length = input.length();
        
        System.out.println(length);
        
        boolean result = input.startsWith("The");
        System.out.println("The string starts with \"The\": " + result);
        
        String trimmedUserInput = new String(input.trim());
        System.out.println(trimmedUserInput);
        
        String input1 = new String(trimmedUserInput.toUpperCase());
        
        String input2 = new String(trimmedUserInput.toLowerCase());
                      
        String middle = new String(input2.substring(1, length - 1));
        System.out.println(middle);
        
        System.out.println(input1.substring(0, 1) 
        + middle + input1.substring(length - 1, length));
        
        scan.close();
    }

}

/*
 * 10. The Scanner's next() method only returns the next token
 * whereas the nextLine() method scans for the entire next line.
 * 
 * 14. The toUpperCase() method is not permanent
 * 
 * 15. If we invoke the toUpperCase() method on a string, 
 * then assign that result to a new string variable, the uppercase is permanent
 * 
 * 
 * 
 * 
 */

package ca.bcit.comp1510.lab3;
import java.util.Scanner;
import java.text.DecimalFormat;



/**
 * Measures distance between two points.
 * @author nirajanmanandhar
 * @version 1.0
 *
 */

public class Distance {
    
    /**
     * Drives the program.
     * @param args unused
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the x and y coordinates"
        + " of the first object, separated by a space");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println(x1 + " and " + y1);
        
        System.out.println("Enter the x and y coordinates"
        + " of the second object, separated by a space");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        System.out.println(x2 + " and " + y2);
        
        double differencex = (x2 - x1);
        double differencey = (y2 - y1);
        
        double xsquared = Math.pow(differencex, 2);
        double ysquared = Math.pow(differencey, 2);
        
        double total = (xsquared + ysquared);
        
        double answer = Math.sqrt(total);
        System.out.println(answer);
        
        DecimalFormat limited = new DecimalFormat("#.##");
        System.out.println("The distance is: " + limited.format(answer));
        
        
        scan.close();
        
    }
    
}

/*
 * Created by Norman Potts
 *
 * I, Norman Potts created this script.
 */
package CalculateDegreesCelsiusFahrenheit;

import java.util.Scanner;
/**
 *
 * @author Norman
 * 
 * The purpose of this package.
 * Makes use of class Degrees which implements the following double methods.
 * 
 *      Degrees
 *      ---------
 *      ---------
 *      +Celsius(f:Double): Double
 *      +Fahrenheit(c:Double):Double
 *      +displayTable()
 * 
 * 
 *      Method Celsius returns the Celsius equivalent of a given Fahrenheit 
 *      temperature
 *      Method Fahrenheit returns the Fahrenheit equivalent of a given Celsius 
 *      temperature
 *      Method displayTable should use the above methods to print the chart 
 *      showing:
 *          -The Fahrenheit equivalent of all Celsius temperatures from 0 to 100
 *           in 4 degree intervals.
 *          -The Celsius equivalent of all Fahrenheit temperature from 32 to 212
 *           in 10 degree intervals
 *          -Both columns in each chart should be printed to one decimal place.
 *  `       -Print the chart in a neat tabular format that minimizes the number 
 *           of line output while remaining readable
 * 
 * 
 * PSEUDOCODE     
 *      DO {              
 *          PROMPT user to begin script. By asking them to enter number 1.
 *         
 *         If (input == 1 ) 
 *              Transfer method for displayTable         
 *              PRINT displayTable          
 *         ELSE
 *          PROMPT user to enter 1...
 * 
 *      }WHILE( start not = 1);          
 *      END
 *  
 */
public class CalculateDegreesCelsiusFahrenheit {

    public static void main(String[] args) {
                              
        Scanner input = new Scanner( System.in);
           
        int start;
           
        do {
           // This bitofcode allows user to begin temperature conversion.
           System.out.println("Please type 1 and press ENTER to display a Temperature Conversion Table.");   
           start = input.nextInt();
           
            if (start == 1 )
            {   
                // Transfers Display Table and prints.
                Degrees deg = new Degrees();// Creates object deg of class Degrees            
                deg.displayTable();// Directs to displayTable method from object deg
            }            
            else 
            {
                System.out.println(" press 1...");
            }
           
        }while(start !=1);
                                             
    }/// End of method main.        
    
} /// End of class CalculateDegreesCelsiusFahrenheit.

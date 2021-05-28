/*
 * Created by Norman Potts
 *
 * I, Norman Potts created this script.
 */
package CalculateDegreesCelsiusFahrenheit;

/**
 *
 * @author Norman
 * 
 * 
 * The purpose of this package.
 * Makes use of class Degrees which implements the following double methods as 
 * the given UML diagram represents.
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
 *      temperature.
 *      Method Fahrenheit returns the Fahrenheit equivalent of a given Celsius 
 *      temperature.
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
 * PSEUDOCODE
 * 
 *  CALCULATE 
 *         -The Fahrenheit temperatures in Celsius from 0C to 100C in for 4C 
 *          degree intervals. 
 *              SEND CelsiustoFahrenheit
 *         -The Celsius temperatures of Fahrenheit temps from 32F to 212F in 10F
 *          degree intervals.    
 *              SEND FahrenheittoCelsius
 *  CREATE displayTable
 *         Transfer method CelsiustoFahrenheit numbers
 *         Transfer method FahrenheittoCelsius numbers
 *      Form Print Statement
 *
 *            
 * 
 * 
 */
public class Degrees {
   
    private double f; // Double variable for fahrenheit temperature    
    double fc, cf;  // Tempary variables for conversions of farhenheit to celsius and celsius to farheneit.
    
    
    /** Method fahrenheit
     * 
     * @param c
     * @return 
     */
    public double fahrenheit(double c)
    {
        /// Calculates farhenheit from a celsius temp.
        f = c * 9.0/5 + 32.0;
        return f;
    }
    
    
    /** Method celsius
     *      Calculates celsius`
     * 
     * @param c
     * @return 
     */
    public double celsius(double c)
    {        
        /// c equals f minus 32 times 5 divided by 9.
        c = (f - 32.0)* 5.0/9; 
        return c;
    }
    
    
    /** Method displayTable
     *     Prints out the table. 
     */
    public void displayTable()
    {
        System.out.printf("Temperature Conversion Table\n\n");//Print statemets help, organise table too.
        System.out.printf("        Celsius    Fahrenheit   Fahrenheit    Celsius\n");
        double ftemp;
        ftemp = 32; // Intinalize at 32
        for (double ctemp = 0; ctemp<= 100; ctemp= ctemp+ 4,ftemp = ftemp + 10)
        {
            fc = fahrenheit(ctemp);
           System.out.printf("      %5.1f         %5.1f   ",ctemp, fc);

           if(ftemp<=212.0)
           {
                   cf = celsius(ftemp);
                   System.out.printf("    %5.1f         %5.1f", ftemp, cf);
           }
                   System.out.printf("\n");
        }    
        
    }/// End of method displayTable
    
}/// End of class degress
**
*
*
*The purpose of this program is to convert weight by asking the user to convert
*kilograms or pounds. Then prompts the user to enter a value to be converted.
*
*
*@version: 2/17/11
*
*
**/

import java.util.Scanner; // import Scanner

public class Convertweight {
	public static void main(String [] args) {
         
	 Scanner input = new Scanner(System.in);

          // Define Weight Conversions

          final double KGSTOLBS = 1 *  0.45359237;
          final double LBSTOKGS =  1 * 2.20462262;

          //Oupout and Purpose
          System.out.println("Convert Weight: ");
          System.out.println("  Type 1 for Pounds to Kilograms and Frams ");
          System.out.println(" Type 2 for Kilograms to Pounds and Ounces ");

          // Option Weight
          System.out.println("What Conversion do you want? ");
          int menu_options =  input.nextInt(); 

          //Option 1
          if (menu_options == 1) {
             System.out.println("What weight value do you want converted? ");
             System.out.println("Enter your weight in pounds to be converted to kgs: ");
             int weight_lbs = input.nextInt();

             //Conversion Calculation
             int new_kgs = (int)(weight_lbs * KGSTOLBS);
             int new_grams = (int)((new_kgs %  KGSTOLBS) * 1000);
             System.out.println("The answer is: " + weight_lbs + " pounds converts to " +
                     new_kgs + " kilograms and " + new_grams + " grams.");
          }


          //Option 2
          else if (menu_options == 2) {
              System.out.println("What weight value do you want converted? ");
              System.out.println("Enter your weight in kgs to be converted to lbs: ");
              int weight_kgs = input.nextInt();

              //Conversion Calculation
              int new_lbs = (int)(weight_kgs * LBSTOKGS);
              int new_oz = (int)((new_lbs % 16) * 1000);

             System.out.println("The answer is: " + weight_kgs + " kilograms converts to " +
                     new_lbs + " pounds and " + new_oz + " ounces.");
          }
          // Anything else is..
          else {
             System.out.println("Error invalid option");
             System.out.println("Program Terminated");
          }

        }// end of method
}// end of class

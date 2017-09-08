package week_1;

import static input.InputUtils.doubleInput;

/**
 Finish this program that converts a distance in meters,
 to the equivalent in feet.
 To convert a quantity of meters to feet, multiply the number of
 meters by exactly 3.28084.
 
 */
public class Question_0_Meters_To_Feet {
    
    
    //You don't need to modify this part
    public static void main(String[] args) {
        new Question_0_Meters_To_Feet().convert();
    }
    
    public void convert() {
        
        // Ask the user for the number of meters
        double meters = doubleInput("Please enter the number of meters: ");
        
        // Call convertMetersToFeet method, passing in the number of meters. This will do the conversion, and return the number of feet.
        double feet = convertMetersToFeet(meters);
    
        // Display the result to the user.
        System.out.println(meters + " meters " + " is equivalent to " + feet + " feet");
        
    }
    
    public double convertMetersToFeet(double meters) {
        
        // TODO write code here
        
        // TODO Use the variable meters.  Calculate the equivalent number of feet.
        // Use the conversion factor feet = meters * 3.28084
        
        // TODO replace this line with a line that returns the number of feet you calculated.
        return 0;  // this isn't the right answer, but Java insists that we return something.
        
    }
    
    
}

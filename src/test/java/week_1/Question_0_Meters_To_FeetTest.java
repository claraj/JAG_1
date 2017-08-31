package week_1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by clara on 8/31/17.
 */
public class Question_0_Meters_To_FeetTest {
    
    
    @Test
    public void convertMetersToFeet() throws Exception {
        
        double delta = 0.0000001;
        
        double conversion = 3.28084;
        
        Question_0_Meters_To_Feet q0 = new Question_0_Meters_To_Feet();
        
        assertEquals("3 meters should be equivalent to " + 3 * conversion + " feet", 3 * conversion, q0.convertMetersToFeet(3), delta);
        assertEquals("0 meters should be equivalent to " + 0 * conversion + " feet", 0 * conversion, q0.convertMetersToFeet(0), delta);
        assertEquals("12.34 meters should be equivalent to " + 12.34 * conversion + " feet", 12.34 * conversion, q0.convertMetersToFeet(12.34), delta);
    
    
    }
    
    
}
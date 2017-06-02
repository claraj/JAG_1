package week_1;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class Test_Class_Setup {

    @Test
    public void testAnswers() {

        Question_5_Class_Setup questions = new Question_5_Class_Setup();

        int boolCount = 0, stringCount = 0;

        try {
            Class q5 = Class.forName("week_1.Question_5_Class_Setup");
            Field[] fields = q5.getFields();

            for (Field f : fields) {
                Class type = f.getType();
                if (type.equals(boolean.class)) {
                    boolean b = f.getBoolean(questions);
                    assertTrue("Once you've competed the task for boolean " + f.getName() + ", set it to true", b);
                    boolCount++;
                }

                if (type.equals(String.class)) {
                    String s = (String)f.get(questions);
                    assertTrue("Write a response (or a longer response) for " + f.getName(), s.length() > 20);
                    stringCount++;
                }

            }

            assertEquals("Don't remove or change the data types of the boolean variables", 14, boolCount);
            assertEquals("Don't remove or change the data types of the String variables", 2, stringCount);


        } catch (Exception e) {
            e.printStackTrace();
            fail("This may happen if you rename or move the Question_5_Class_Setup.java file. If so, put it back to the original place. \nIf it's where it should be, please report this failure to Clara");
        }


    }
    
}
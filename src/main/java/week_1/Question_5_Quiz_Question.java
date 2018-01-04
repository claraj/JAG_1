package week_1;

import static input.InputUtils.stringInput;


/**
 *
 * Finish the method that correctly identifies if the answer to the quiz question
 * is correct.
 *
 * p.s. the answer is Bill Gates
 *
 */

public class Question_5_Quiz_Question {
    
    public static void main(String[] args) {
        
        System.out.println("Quiz time!");
        System.out.println("Which technology entrepreneur is supposed to have said \"640K [of RAM] ought to be enough for anyone\" ?");
        String answer = stringInput("Enter your answer: ");
        
        boolean correct = checkAnswer(answer);
        
        if (correct) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Sorry, the answer is Bill Gates.");
        }
        
    }
    
    public static boolean checkAnswer(String answer) {
        
        // TODO check that the user's answer is "Bill Gates" in any letter case.
        // Case doesn't matter, so "bill gates" or "BILL GATES" or any other variation in case is ok.
        return false;
    }
    
}


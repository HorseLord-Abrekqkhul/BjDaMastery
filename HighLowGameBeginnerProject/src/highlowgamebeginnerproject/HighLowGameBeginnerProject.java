/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highlowgamebeginnerproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BJ Fornero
 */
public class HighLowGameBeginnerProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean again = true;
        while (again) {
            Scanner getAns = new Scanner(System.in);
            int min = 1;
            int max = 100;
            int guesses = 0;
            int guess;
            int aloudGuesses = 4;
            String repeatAgain;

            Random rand = new Random();
            int answer = rand.nextInt(max) + min;

            System.out.println("This is the High Low Game. A number will be "
                    + "randomly generated between 1 and 100, and you will have"
                    + " 5 guesses at it!");
            System.out.println("Pick a number 1 through 100");

            while (guesses < aloudGuesses) {
                while (true) {
                    try {
                        guess = Integer.parseInt(getAns.nextLine());
                        break;
                    } catch (NumberFormatException nfe) {
                        System.out.println("Thats not a whole number!");
                    }
                }

                int guessesLeft = (aloudGuesses) - guesses;

                if (guess > answer) {
                    guesses = guesses + 1;

                    if (guesses < 5) {
                        System.out.println("Your answer was too high");
                        System.out.println("Your have " + guessesLeft + " guesses"
                                + " remaining");
                    } else {
                        break;
                    }
                } else if (guess < answer) {
                    guesses = guesses + 1;

                    if (guesses < 5) {
                        System.out.println("Your answer was too low");
                        System.out.println("Your have " + guessesLeft + " guesses"
                                + " remaining");
                    } else {
                        break;
                    }
                } else if (guess == answer) {
                    break;
                } else {
                    System.out.println("That's not a valid number");
                }

            }
            while (true) {
                try {
                    guess = Integer.parseInt(getAns.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println("Thats not a whole number!");
                }
            }

            if (guess == answer) {
                guesses = guesses + 1;
                System.out.println("Great Job! You won in " + guesses + " "
                        + "guesses!");
            } else if (guess != answer) {
                System.out.println("Sorry, you ran out of guesses. "
                        + "The answer was " + answer + ".");
            }
            System.out.println("Would you like to play again? Y or N");
            repeatAgain = getAns.next();
            again = repeatAgain.equalsIgnoreCase("Y");
        }
    }
}

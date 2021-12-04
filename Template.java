/*
* The "Template" program is a template
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-XX
*/

import java.util.Scanner;

/**
* This is a program that blanks.
*/
final class Template {

    /**
    * Constant.
    */
    public static final double CONSTANT = 1;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Template() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        final double variable;

        final Scanner userInput = new Scanner(System.in);

        // Block of code to try
        try {
                // ask the user to input something
                System.out.print("Enter something: ");

                // Stores float in mass
                final float aFloat = userInput.nextFloat();

                // Outputs something
                System.out.println("\nYou output " + variable + ".");

        } catch (java.util.InputMismatchException errorCode) {
        // Block of code to handle errors
                System.out.println("\nYou have not entered a valid input.");
        }

        System.out.println("\nDone.");
    }
}

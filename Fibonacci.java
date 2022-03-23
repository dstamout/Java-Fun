// This is a random compilation of things to do with fibonacci. This is not meant to be useful
// Scanner import
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Initial vars
        Scanner reader = new Scanner(System.in);
        int initInput = 0, num = 0;
        
        // Initial print
        System.out.println("Welcome to the Fibonacci! Yes, THE Fibonacci. You can do many things here."
        + "\nHere is a list:"
        + "\n1. Display Fibonacci sequence up to (but not including) initInput number"
        + "\n2. Display Fibonacci sequence terms");

        // Input loop
        while (true) {
            // See if input is int, do
            try {
                System.out.print("\nWhich one would you like to try out? ");
                initInput = Integer.parseInt(reader.nextLine());
                // Bounds exception
                if (initInput < 1 || initInput > 2)
                    throw new IllegalArgumentException("");
                break;
            }
            // Exception output
            catch (Exception e) {
                System.out.println("Invalid input. Not in bounds or is not a number. Please enter a valid input.");
            }
        }
        System.out.println("\nYou chose option " + initInput + ".");

        // If input 1 or input 2, enter num
        if (initInput == 1 || initInput == 2) {
            while (true) {
                try {
                    System.out.print("\nWhat number would you like to try? Must be positive. ");
                    num = Integer.parseInt(reader.nextLine());
                    if (num < 0)
                        throw new IllegalArgumentException("");
                    break;
                }
                catch (Exception e) {
                    System.out.println("Invalid input. Not in bounds or is not a number. Please enter a valid input.");
                }
            }

            // Perform fib nums
            if (initInput == 1)
                displayFibNums(num);
            // Perform fib terms
            if (initInput == 2)
                displayFibTerms(num);
        }

        // Closing message and reader close
        System.out.println("\nThanks for playing! Hope you found this cool!");
        reader.close();
    }

    // Efficient fibonacci iteration
    public static int fibonacci(int n) {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // Displays fibonacci numbers up to and not including the input number
    public static void displayFibNums(int num) {
        for (int i = 0; i <= num; i++) {
            if (fibonacci(i) >= num)
                break;
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Displays the amount of fibonacci terms based on input
    public static void displayFibTerms(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
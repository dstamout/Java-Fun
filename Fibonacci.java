import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Initial vars
        Scanner reader = new Scanner(System.in);
        int input = 0;
        
        // Initial Print
        System.out.println("Welcome to the Fibonacci! Yes, THE Fibonacci. You can do many things here.");
        System.out.println("\nHere is a list:\n1. Display Fibonacci sequence up to input number");

        while (true) {
            try {
                System.out.println("\nWhich one would you like to try out? ");
                input = Integer.parseInt(reader.nextLine());
                if (input < 1 || input > 1)
                    throw new IllegalArgumentException("");
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid input. Not in bounds or is not a number. Please enter a valid input.");
            }
        }

        

        reader.close();
    }

    public static void displayFib(int input) {
        
    }
}
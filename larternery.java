import java.util.Scanner;

public class larternery {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstInt = keyboard.nextInt();

        System.out.print("Enter second integer: ");
        int secondInt = keyboard.nextInt();

        // Ternary operator: condition ? valueIfTrue : valueIfFalse
        int largerInt = (firstInt >= secondInt) ? firstInt : secondInt;

        System.out.println("Largest number = " + largerInt);

        keyboard.close();
    }
}
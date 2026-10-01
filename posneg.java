import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double checkValue = keyboard.nextDouble();

        if (checkValue > 0) {
            System.out.println(checkValue + " is POSITIVE.");
        } else if (checkValue < 0) {
            System.out.println(checkValue + " is NEGATIVE.");
        } else {
            System.out.println("The number is ZERO.");
        }

        keyboard.close();
    }
}
import java.util.Scanner;

public class lotwo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double valueA = keyboard.nextDouble();

        System.out.print("Enter second number: ");
        double valueB = keyboard.nextDouble();

        double largestValue;
        if (valueA >= valueB) {
            largestValue = valueA;
        } else {
            largestValue = valueB;
        }

        System.out.println("Largest number = " + largestValue);

        keyboard.close();
    }
} 
    


import java.util.Scanner;


public class add{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int numOne = keyboard.nextInt();

        System.out.print("Enter second integer: ");
        int numTwo = keyboard.nextInt();

        int sumResult = numOne + numTwo;
        System.out.println("Sum = " + sumResult);

        keyboard.close();
    }
}

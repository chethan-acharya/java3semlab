import java.util.Scanner;

public class facfor{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNum = keyboard.nextInt();

        long factorialResult = 1;
        for (int counter = 1; counter <= inputNum; counter++) {
            factorialResult = factorialResult * counter;
        }

        System.out.println("Factorial of " + inputNum + " = " + factorialResult);

        keyboard.close();
    }
}
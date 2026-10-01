import java.util.Scanner;

public class op {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNum = keyboard.nextDouble();

        System.out.print("Enter second number: ");
        double secondNum = keyboard.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char chosenOperator = keyboard.next().charAt(0);

        double operationResult = 0;
        boolean validOperator = true;

        if (chosenOperator == '+') {
            operationResult = firstNum + secondNum;
        } else if (chosenOperator == '-') {
            operationResult = firstNum - secondNum;
        } else if (chosenOperator == '*') {
            operationResult = firstNum * secondNum;
        } else if (chosenOperator == '/') {
            if (secondNum != 0) {
                operationResult = firstNum / secondNum;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                validOperator = false;
            }
        } else {
            System.out.println("Error: Invalid operator entered.");
            validOperator = false;
        }

        if (validOperator) {
            System.out.println("Result = " + operationResult);
        }

        keyboard.close();
    }
}
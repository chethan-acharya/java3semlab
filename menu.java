import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner mathWizard = new Scanner(System.in);

        System.out.print("Enter the first ingredient (number): ");
        double ingredientOne = mathWizard.nextDouble();

        System.out.print("Enter the second ingredient (number): ");
        double ingredientTwo = mathWizard.nextDouble();

        System.out.print("Pick your recipe (+, -, *, /, %): ");
        char recipeChoice = mathWizard.next().charAt(0);

        double finalDish;
        boolean recipeWorked = true;

        switch (recipeChoice) {
            case '+':
                finalDish = ingredientOne + ingredientTwo;
                break;
            case '-':
                finalDish = ingredientOne - ingredientTwo;
                break;
            case '*':
                finalDish = ingredientOne * ingredientTwo;
                break;
            case '/':
                if (ingredientTwo == 0) {
                    System.out.println("Oops! Can't divide by zero, the kitchen would explode.");
                    finalDish = 0;
                    recipeWorked = false;
                } else {
                    finalDish = ingredientOne / ingredientTwo;
                }
                break;
            case '%':
                if (ingredientTwo == 0) {
                    System.out.println("Oops! Can't find remainder with zero.");
                    finalDish = 0;
                    recipeWorked = false;
                } else {
                    finalDish = ingredientOne % ingredientTwo;
                }
                break;
            default:
                System.out.println("Hmm, that's not a recipe on the menu!");
                finalDish = 0;
                recipeWorked = false;
        }

        if (recipeWorked) {
            System.out.println("Your dish is ready! Result = " + finalDish);
        }

        mathWizard.close();
    }
}
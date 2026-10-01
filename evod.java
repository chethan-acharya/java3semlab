import java.util.Scanner;

public class evod {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
 
        System.out.print("Enter an integer: ");
        int inputNumber = keyboard.nextInt();
 
        if (inputNumber % 2 == 0) {
            System.out.println(inputNumber + " is EVEN.");
        } else {
            System.out.println(inputNumber + " is ODD.");
        }
 
        keyboard.close();
    }
    
}

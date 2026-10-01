import java.util.Scanner;

public class palst {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Palindrome Checker");
        System.out.println("1) Check a number");
        System.out.println("2) Check a string");
        System.out.print("Choose an option (1 or 2): ");
        int menuChoice = keyboard.nextInt();
        keyboard.nextLine(); // clear leftover newline before reading text

        if (menuChoice == 1) {
            System.out.print("Enter a number: ");
            long inputNumber = keyboard.nextLong();
            checkNumberPalindrome(inputNumber);
        } else if (menuChoice == 2) {
            System.out.print("Enter a string: ");
            String inputText = keyboard.nextLine();
            checkStringPalindrome(inputText);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        keyboard.close();
    }

    // ---------- Number palindrome check ----------
    static void checkNumberPalindrome(long originalNumber) {
        long remainingDigits = originalNumber;
        long reversedNumber = 0;

        // Reverse the number digit by digit
        while (remainingDigits != 0) {
            long lastDigit = remainingDigits % 10;      // extract last digit
            reversedNumber = (reversedNumber * 10) + lastDigit; // build reversed number
            remainingDigits = remainingDigits / 10;      // remove last digit
        }

        System.out.println("Reversed number : " + reversedNumber);

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " IS a palindrome.");
        } else {
            System.out.println(originalNumber + " is NOT a palindrome.");
        }
    }

    // ---------- String palindrome check ----------
    static void checkStringPalindrome(String originalText) {
        // Normalize: remove spaces and make lowercase so
        // "Race Car" and "racecar" are both recognized correctly
        String cleanedText = originalText.replaceAll("\\s+", "").toLowerCase();

        String reversedText = new StringBuilder(cleanedText).reverse().toString();

        System.out.println("Cleaned text    : " + cleanedText);
        System.out.println("Reversed text   : " + reversedText);

        if (cleanedText.equals(reversedText)) {
            System.out.println("\"" + originalText + "\" IS a palindrome.");
        } else {
            System.out.println("\"" + originalText + "\" is NOT a palindrome.");
        }
    }
}
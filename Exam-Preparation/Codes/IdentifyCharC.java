import java.io.*;
import java.util.Scanner;

public class IdentifyCharC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String s = scanner.nextLine();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                System.out.println("'" + ch + "' is a letter.");
            } else if (Character.isDigit(ch)) {
                System.out.println("'" + ch + "' is a digit.");
            } else if (Character.isWhitespace(ch)) {
                System.out.println("'" + ch + "' is a whitespace character.");
            } else {
                System.out.println("'" + ch + "' is a special character.");
            }
        }
        scanner.close();
    }
}

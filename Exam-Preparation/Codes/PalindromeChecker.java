import java.io.*;
import java.util.Scanner;

public class PalindromeChecker {
    static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }                                                 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is NOT a Palindrome.");
        }
        scanner.nextLine();
        String str = scanner.nextLine();
        if (isPalindrome(str)) {
            System.out.println("\"" + str + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + str + "\" is NOT a Palindrome.");
        }
        scanner.close();
    }
}

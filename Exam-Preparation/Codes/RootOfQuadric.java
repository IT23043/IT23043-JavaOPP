import java.io.*;
import java.util.Scanner;

public class RootOfQuadric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, and c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            if (root1 > 0 && root2 > 0) {
                double smallestRoot = Math.min(root1, root2);
                System.out.println("The smallest positive root is: " + smallestRoot);
            } else if (root1 > 0) {
                System.out.println("The smallest positive root is: " + root1);
            } else if (root2 > 0) {
                System.out.println("The smallest positive root is: " + root2);
            } else {
                System.out.println("No positive roots.");
            }
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            if (root > 0) {
                System.out.println("The smallest positive root is: " + root);
            } else {
                System.out.println("No positive roots.");
            }
        } else {
            System.out.println("No real roots.");
        }
        scanner.close();
    }
}

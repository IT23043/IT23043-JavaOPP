import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Range: ");
        int a=input.nextInt();
        for (int i = 1; i <= 100; i++) {
            System.out.println(Random.rA(a));
        }
    }
}
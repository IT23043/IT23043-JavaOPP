import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ComputeArea ca = new ComputeArea();

        Scanner input = new Scanner(System.in);

        Double radius = input.nextDouble();

        ca.setRadius(radius);

        System.out.println("The area of circle with radius "+ca.getRadius()+" is: "+ca.computeArea());
    }
}
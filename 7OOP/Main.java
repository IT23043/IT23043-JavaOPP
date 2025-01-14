import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Power pw=new Power();
        pw.setValue(2,3);
        pw.process();
        System.out.println("2^3 = "+pw.getResult());


        Add_Subtract as=new Add_Subtract();
        System.out.println("357 + 753 = "+as.add(357,753));
        System.out.println("1113.1719 + 9171.3111 = "+as.add(1113.1719,9171.3111));

        System.out.println("357 + 753 = "+as.subtract(357,753));
        System.out.println("1113.1719 + 9171.3111 = "+as.subtract(1113.1719,9171.3111));

        Multiply_Division md=new Multiply_Division();
        System.out.println("357 + 753 = "+md.multiply(357,753));
        System.out.println("1113.1719 + 9171.3111 = "+md.multiply(1113.1719,9171.3111));

        System.out.println("357 + 753 = "+md.divide(357,753));
        System.out.println("1113.1719 + 9171.3111 = "+as.subtract(1113.1719,9171.3111));

        System.out.println("357 + 753 = "+md.add(357,753));
        System.out.println("357 + 753 = "+md.subtract(1113.1719,9171.3111));

    }
}
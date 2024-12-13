import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CustomPrint s= new CustomPrint();

        SumClass sc=new SumClass();
        String sumresult=String.valueOf(sc.sum());
        s.out("Sum: "+sumresult);

        DivisorMultiple dm=new DivisorMultiple();
        String gcd=String.valueOf(dm.gcd(12,44));
        s.out("GCD: "+gcd);
        String lcm=String.valueOf(dm.lcm(12,44));
        s.out("LCM: "+lcm);
    }
}
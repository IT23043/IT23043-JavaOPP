public class DivisorMultiple {
    public int gcd(int a, int b) {
        int big, small, result = 1;

        if (a == 1) return a;
        if (b == 1) return b;
        if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }
        int i = 1;
        do {
            if (small % i == 0 && big % i == 0) {
                result = i;
            }
            i++;
        }while(i <= small);

        return result;
    }

    public int lcm(int a, int b) {
        int temp = gcd(a, b);
        return (a * b) / temp;
    }
}

public class Random {
    public static int rA(int a) {
        long start = System.nanoTime();
        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j <= 100000; j++) {
            }
        }

        int t = 1;
        for (int i = 1; i <= 300000; i++) {
            for (int j = 1; j <= 3000; j++) {
                t = t * i;
            }
        }

        int sum = 0;
        for (int i = 1; i <= 400000; i++) {
            for (int j = 1; j <= 4000; j++) {
                sum = sum + i;
            }
        }
        long end = System.nanoTime();
        int x = (int) (end + start);

        //System.out.println(x);
        return Math.abs((x) % a);
    }
}

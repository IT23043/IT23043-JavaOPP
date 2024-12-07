public class FactorionChecker {
    private int fact(int a) {
        if (a == 0) return 1;
        if (a == 1 || a == 2) return a;
        else {
            int result = 1;
            for (int i = 1; i <= a; i++) {
                result = result * i;
            }
            return result;
        }
    }
    public boolean checkFact(int a){
        int sum=0;
        int temp=a;
        if(a>0){
            while(a>0){
                int digit=a%10;
                sum=sum+fact(digit);
                a=a/10;
            }
        }else if(a==0) sum=sum+1;

        if(sum==temp){
            return true;
        }else{
            return false;
        }
    }
}

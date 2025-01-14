public class Power {
    private int base;
    private int power;
    private int result=1;
    public void setValue(int a,int b){
        base=a;
        power=b;
    }
    public void process(){
        for(int i=1;i<=power;i++){
            result=result*base;
        }
    }
    public int getResult(){
        return result;
    }
}

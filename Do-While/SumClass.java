public class SumClass {
    public double sum(){
        double result=0;
        double i=1;
        do{
         result =result +i;
         i=i-.1;
        }while(i>0);
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
	    // 220-284
        int number1=220;
        int number2=264;
        int sum1=0, sum2=0;

        for(int i=1; i<number1; i++){
            if(number1 % i == 0){
                sum1=sum1 + i;
            }
        }
        for(int i=1; i<number2; i++){
            if(number2 % i == 0){
                sum2=sum2 + i;
            }
        }
        if(sum2==number1 && sum1==number2){
            System.out.println("Bu iki sayi arkadas sayıdır.");
        }else{
            System.out.println("Bu iki sayi arkadas sayı degildir.");
        }
    }
}

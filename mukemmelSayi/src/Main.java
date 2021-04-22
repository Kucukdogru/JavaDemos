public class Main {

    public static void main(String[] args) {
	    // 6 mükemmel sayıdır 1,2,3
        // 28 --> 1,2,4,7,14
        int number = 28, sum=0;
        for (int i=1; i<number; i++){
            if(number % i ==0){
                sum=sum+i;
            }
        }
        if(number==sum){
            System.out.println("Mükemmel sayidir");
        }else{
            System.out.println("Mükemmel sayi degildir.");
        }
    }
}

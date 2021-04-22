public class Main {

    public static void main(String[] args) {
	// write your code here
        //Find the largest of the 3 numbers given
        int number1=155, number2=25, number3=10;
        if(number1>number2){
            if (number1>number3){
                System.out.println("Most largest number is :" + number1);
            }else{
                System.out.println("Most largest number is :" + number3);
            }
        }else if(number2>number3){
            System.out.println("Most largest number is :" + number2);
        }else{
            System.out.println("Most largest number is :" + number3);
        }
        System.out.println("*****************second way");
        int enBuyuk=number1;

        if(enBuyuk<number2){
            enBuyuk=number2;
        }
        if(enBuyuk<number3){
            enBuyuk = number3;
        }

        System.out.println("Most largest number is :" + enBuyuk);
    }
}

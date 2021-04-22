public class Main {

    public static void main(String[] args) {

        String message="Today is very good";
        String new_message = message.substring(0,2);
        System.out.println(new_message);

        String city=getCity();
        System.out.println(city);

        int result=sum(4,5);
        System.out.println(result);

        int sum=sum2(2,5,5);
        System.out.println("Variable argumants :"+sum);

        int result2=sum3(2,5,5);
        System.out.println("Variable argumants :"+sum);

    }


    //Bir şeyi yap deriz void operasyonlarda
    public static void Add(){
        System.out.println("Merve");
    }

    public static void Delete(){

    }

    public static String getCity(){
        return "Konya";
    }

    public static int sum(){
        return 5;
        //return bitir demek
    }

    public static int sum(int number1, int number2)
    {
        return number1+number2;
    }

    //Variable argumants
    //fonksiyonda istenilen adette sayı göndermek icin kullanılır
    //buraya gönderdigimiz sayilar bir integer arrayi gibi calisir
    public static int sum2(int... numbers){

        int toplam=0;
        for(int i=0; i< numbers.length; i++){
            toplam+=numbers[i];
        }
        return toplam;
    }

    public static int sum3(int... numbers){
        int toplam=0;
        for(int  number:numbers){
            toplam+=number;
        }
        return toplam;
    }
}

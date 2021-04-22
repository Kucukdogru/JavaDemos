public class Main {

    public static void main(String[] args) {
	// write your code here
        //java tip guvenli
        int number = 12;
        //int veri tipine number ataması yapamam
        //number = "Ankara";
        //number = 13111111111;  // sınır asildi 2 milyar baska veri tipi kullanmamız grekir
        //bellekte tuttugu alana gore sayının sınırları mevcut
        //bellekte 4 byte yer kaplar
        byte number1 = 127;   //-128to127
        //tam sayısal ifadeler int kabul edilir
        //int number2 = 12.5;

        //default olarak ondalıklı sayıların veri tipi double kabul edilir
        double number2 = 12.5;

        //float 4 byte

        //tc no long olarak tutulur

        // char 2 byte lık yer kaplar. karakterleri tek tırnak ile yazarız sadece tek karakter
        char character = 'b';
        // asCII
        String city = "Ankara"; //karakter dizisi

        // boolean 1 byte true or false

        boolean isTrue = false;

        if(isTrue == true){

        }
    }
}

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Stringler bir karakter dizisidir. char array
        String message = "The weather is good today.";

        System.out.println(message);

        System.out.println("Number of elements :" + message.length());
        System.out.println("To lower of elements :" + message.toLowerCase());
        System.out.println("Fifth element is :" + message.charAt(5));
        String msg = message.concat(" excellent!!!");
        System.out.println("String combine :" + msg);
        System.out.println("First value is T:" + message.startsWith("T")); // T ile baslarsa true doner degilse false
        System.out.println("End value is !:" + message.startsWith("!")); // T ile baslarsa true doner degilse false

        //getChars karakterleri al
        char[] characters = new char[10];
        message.getChars(0, 10, characters, 0);
        System.out.println(characters);

        // a karakterini ilk buldugu yerde indexini verir biter
        System.out.println(message.indexOf("a"));

        //aramaya sagdan baslar
        System.out.println(message.lastIndexOf("a"));

        //bize yeni bir metin verir.
        String newMessage =message.replace(" ", "*");
        System.out.println(newMessage);

        //substring metin içerisinden nparca alır 15 e kadar  dahil degil sıklıkla kullanılır
        System.out.println(message.substring(2,15));

        //split parcalama yapar
        for (String  word: message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());  // veritabanlarına arama ifadesi gönderdigimizde kullanırız


        // trım ile bastaki ve sondaki boslukları silebiliriz.
        String messsage2 = "          The weather is good today.     ";
        System.out.println("Trim : " + messsage2.trim());
    }
}

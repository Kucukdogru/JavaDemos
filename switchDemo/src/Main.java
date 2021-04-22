public class Main {
//ctrl + shift + alt + l
    public static void main(String[] args) {
        // write your code here
        // ıf bloklarına gore cok az kullanılır
        // switch blokları ile dallandırma yapılır
        //grade = not demek
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!!");
                break;
            case 'B':
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Medium");
                break;
            case 'F':
                System.out.println("Sorry(:");
                break;
            default:
                System.out.println("Gecersiz not girdiniz!!");
        }
    }
}

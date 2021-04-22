public class Main {

    public static void main(String[] args) {
        char harf = 'I';

	   /* if(harf == 'A' || harf == 'I' || harf == 'O' || harf == 'U'){
	        System.out.println("Kalın");
        }else{
            System.out.println("ince");
        }*/

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }
    }
}

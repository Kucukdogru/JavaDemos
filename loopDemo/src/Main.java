public class Main {

    public static void main(String[] args) {

        //For
        //int i=1; sayac tanımlama for en cok tercih edilen
        for (int i=1; i<10; i++){
            System.out.println(i);
        }
        System.out.println("Döngü bitti");
        for (int i=1; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti");

        //while
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("Döngü bitti" + i);
        int j=2;
        while(j<=10){
            System.out.println(j);
            j+=2;
        }
        System.out.println("While Döngüsü bitti" + j);
        //infinity loop sonsuz döngü

        //DO WHİLE LOOP
        int k=2;
        do{
            System.out.println(k);
            k+=2;
        }while(k<=10);
        System.out.println("Do While Döngüsü bitti" + j);

        // do-whilde da sart uymasa bile program bir kez calisir ********************
        // dongu calismasa bile veritabanına log atmak istersek do-while calisir

        int t=100;
        do{
            System.out.println("loglandı");
            System.out.println(k);
            k+=2;
        }while(k<=10);
        System.out.println("Do While Döngüsü bitti " + t);
    }
}

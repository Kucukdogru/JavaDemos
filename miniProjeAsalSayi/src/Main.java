public class Main {

    public static void main(String[] args) {
        /*int sayi = 15;
        int i = 1, counter = 0;
        if (sayi % i ==0) {
            counter=counter+1;
            i++;
            if(sayi==i){
                if(counter==2){
                    System.out.println("Asal sayıdır.");
                }else{
                    System.out.println("Asal sayı degildir.");
                }
            }

        }*/

        int number=-1;
        int remainder = number % 2;
        System.out.println(remainder);
        // bug: uygulamadaki mantıksal hatalar
        //ilk etapta sayımızı asal kabul ediyorum
        boolean isPrime = true;

        if(number==1){  //defensing programming korumacı
            System.out.println("Sayı asal degildir");
            return; // diğer bloklara girmemesi için sonlandırıyoruz
        }

        if(number<1){
            System.out.println("Geçersiz sayı");
        }

        for (int i=2; i<number; i++){
            if(number%i==0){
                isPrime= false;
            }
        }

        if(isPrime){
            System.out.println("Sayı Asaldır.");
        }else{
            System.out.println("Sayı asal degildir");
        }
    }
}

/*
A0.basla
A1.i=1, counter=0,
A2.sayi gir
A3.eger (sayi%i==0) (h) a5.git
A4.counter=counter+1;
A5.i++
A6. if(sayi==i) (h) a5.git
A7. if(counter==2) (h) a9.git
A8. "sayi asaldir"
A9. "sayi asal degildir"
A10. bitir*/

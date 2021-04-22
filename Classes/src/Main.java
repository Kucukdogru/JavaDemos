public class Main {

    public static void main(String[] args) {
	// write your code here
        //CustomerManager bir türdür
        // O türde bir kullanım yapacagim
        //Kullanmak icin new lemek lazım
        //bir nesne üretiyoruz
        //Class lar referans tiptir
        CustomerManager customerManager=new CustomerManager();
        customerManager.Add();


        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);


    //diziler referans tiptir
        int[] numbers=new int[]{1,2,3};
        int[] numbers2=new int[]{4,5,6};
        numbers2=numbers;
        numbers[0]=10;
        System.out.println(numbers2[0]);

    }
}



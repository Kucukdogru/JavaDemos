public class Main {

    public static void main(String[] args) {
        double[] myList = new double[4];
        double[] myList2 = {1.5, 9.6, 3.9, 4.7, 5.2};

        for (double number : myList2) {
            System.out.println(number);
        }
        System.out.println("**************");
        // Dizideki elemanların toplamını  bulma
        double sum = 0;
        for (double number : myList2) {
            sum = sum + number;
        }
        System.out.println("Array numbers sum is " + sum);

        //Dizideki elemanlardan en büyügünü bulma
        double max = myList[0];
        for (double number : myList2) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println("Max numbers is " + max);

    }
}

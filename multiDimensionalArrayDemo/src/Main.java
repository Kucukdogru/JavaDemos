public class Main {

    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "İstanbul";
        cities[0][1] = "Edirne";
        cities[0][2] = "Tekirdağ";
        cities[1][0] = "Konya";
        cities[1][1] = "Ankara";
        cities[1][2] = "Eskişehir";
        cities[2][0] = "Gaziantep";
        cities[2][1] = "Şanlıurfa";
        cities[2][2] = "Kahramanmaraş";

        for (int i = 0; i <= 2; i++) {
            System.out.println("***********************");
            //içteki for 3 defa çalısacak i=0 iken
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }
}

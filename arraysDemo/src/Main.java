public class Main {

    public static void main(String[] args) {
        String student1 = "Merve";
        String student2 = "Ayşe";
        String student3 = "Fatma";
        String student4 = "Mustafa";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("*************************");

        String[] students=new String[3];
        students[0]="Merve";
        students[1]="Derin";
        students[2]="Engin";
        //students[3]="Fatma";
        for (int i=0; i< students.length; i++){
            System.out.println(students[i]);
        }

        System.out.println("*************************");

        //Reverse enginering tersine mühendislik kodu okunabiilir yazma
        for (String student:students){
            System.out.println(student);
        }



    }
}

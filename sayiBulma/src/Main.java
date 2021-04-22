public class Main {

    public static void main(String[] args) {

        int[] numbers=new int[]{1,2,5,7,9,0};
        int aranacak = 15;
        boolean varMı = false;

        for (int i=0; i< numbers.length; i++){
            if (numbers[i]==aranacak){
                varMı=true;
            }
        }
        if (varMı==true){
            System.out.println("Var");
        }else{
            System.out.println("Yok");
        }
        System.out.println("**********************");
        for(int number:numbers){
            if (number==aranacak){
                varMı=true;
                break;
            }
        }
        if (varMı){
            System.out.println("Var");
        }else{
            System.out.println("Yok");
        }
    }
}

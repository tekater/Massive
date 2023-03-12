import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите длинну массива\n");
        int a = 5; // scanner.nextInt();
        //System.out.println("Введите числа массива\n");
        int[] b = {5,8,11,2,10}; //scanner.nextInt();
        //System.out.println("Введите число сравнения\n");
        int c = 8; //scanner.nextInt();
        int j = 0;
        for(int i = 0; i < b.length;i++){
            if(c < b[i]){
                j = j + b[i];
            }
            //System.out.println(b[i]);
        }
        System.out.println("\nВычислил: " + j);
    }
}

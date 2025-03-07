package lr9;
import java.util.Scanner;

public class Task2 {
    private static void binary(int x){
        if(x > 1){
            binary(x/2);
        }
        System.out.print(x % 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int num = in.nextInt();

        if(num < 0){
            System.out.println("Неверное число");
        }else {
            System.out.println("Двоичное представление: ");
            if (num == 0){
                System.out.println("0");
            }else {
                binary(num);
            }
        }
    }
}

package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = in.nextLine();

        System.out.println("Введите возраст");
        int age = Year.now().getValue() - in.nextInt();

        System.out.println("Вас зовут " + name + " вам " + age + " лет");


    }
}

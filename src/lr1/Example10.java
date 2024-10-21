package lr1;

import java.time.Year;
import java.util.Scanner;
public class Example10 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Укажите свой год рождения");
        int age = Year.now().getValue() - in.nextInt();

        System.out.println("Вам " + age + " лет");
    }

}

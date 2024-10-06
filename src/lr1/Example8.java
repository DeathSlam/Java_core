package lr1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели");
        String day = in.nextLine();

        System.out.println("Введите название месяца");
        String month = in.nextLine();

        System.out.println("Введите число");
        int numDay = in.nextInt();

        System.out.printf("Ваша дата: %s %s %d", day, month, numDay);
    }

}

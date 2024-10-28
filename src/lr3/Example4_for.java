package lr3;

import java.util.Scanner;

public class Example4_for {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите меньшее число");
        int min = in.nextInt();
        System.out.println("Введите большее число");
        int max = in.nextInt();
        if(min > max)
        {
            System.out.println("Числа введены не в верном порядке, значения будут перемешаны");
            min = min ^ max ^ (max = min);
        }

        for(;min<=max;min++)
        {
            System.out.println(min);
        }
    }

}

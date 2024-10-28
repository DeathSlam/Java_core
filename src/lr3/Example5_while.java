package lr3;

import java.util.Scanner;

public class Example5_while {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество суммируемых чисел");
        int num = in.nextInt();
        int sum = 0, count = 0;
        int currentNum = 1;
        while (count < num)
        {
            if (currentNum % 5 == 2 || currentNum % 3 == 1)
            {
                sum += currentNum;
                count++;
            }
            currentNum++;
        }

        System.out.println("Сумма чисел равна: " + sum);
    }

}

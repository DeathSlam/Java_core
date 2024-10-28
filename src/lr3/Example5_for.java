package lr3;

import java.util.Scanner;

public class Example5_for {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество суммируемых чисел");
        int num = in.nextInt();
        int sum = 0, count = 0;
        for (int currentNum = 1; count < num; currentNum++)
        {
            if (currentNum % 5 == 2 || currentNum % 3 == 1)
            {
                sum += currentNum;
                count++;
            }
        }

        System.out.println("Сумма чисел равна: " + sum);
    }

}

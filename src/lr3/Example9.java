package lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество ячеек массива");
        int num = in.nextInt();

        int[] array = new int[num];
        Random random = new Random();

        for (int i = 0; i < num; i++)
        {
            array[i] = random.nextInt(100);
        }

        Arrays.sort(array);
        for(int i = num - 1; i >= 0; i--)
        {
            System.out.println(array[i]);
        }
    }

}

package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество ячеек массива");
        int num = in.nextInt();

        int[] array = new int[num];
        Random random = new Random();

        for (int i = 0; i < num; i++)
        {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
        int temp = array[0];
        for(int i = 0; i< num; i++)
        {
            if (temp > array[i]) {
                temp = array[i];
            }
        }
        for (int i=0; i< num; i++)
        {
            if (temp == array[i]) System.out.println(temp + " " + i);
        }
    }
}

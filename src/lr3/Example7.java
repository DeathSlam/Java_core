package lr3;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Example7 {
    public static void main(String[] args)
    {
        int num = 10;
        char[] array = new char[num];

        for (int i = 0; i < num; i++)
        {
            array[i] = (char) ('a' + i * 2);
        }

        for(int i = 0; i < num; i++)
        {
            System.out.println(array[i] + " ");
        }
        System.out.println();

        for(int i = num - 1; i >= 0; i--)
        {
            System.out.println(array[i] + " ");
        }
    }
}

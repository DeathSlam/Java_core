package lr3;

import java.util.Scanner;

public class Example3_dowhile {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи номер числа Фибоначчи");
        int num = in.nextInt();
        int[] f = new int[num+1];
        f[0] = 0;
        f[1] = 1;
        int i = 2;

        do
        {
            if (num > 0)
            {
                f[i] = f[i -1] + f[i-2];
                i++;
            }
        }while (i <= num);

        i = 1;
        do{
            if (num > 0 )
            {
                System.out.println(f[i]+" ");
                i++;
            }
        }while(i <= num);
    }
}

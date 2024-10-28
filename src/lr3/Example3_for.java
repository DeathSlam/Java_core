package lr3;

import java.util.Scanner;

public class Example3_for {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи номер числа Фибоначчи");
        int num = in.nextInt();
        int[] f = new int[num+1];
        f[0] = 0;
        f[1] = 1;

        for(int i = 2;i <= num; ++i)
        {
            f[i] = f[i -1] + f[i-2];
        }
        for (int i = 1; i <= num; ++i){
            System.out.println(f[i]+" ");
        }
    }
}

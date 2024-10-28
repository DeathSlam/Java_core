package lr3;

import java.util.Scanner;

public class Example3_while {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int[] f = new int[num+1];
        f[0] = 0;
        f[1] = 1;
        int i = 2;
        while (i <= num)
        {
            f[i] = f[i -1] + f[i-2];
            i++;
        }
        i = 1;
        while (i<=num)
        {
            System.out.println(f[i]+" ");
            i++;
        }
    }
}


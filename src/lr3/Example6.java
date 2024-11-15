package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во ячеек массива");
        int arrayNum = in.nextInt();
        if (arrayNum < 0) {System.out.println("Введено не верное количество ячеек массива"); System.exit(0);}
        int[] array = new int[arrayNum];
        int foundNum = 0, currentNum = 1; int i = 0;

        while (foundNum < arrayNum)
        {
            if(currentNum % 5 == 2)
            {
                array[i] = currentNum;
                foundNum++;
                i++;
            }
            currentNum++;
        }

        for(i = 0;i < arrayNum; i++ )
        {
            System.out.println(array[i]);
        }
    }
}

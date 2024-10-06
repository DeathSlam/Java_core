package lr1;

import java.util.Scanner;

public class Example14 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int num = in.nextInt();

        int minusNum = num - 1;
        int plusNum = num + 1;
        int quadNum = (int) Math.pow(plusNum + num + minusNum, 2);

        System.out.println(minusNum + " " + num + " " + plusNum + " " + quadNum);

    }

}

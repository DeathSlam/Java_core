package timus.task_1000;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 1 число");
        int num1 = in.nextInt();

        System.out.println("Введите 2 число");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }
}

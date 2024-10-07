package timus.task_1293;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество панелей");
        int amountPlates = in.nextInt();

        System.out.println("Введите ширину панелей");
        int widthPlate = in.nextInt();

        System.out.println("Введите длину панелей");
        int lenghtPlate = in.nextInt();

        int nanoSylf = amountPlates * (widthPlate * lenghtPlate) * 2;

        System.out.println("Требуется " + nanoSylf + " нанограмм сульфида");
    }

}

package lr9;

import java.util.Scanner;

public class Task3 {


    public static void arrayIn (int[] arr, int index, Scanner scanner){
        if (index == arr.length){
            return;
        }
        System.out.printf("Элемент %d: ", index);
        arr[index] = scanner.nextInt();
        arrayIn(arr, index + 1, scanner);
    }

    public static void arrayOut (int[] arr, int index){
        if (index == arr.length){
            return;

        }else{
            System.out.print(arr[index]);
            arrayOut(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        arrayIn(arr, 0, scanner);
        arrayOut(arr, 0);
    }
}

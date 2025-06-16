package lr13;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        try {
            System.out.print("Введите количество элементов: ");
            int n = Integer.parseInt(scanner.nextLine());

            array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Введите элемент " + (i + 1) + ": ");
                array[i] = Integer.parseInt(scanner.nextLine());
            }

            int sum = 0;
            int count = 0;
            for (int num : array) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Положительные элементы отсутствуют.");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение положительных элементов: " + average);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введена строка вместо числа.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e.getMessage());
        } finally {
            System.out.println("Завершение выполнения программы.");
        }
    }
}

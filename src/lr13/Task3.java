package lr13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Byte> byteList = new ArrayList<>();

        try {
            System.out.print("Введите количество элементов: ");
            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                System.out.print("Введите byte элемент " + (i + 1) + ": ");
                int value = Integer.parseInt(scanner.nextLine());

                if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
                    throw new ArithmeticException("Значение за пределами диапазона byte: " + value);
                }

                byteList.add((byte) value);
            }

            int sum = 0;
            for (byte b : byteList) {
                sum += b;
            }

            System.out.println("Сумма всех элементов: " + sum);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введена строка вместо числа.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e.getMessage());
        } finally {
            System.out.println("Завершение выполнения программы.");
        }
    }
}

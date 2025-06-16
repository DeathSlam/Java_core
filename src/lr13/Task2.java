package lr13;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        try {
            System.out.print("Введите номер столбца от 0 до 2: ");
            int col = Integer.parseInt(scanner.nextLine());

            if (col < 0 || col >= matrix[0].length) {
                throw new IndexOutOfBoundsException("Столбца с таким номером не существует.");
            }

            System.out.println("Столбец № " + col + ":");
            for (int[] row : matrix) {
                System.out.println(row[col]);
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введена строка вместо числа.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e.getMessage());
        } finally {
            System.out.println("Завершение выполнения программы");
        }
    }
}

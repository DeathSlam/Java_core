package lr10.Excel;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.*;
import java.util.Scanner;

public class ReadExcelFile_EXT {
    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            try {
                System.out.print("Введите путь к файлу (например, src/lr10/Excel/ExcelFile.xlsx): ");
                String filePath = scanner.nextLine().trim();

                System.out.print("Введите имя листа: ");
                String sheetName = scanner.nextLine().trim();

                readExcelFile(filePath, sheetName);
                return; // Успешное завершение

            } catch (FileNotFoundException e) {
                System.err.println("Ошибка: Файл не найден. Проверьте путь и наличие файла.");
                System.err.println("Рекомендация: Убедитесь в правильности расширения (.xlsx)");
            } catch (InvalidFormatException e) {
                System.err.println("Ошибка: Некорректный формат файла.");
                System.err.println("Рекомендация: Используйте файлы Excel 2007+ (.xlsx)");
            } catch (IllegalArgumentException e) {
                System.err.println("Ошибка: Лист с указанным именем не существует.");
                System.err.println("Рекомендация: Проверьте регистр и название листа");
            } catch (IOException e) {
                System.err.println("Ошибка ввода-вывода: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Неизвестная ошибка: " + e.getMessage());
            }

            attempts++;
            if (attempts < MAX_ATTEMPTS) {
                System.out.println("\nПопробуйте снова (осталось попыток: " + (MAX_ATTEMPTS - attempts) + ")");
            }
        }
        System.err.println("Программа завершена после 3 неудачных попыток");
    }

    private static void readExcelFile(String filePath, String sheetName)
            throws IOException, InvalidFormatException {

        // Проверка существования файла
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("Файл не существует: " + filePath);
        }

        try (InputStream inputStream = new FileInputStream(file);
             Workbook workbook = WorkbookFactory.create(inputStream)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Лист '" + sheetName + "' не найден");
            }

            System.out.println("\nСодержимое листа '" + sheetName + "':");
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(getCellValue(cell) + "\t");
                }
                System.out.println();
            }
        }
    }

    private static String getCellValue(Cell cell) {
        return switch (cell.getCellType()) {
            case STRING -> cell.getStringCellValue();
            case NUMERIC -> String.valueOf(cell.getNumericCellValue());
            case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());
            default -> "[Неизвестный тип данных]";
        };
    }
}
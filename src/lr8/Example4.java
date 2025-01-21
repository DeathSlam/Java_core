package lr8;

import java.io.*;
import java.util.Scanner;
import java.util.Locale;


public class Example4 {
    public static void main(String[] args) {
        try {
            // Создаем папку, если ее нет
            File folder = new File("C:\\Files");
            if (!folder.exists()) {
                folder.mkdirs();
            }

            // Создаем первый файл
            File f1 = new File("C:\\Files\\numIsh.txt");
            f1.createNewFile();
//            Scanner sc = new Scanner(System.in);
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            // Записываем числа в первый файл
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();
            System.out.println("Введите числа:");
            for (int i = 0; i < count; i++) {
                wr.writeFloat(sc.nextFloat());
            }
            wr.flush();
            wr.close();

            // Создаем второй файл
            File f2 = new File("C:\\Files\\numRez.txt");
            f2.createNewFile();

            // Читаем из первого файла и записываем во второй
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println("Число " + number);
                }
            } catch (EOFException e) {
                System.out.println("Конец файла достигнут.");
            }

            wr.flush();
            wr.close();
            rd.close();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }
}

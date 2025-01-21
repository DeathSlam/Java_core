package lr8;

import javax.sound.sampled.Line;
import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/lr8/Task2ReadFile.txt"), "UTF-8"));

            writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("src/lr8/Task2WriteFile.txt"), "UTF-8"));

            String line;
            int lineNum = 1;

            while ((line = reader.readLine()) != null) {

                if (lineNum == 2 ) {
                    writer.write(line);
                    writer.newLine();
                }
                if (lineNum > 2){
                    double num = Double.parseDouble(line);
                    if (num > 0){
                        writer.write(line);
                        writer.newLine();
                    }
                }
                lineNum++;
            }

            System.out.println("Файл прочитан и записан");

        } catch (IOException e) {
            System.err.println("Произошла ошибка при работе с файлами " + e.getMessage());
        } finally {
            try {
                // Закрываем потоки
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.err.println("Ошибка при закрытии файловых потоков: " + e.getMessage());
            }
        }
    }
}

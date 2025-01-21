package lr8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Task3 {
    private static final Pattern CONSONANT_START = Pattern.compile("^[бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ].*");
    public static void main(String[] args) {
        Path inputFilePath = Paths.get("src/lr8/Task3Read.txt");
        Path outputFilePath = Paths.get("src/lr8/Task3Write.txt");

        try {
            List<String> inputLines = Files.readAllLines(inputFilePath, StandardCharsets.UTF_8);
            List<String> outputLines = new ArrayList<>();

            for (int i = 0; i < inputLines.size(); i++) {
                String line = inputLines.get(i);
                String[] words = line.split("\\s+"); // Разделение на слова по пробелам
                List<String> consonantWords = new ArrayList<>();
                for (String word : words) {
                    if (CONSONANT_START.matcher(word).matches()) {
                        consonantWords.add(word);
                    }
                }
                if (!consonantWords.isEmpty()){
                    outputLines.add("Строка " + (i + 1) + ", Количество слов: " + consonantWords.size() + ": " + String.join(" ", consonantWords));

                }
            }

            Files.write(outputFilePath, outputLines, StandardCharsets.UTF_8);
            System.out.println("Обработка завершена.");

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}


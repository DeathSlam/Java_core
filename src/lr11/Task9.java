package lr11;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {

        String string = "Напишите функцию, Которая принимает на вход список 123 строк и возвращает Новый список, содержащий только те 542 строки, которые начинаются с большой 334 буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплита: ");
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = filterOnlyChar(strings);

        System.out.println("Строка после преобразования: " + "\n");
        for(String e : stringsAfter){
            System.out.println(e);
        }
    }

    public static List<String> filterOnlyChar(List<String> input) {
        List<String> result = new ArrayList<>();
        for (String s : input) {
            if (s.matches("[а-яА-Яa-zA-Z]+")) {
                result.add(s);
            }
        }
        return result;
    }
}

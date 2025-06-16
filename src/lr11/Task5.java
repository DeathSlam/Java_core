package lr11;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        String string = "Напишите функцию, Которая принимает на вход список строк и возвращает Новый список, содержащий только те строки, которые начинаются с большой буквы.";

        String subString = "Которая принимает на вход список строк";

        List<String> strings = List.of(string.split(" "));
        List<String> subStrings = List.of(subString.split(" "));
        System.out.println("\n" + "Строка после сплита: ");
        for (String e : strings){
            System.out.println(e);
        }

        System.out.println("\n" + "Подстрока после сплита: ");
        for (String e : subStrings){
            System.out.println(e);
        }

        List<String> stringsAfter = filterSubstring(strings, subStrings);

        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for(String e : stringsAfter){
            System.out.println(e);
        }
    }

    public static List<String> filterSubstring(List<String> inputStrings, List<String> substrings) {
        List<String> result = new ArrayList<>();
        for (String str : inputStrings) {
            for (String sub : substrings) {
                if (str.contains(sub)) {
                    result.add(str);
                    break; // Найдена подстрока — переходим к следующей строке
                }
            }
        }
        return result;
    }
}

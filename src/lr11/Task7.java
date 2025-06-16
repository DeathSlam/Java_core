package lr11;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {

        String string = "Напишите функцию, Которая принимает на вход список" + "строк и возвращает Новый список, содержащий только" + "те строки, которые начинаются с большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплита: ");
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = filterMinLength(strings, 4);

        System.out.println("Строка после преобразования: " + "\n");
        for(String e : stringsAfter){
            System.out.println(e);
        }
    }

    public static List<String> filterMinLength(List<String> input, int minLength) {
        List<String> result = new ArrayList<>();
        for (String s : input) {
            if (s.length() > minLength) {
                result.add(s);
            }
        }
        return result;
    }

}

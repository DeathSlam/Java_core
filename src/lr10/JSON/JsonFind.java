package lr10.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class JsonFind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите автора");
        String targetAuthor = in.nextLine();
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lr10/JSON/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            List<JSONObject> bookList = new ArrayList<>();
            for (Object item : jsonArray){
                bookList.add((JSONObject) item);
            }

            bookList.stream()
                    .filter(book -> targetAuthor.equalsIgnoreCase(
                            book.get("author") == null ? "" : book.get("author").toString()
                    ))
                    .forEach(book -> {
                        System.out.println("\nТекущий элемент: book");
                        System.out.println("Название книги: " + book.get("title"));
                        System.out.println("Автор: " + book.get("author"));
                        System.out.println("Год издания: " + book.get("year"));
                    });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

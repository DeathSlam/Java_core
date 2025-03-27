package lr10.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JsonAddBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название книги");
        String title = in.nextLine();
        System.out.println("Введите автора книги");
        String author = in.nextLine();
        System.out.println("Введите год издания книги");
        String year = in.nextLine();

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lr10/JSON/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");


            JSONObject newBook = new JSONObject();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);
            jsonArray.add(newBook);

            try (FileWriter file = new FileWriter("src/lr10/JSON/example-json.json")){
                file.write(jsonArray.toJSONString());
                System.out.println("JSON Создан");
            } catch (Exception e){
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
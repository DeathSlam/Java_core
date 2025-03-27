package lr10.JSON;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class JsonDelBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название книги для удаления");
        String title = in.nextLine();
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lr10/JSON/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            boolean remove = false;
            Iterator<JSONObject> iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (title.equals(book.get("title"))) {
                    iterator.remove();
                    remove = true;
                }
            }

            if (remove) {
                jsonObject.put("books", jsonArray);


                try (FileWriter file = new FileWriter("src/lr10/JSON/example-json.json")) {
                    file.write(jsonArray.toJSONString());
                    System.out.println("Книга из json удалена");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("Книга не найдена");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

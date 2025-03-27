package lr10.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class LinkParser {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        List<String> links= new ArrayList<>();
        try {
            Document doc = Jsoup.connect(url).get();

            Elements elements = doc.select("a[href]");
            for(Element link : elements){
                String absoluteUrl = link.attr("abs:href");
                System.out.println(absoluteUrl);
                links.add(absoluteUrl);
            }

            Files.write(Paths.get("src/lr10/HTML/Links.txt"),
                    links,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package lr10.XML;

import org.w3c.dom.*;
import javax.xml.stream.*;
import javax.xml.parsers.*;
import java.util.*;
import java.util.stream.*;
import java.io.File;



public class FindXML {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите автора");
        String targetAuthor = in.nextLine();
        System.out.println("Введите год издания");
        String targetYear = in.nextLine();


        try {
            File xmlFile = new File("src/lr10/XML/CreatedXML.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlFile);

            NodeList nodeList = doc.getElementsByTagName("book");

            List<Element> books = IntStream.range(0,nodeList.getLength()).
                    mapToObj(nodeList::item)
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(book -> {
                        String author = getElementText(book, "author");
                        String year = getElementText(book, "year");
                        return author.equalsIgnoreCase(targetAuthor) && year.equals(targetYear);
                    }).collect(Collectors.toList());

            System.out.println("Найдено книг: " + books.size());
            books.forEach(book -> {
                System.out.println("\nКнига:");
                System.out.println("  Название: " + getElementText(book, "title"));
                System.out.println("  Автор: " + getElementText(book, "author"));
                System.out.println("  Год: " + getElementText(book, "year"));
            });
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    private static String getElementText(Element parent, String tagName) {
        NodeList nodes = parent.getElementsByTagName(tagName);
        if (nodes.getLength() == 0) return "";
        return nodes.item(0).getTextContent().trim();
    }
}


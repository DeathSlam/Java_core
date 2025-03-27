package lr10.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import java.io.File;
import java.util.Scanner;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class AddBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название новой книги: ");
        String titleName = in.nextLine();
        System.out.println("Введите автора новой книги: ");
        String authorname = in.nextLine();
        System.out.println("Введите год выпуска новой книги: ");
        String bookyear = in.nextLine();

        try {
            File xmlFile = new File("src/lr10/XML/CreatedXML.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            Element library = doc.getDocumentElement();

            Element newBook = doc.createElement("book");

            Element titleElement = doc.createElement("title");
            titleElement.appendChild(doc.createTextNode(titleName));

            Element authorElement = doc.createElement("author");
            authorElement.appendChild(doc.createTextNode(authorname));

            Element yearElement = doc.createElement("year");
            yearElement.appendChild(doc.createTextNode(bookyear));

            newBook.appendChild(titleElement);
            newBook.appendChild(authorElement);
            newBook.appendChild(yearElement);

            library.appendChild(newBook);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(xmlFile);
            transformer.transform(source, result);

            System.out.println("Книга добавлена!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

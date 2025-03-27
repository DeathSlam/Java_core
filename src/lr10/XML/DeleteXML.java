package lr10.XML;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.File;
import java.util.*;
import java.util.stream.*;

public class DeleteXML {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название книги для удаления:");
        String targetTitle = in.nextLine();

        try {
            File xmlFile = new File("src/lr10/XML/CreatedXML.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            Element library = doc.getDocumentElement();


            // 3. Получение всех книг
            NodeList books = doc.getElementsByTagName("book");

            // 4. Поиск книг для удаления
            List<Element> toRemove = IntStream.range(0, books.getLength())
                    .mapToObj(books::item)
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(book ->
                            getElementText(book, "title").equalsIgnoreCase(targetTitle))
                    .collect(Collectors.toList());

            toRemove.forEach(book -> {
                Node parent = book.getParentNode();
                parent.removeChild(book);
            });

            Transformer transformer = TransformerFactory.newInstance()
                    .newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            transformer.transform(
                    new DOMSource(doc),
                    new StreamResult(xmlFile)
            );

            System.out.println("Удалено книг: " + toRemove.size());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getElementText(Element parent, String tagName) {
        NodeList nodes = parent.getElementsByTagName(tagName);
        if (nodes.getLength() == 0) return "";
        return nodes.item(0).getTextContent().trim();
    }
}

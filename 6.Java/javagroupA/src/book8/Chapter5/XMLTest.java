package book8.Chapter5;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.text.NumberFormat;


public class XMLTest {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        Document doc = getDocument("C:\\Users\\Bianca\\Documents\\Bootcamp\\6.JavaBeginner\\javagroupA\\src\\book8\\Chapter5\\movies.xml");
        System.out.println("DOM CREATED!");
//        int count = 0;
//        Element root = doc.getDocumentElement();
//        Node movie = root.getFirstChild();
//        while (movie != null)
//        {
//            count++;
//            movie = movie.getNextSibling();
//        }
//        System.out.println("There are " + count + " movies.");


//        Element root = doc.getDocumentElement();
//        NodeList movies = root.getChildNodes();
//        for (int i = 0; i < movies.getLength(); i++)
//        {
//            Node movie = movies.item(i);
//            System.out.println(movie.getNodeName());
//        }
//        for (int i = 0; i < movies.getLength(); i++) {
//            Node movie = movies.item(i);
//            System.out.println(movie.getFirstChild().getFirstChild().getTextContent());
//            System.out.println(movie.getAttributes().getNamedItem("year").getTextContent());
//            System.out.println(movie.getFirstChild().getNextSibling().getTextContent());
//        }
//        Element root = doc.getDocumentElement();
//        Node movie =  root.getFirstChild();
//        int oldest = 9999;
//        while (movie != null)
//        {
//            String s = movie.getAttributes().getNamedItem("year").getTextContent();
//            int year = Integer.parseInt(s);
//            if (year < oldest)
//                oldest = year;
//            movie = movie.getNextSibling();
//        }
//        System.out.println("The oldest movie in the file "
//                + "is from " + oldest + ".");
//    }

//        NodeList movies = root.getChildNodes();
//        for (int i = 0; i < movies.getLength(); i++) {
//            Element movie = (Element) movies.item(i);
//            Node title = movie.getFirstChild();
//            System.out.println(getTextValue(title));
//            System.out.println(movie.getAttribute("year"));
//            Node price = movie.getFirstChild().getNextSibling();
//            double dprice = Double.parseDouble(getTextValue(price));
//            System.out.println(cf.format(dprice));
//        }
    }


    private static String getTextValue(Node n)
    {
        return n.getFirstChild().getNodeValue();
    }


        private static Document getDocument (String name){
            try {
                DocumentBuilderFactory factory =
                        DocumentBuilderFactory.newInstance();
                factory.setIgnoringComments(true);
                factory.setIgnoringElementContentWhitespace(true);
                factory.setValidating(true);
                DocumentBuilder builder =
                        factory.newDocumentBuilder();
                return builder.parse(new InputSource(name));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return null;
        }
    }

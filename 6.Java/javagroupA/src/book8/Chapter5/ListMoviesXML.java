package book8.Chapter5;


import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.parsers.*;
import java.text.NumberFormat;

public class ListMoviesXML {
    private static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        Document doc = getDocument("C:\\Users\\Bianca\\Documents\\Bootcamp\\6.JavaBeginner\\javagroupA\\src\\book8\\Chapter5\\movies.xml");
        Element root = doc.getDocumentElement();
        Element movieElement = (Element)root.getFirstChild();

        Movie m;
        while (movieElement != null) {
            m = getMovie(movieElement);
            String msg = Integer.toString(m.year);
            msg += ": " + m.title;
            msg += "(" + cf.format(m.price) + ")";
            System.out.println(msg);
            movieElement = (Element)movieElement.getNextSibling();
        }
    }

    private static Document getDocument(String s) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            factory.setValidating(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(new InputSource(s));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static Movie getMovie(Element e) {
        String yearString = e.getAttribute("year");
        int year = Integer.parseInt(yearString);
        Element tElement = (Element)e.getFirstChild();
        String title = getTextValue(tElement).trim();
        Element pElement = (Element)tElement.getNextSibling();
        String pString = getTextValue(pElement).trim();
        double price = Double.parseDouble(pString);
        return new Movie(title, year, price);
    }

    private static String getTextValue(Node n) {
        return n.getFirstChild().getNodeValue();
    }

    private static class Movie {
        public String title;
        public int year;
        public double price;
        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}


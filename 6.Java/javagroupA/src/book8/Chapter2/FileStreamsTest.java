package book8.Chapter2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

public class FileStreamsTest {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();

        BufferedReader in = getReader("C:\\Users\\Bianca\\Documents\\Bootcamp\\6.JavaBeginner\\javagroupA\\src\\book8\\chapter2\\movies.txt");
        Movie movie = readMovie(in);
        while (movie != null) {
            String msg = Integer.toString(movie.year);
            msg += " : " + movie.title;
            msg += "(" + cf.format(movie.price) + ")";
            System.out.println(msg);
            movie = readMovie(in);
        }



    }


    public static BufferedReader getReader(String name) {
        BufferedReader in = null;
        try {
            File file = new File(name);
            in = new BufferedReader(new FileReader(file));

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return in;
    }
    public static Movie readMovie(BufferedReader in) {
        String title;
        int year;
        double price;
        String line = "";
        String[] data;
        try{
            line = in.readLine();
        }catch (IOException e) {
            System.out.println("I/O Exception " + e);
            System.exit(0);
        }
        if (line == null) {
            return null;
        }else {
            data = line.split("#");
            title = data[0];
            year = Integer.parseInt(data[1]);
            price = Double.parseDouble((data[2]));
            return new Movie(title,year,price);
        }

    }

    public static class Movie {
        String title;
        int year;
        double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }

}
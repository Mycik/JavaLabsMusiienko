import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Comparator;

class Book {
    String title;
    String authorSurname;
    String authorName;
    String authorPatronymic;
    String publisher;
    int year;
    float price;

    public Book(String title, String authorSurname, String authorName, String authorPatronymic, String publisher, int year, float price) {
        this.title = title;
        this.authorSurname = authorSurname;
        this.authorName = authorName;
        this.authorPatronymic = authorPatronymic;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " by " + authorSurname + " " + authorName + " " + authorPatronymic + ", " + publisher + ", " + year + ", $" + price;
    }
}

public class Seventeen {
    public static void main(String[] args) {
        HashMap<Integer, Book> catalog = new HashMap<>();
        catalog.put(1001, new Book("Java Programming", "Ivanov", "Ivan", "Ivanovich", "PublisherA", 2020, 29.99f));
        catalog.put(1002, new Book("Data Structures", "Petrov", "Petr", "Petrovich", "PublisherB", 2019, 19.99f));
        catalog.put(1003, new Book("Data Programming","Dmitrov", "Dmitro", "Dmitrievich",  "PublisherC", 2021, 39.99f));
        catalog.put(1004, new Book("Java Structures","Nikitov", "Nikita", "Nikitovich", "PublisherD", 2022, 9.99f));
        catalog.put(1005, new Book("Java Data Programming", "Androv", "Andrii", "Andrievich",  "PublisherF", 2023, 5.99f));

        System.out.println("Сортування по автору");
        ArrayList<Book> sortedByAuthor = new ArrayList<>(catalog.values());
        Collections.sort(sortedByAuthor, Comparator.comparing(b -> b.authorSurname));
        sortedByAuthor.forEach(System.out::println);
        System.out.println("\nСортування по року видання");

        ArrayList<Book> sortedByYear = new ArrayList<>(catalog.values());
        Collections.sort(sortedByYear, Comparator.comparing(b -> b.year));
        sortedByYear.forEach(System.out::println);

        TreeSet<String> uniqueTitles = new TreeSet<>();
        catalog.values().forEach(book -> uniqueTitles.add(book.title));
        System.out.println("\nUnique titles: " + uniqueTitles);
    }
}
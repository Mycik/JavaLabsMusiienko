import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

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
    private HashMap<Integer, Book> catalog;

    public Seventeen() {
        catalog = new HashMap<>();
    }

    public void addBook(Integer isbn, Book book) {
        catalog.put(isbn, book);
    }

    public Book findBookByISBN(Integer isbn) {
        return catalog.get(isbn);
    }

    public ArrayList<Book> getSortedBooksByAuthor() {
        ArrayList<Book> sortedBooks = new ArrayList<>(catalog.values());
        sortedBooks.sort(Comparator.comparing(b -> b.authorSurname));
        return sortedBooks;
    }

    public ArrayList<Book> getSortedBooksByYear() {
        ArrayList<Book> sortedBooks = new ArrayList<>(catalog.values());
        sortedBooks.sort(Comparator.comparing(b -> b.year));
        return sortedBooks;
    }

    public TreeSet<String> getUniqueTitles() {
        TreeSet<String> uniqueTitles = new TreeSet<>();
        catalog.values().forEach(book -> uniqueTitles.add(book.title));
        return uniqueTitles;
    }

    public static void main(String[] args) {
        Seventeen seventeen = new Seventeen();
        seventeen.addBook(1001, new Book("Java Programming", "Ivanov", "Ivan", "Ivanovich", "PublisherA", 2020, 29.99f));
        seventeen.addBook(1002, new Book("Data Structures", "Petrov", "Petr", "Petrovich", "PublisherB", 2019, 19.99f));
        seventeen.addBook(1003, new Book("Data Programming", "Dmitrov", "Dmitro", "Dmitrievich", "PublisherC", 2021, 39.99f));
        seventeen.addBook(1004, new Book("Java Structures", "Nikitov", "Nikita", "Nikitovich", "PublisherD", 2022, 9.99f));
        seventeen.addBook(1005, new Book("Java Data Programming", "Androv", "Andrii", "Andrievich", "PublisherF", 2023, 5.99f));

        seventeen.getSortedBooksByAuthor().forEach(System.out::println);
        System.out.println("\nСортування по року видання");
        seventeen.getSortedBooksByYear().forEach(System.out::println);
        System.out.println("\nUnique titles: " + seventeen.getUniqueTitles());
    }
}
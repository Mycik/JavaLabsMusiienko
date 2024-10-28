import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class LibraryAbonent {
    String surname;
    String name;
    String patronymic;
    String address;

    public LibraryAbonent(String surname, String name, String patronymic, String address) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic + ", " + address;
    }
}

public class Thirteen {
    public static void main(String[] args) {
        HashMap<Integer, LibraryAbonent> abonents = new HashMap<>();
        abonents.put(1, new LibraryAbonent("Ivanov", "Ivan", "Ivanovich", "Kyiv"));
        abonents.put(2, new LibraryAbonent("Petrov", "Petr", "Petrovich", "Lviv"));
        abonents.put(3, new LibraryAbonent("Dmitrov", "Dmitro", "Dmitrievich", "Druzhkivka"));
        abonents.put(4, new LibraryAbonent("Nikitov", "Nikita", "Nikitovich", "Volnogorsk"));
        abonents.put(5, new LibraryAbonent("Androv", "Andrii", "Andrievich", "Nikolaiv"));

        ArrayList<LibraryAbonent> sortedAbonents = new ArrayList<>(abonents.values());
        Collections.sort(sortedAbonents, Comparator.comparing(a -> a.surname));
        sortedAbonents.forEach(System.out::println);
    }
}
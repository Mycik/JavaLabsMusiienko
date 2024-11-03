import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

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
    private HashMap<Integer, LibraryAbonent> abonents;

    public Thirteen() {
        abonents = new HashMap<>();
    }

    public void addAbonent(Integer id, LibraryAbonent abonent) {
        abonents.put(id, abonent);
    }

    public LibraryAbonent findAbonentById(Integer id) {
        return abonents.get(id);
    }

    public void updateAbonent(Integer id, LibraryAbonent newAbonent) {
        abonents.put(id, newAbonent);
    }

    public ArrayList<LibraryAbonent> getSortedAbonentsBySurname() {
        ArrayList<LibraryAbonent> sortedAbonents = new ArrayList<>(abonents.values());
        sortedAbonents.sort(Comparator.comparing(a -> a.surname));
        return sortedAbonents;
    }

    public static void main(String[] args) {
        Thirteen thirteen = new Thirteen();
        thirteen.addAbonent(1, new LibraryAbonent("Ivanov", "Ivan", "Ivanovich", "Kyiv"));
        thirteen.addAbonent(2, new LibraryAbonent("Petrov", "Petr", "Petrovich", "Lviv"));
        thirteen.addAbonent(3, new LibraryAbonent("Dmitrov", "Dmitro", "Dmitrievich", "Druzhkivka"));
        thirteen.addAbonent(4, new LibraryAbonent("Nikitov", "Nikita", "Nikitovich", "Volnogorsk"));
        thirteen.addAbonent(5, new LibraryAbonent("Androv", "Andrii", "Andrievich", "Nikolaiv"));

        ArrayList<LibraryAbonent> sortedAbonents = thirteen.getSortedAbonentsBySurname();
        sortedAbonents.forEach(System.out::println);
    }
}
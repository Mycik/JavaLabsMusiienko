import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

class Abonent {
    String surname;
    String name;
    String patronymic;
    String address;

    public Abonent(String surname, String name, String patronymic, String address) {
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

public class One {
    private TreeMap<Integer, Abonent> abonents;

    public One() {
        abonents = new TreeMap<>();
    }

    public void addAbonent(Integer phone, Abonent abonent) {
        abonents.put(phone, abonent);
    }

    public List<Abonent> getSortedAbonentsByFields() {
        List<Abonent> sortedAbonents = new ArrayList<>(abonents.values());
        sortedAbonents.sort(Comparator.comparing((Abonent a) -> a.surname).thenComparing(a -> a.name));
        return sortedAbonents;
    }

    public TreeMap<Integer, Abonent> getAbonents() {
        return abonents;
    }

    public static void main(String[] args) {
        One one = new One();
        one.addAbonent(123456789, new Abonent("Ivanov", "Ivan", "Ivanovich", "Kyiv"));
        one.addAbonent(987654321, new Abonent("Petrov", "Petr", "Petrovich", "Lviv"));
        one.addAbonent(515161925, new Abonent("Dmitrov", "Dmitro", "Dmitrievich", "Druzhkivka"));
        one.addAbonent(728817822, new Abonent("Nikitov", "Nikita", "Nikitovich", "Volnogorsk"));
        one.addAbonent(198952525, new Abonent("Androv", "Andrii", "Andrievich", "Nikolaiv"));

        one.getAbonents().forEach((phone, abonent) -> System.out.println("Phone: " + phone + " -> " + abonent));
    }
}
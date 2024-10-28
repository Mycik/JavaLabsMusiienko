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
    public static void main(String[] args) {
        TreeMap<Integer, Abonent> abonents = new TreeMap<>();
        abonents.put(123456789, new Abonent("Ivanov", "Ivan", "Ivanovich", "Kyiv"));
        abonents.put(987654321, new Abonent("Petrov", "Petr", "Petrovich", "Lviv"));
        abonents.put(515161925, new Abonent("Dmitrov", "Dmitro", "Dmitrievich", "Druzhkivka"));
        abonents.put(728817822, new Abonent("Nikitov", "Nikita", "Nikitovich", "Volnogorsk"));
        abonents.put(198952525, new Abonent("Androv", "Andrii", "Andrievich", "Nikolaiv"));

        abonents.forEach((phone, abonent) -> System.out.println("Phone: " + phone + " -> " + abonent));
    }
}

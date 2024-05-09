import java.util.ArrayList;
import java.util.List;
import User.User;

public class Main {
    public static void main(String[] args) {
        List<User> users = loadResidents();

        // Crear el iterador para la colección de usuarios
        Iterator iterator = new ConcreteIterator(users);

        System.out.println("Lista de personas NO solventes: \n");
        while (iterator.hasMore()) {
            User user = iterator.getNext();
            if (user.getBalance() != 0) {
                System.out.println("Nombre: " + user.getFirstName() + " " + user.getLastName() + " - " + "Debe:"
                        + user.getBalance());

                // Decorator
                INotifier notifier = new EmailDecorator(new WhatsappDecorator(new Notifier()));
                notifier.sendMsg(null);
            }
        }

        iterator.reset();

        System.out.println("\nLista de personas solventes: \n");
        while (iterator.hasMore()) {
            User user = iterator.getNext();
            if (user.getBalance() == 0) {
                System.out.println("Nombre: " + user.getFirstName() + " " + user.getLastName());
            }
        }
    }

    public static List<User> loadResidents() {
        List<User> residents = new ArrayList<>(10);

        // Creando los primeros cinco residentes con saldo deudor 0
        residents.add(new User("Juan", "Gonzalez", 101, 0, "555-1234", "juan@example.com"));
        residents.add(new User("Maria", "Lopez", 102, 0, "555-5678", "maria@example.com"));
        residents.add(new User("Carlos", "Martinez", 103, 0, "555-9012", "carlos@example.com"));
        residents.add(new User("Ana", "Rodriguez", 104, 0, "555-3456", "ana@example.com"));
        residents.add(new User("Pedro", "Sanchez", 105, 0, "555-7890", "pedro@example.com"));

        // Creando los últimos cinco residentes con saldo deudor diferente de 0
        residents.add(new User("Luis", "Perez", 201, 50.0, "555-1111", "luis@example.com"));
        residents.add(new User("Laura", "Gomez", 202, 75.0, "555-2222", "laura@example.com"));
        residents.add(new User("Javier", "Diaz", 203, 100.0, "555-3333", "javier@example.com"));
        residents.add(new User("Sofia", "Hernandez", 204, 125.0, "555-4444", "sofia@example.com"));
        residents.add(new User("Miguel", "Torres", 205, 150.0, "555-5555", "miguel@example.com"));

        return residents;
    }

}

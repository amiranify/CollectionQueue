import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person personPool = queue.poll();
            personPool.quantityTickets = personPool.quantityTickets - 1;
            System.out.printf("%s %s прокатился на атракционе(осталось %d билета(ов))\n", personPool.name, personPool.sureName, personPool.quantityTickets);
            if (personPool.quantityTickets > 0) {
                queue.add(personPool);
            }
        }
    }

    private static List<Person> generateClients() {
        return List.of(
                new Person("Иван", "Тургенев", 2),
                new Person("Лев", "Толстой", 5),
                new Person("Александр", "Пушкин", 1),
                new Person("Николай", "Гоголь", 4),
                new Person("Михаил", "Лермонтов", 3)
        );
    }
}

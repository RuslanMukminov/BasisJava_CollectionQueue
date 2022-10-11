import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<Person> generateClients() {
        Person client1 = new Person("Николай", "Иванов", 1);
        Person client2 = new Person("Татьяна", "Кравченко", 5);
        Person client3 = new Person("Антон", "Колесников", 4);
        Person client4 = new Person("Мария", "Харитонова", 2);
        Person client5 = new Person("Дмитрий", "Лыков", 5);
        List<Person> clients = new LinkedList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);
        clients.add(client5);
        return clients;
    }

    public static void main(String[] args) {
        Queue<Person> clientsQueue = new LinkedList<>(generateClients());
        while (!clientsQueue.isEmpty()) {
            Person client = clientsQueue.poll();
            System.out.println(client.getName() + " прокатился на аттракционе");
            if (client.removeTicket()) {
                clientsQueue.offer(client);
            } else {
                continue;
            }
        }
    }
}

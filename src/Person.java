public class Person {
    protected String name, surname;
    protected int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public boolean removeTicket() {
        tickets--;
        return tickets > 0;
    }

    public String getName() {
        return name + " " + surname;
    }
}

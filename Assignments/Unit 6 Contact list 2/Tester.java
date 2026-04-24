import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact("Mat", "Jon", "123-456-7890"));
        contacts.add(new Contact("Matthew", "Medovoy", "310-365-0281"));
        contacts.add(new Contact("Henry", "Schneider", "818-947-1634"));
        contacts.add(new Contact("Mr", "Lopez", "381-475-1834"));
        System.out.println(contacts);
    }
}

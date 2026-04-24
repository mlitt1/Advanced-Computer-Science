import java.util.AbstractList;
import java.util.ArrayList;

public class ContactList extends AbstractList<Contact> {
    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public ArrayList<Contact> getContacts() {
        return contactList;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contactList = contacts;
    }

    public ContactList(ArrayList<Contact> contacts) {
        this.contactList = new ArrayList<Contact>();
    }

    public boolean add(Contact contact) {
        if (contactList.add(contact)) {
            return true;
        }
        return false;
    }

    public boolean remove(Contact contact) {
        if (contactList.remove(contact)) {
            return true;
        }
        return false;

    }

    @Override
    public int size() {
        return contactList.size();
    }

    @Override
    public Contact get(int index) {
        return contactList.get(index);
    }

    public ArrayList<Contact> sortByFirstName() {
        for (Contact contact: contactList) {
            contactList.getFirstName(contact);
        }
        return contactList;
    }

}

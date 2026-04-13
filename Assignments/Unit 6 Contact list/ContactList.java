import java.util.AbstractList;
import java.util.ArrayList;

public class ContactList extends AbstractList {

    // instance variable
    private ArrayList<String> contactList;

    // constructor
    public ContactList() {
        this.contactList = new ArrayList<String>();
    }

    // methods

    // to-do: findInsertLocation(String name)
    /**
     * returns the location in the contact list where the name should go to keep the list
     * alphabetized
     */
    private int findInsertLocation(String name) {
        if (name == null || contactList == null) {
            throw new IllegalArgumentException("Illegal");
        }
        for (int i = 0; i < contactList.size(); i++) {
            if (name.compareTo(contactList.get(i)) < 0) {
                return i;
            }
        }
        return contactList.size();
    }

    // to-do: add(String name)
    /**
     * adds a name to the contact list so that the list remains alphabetized, it prints out which
     * name is being added, also the method prevents duplicate names from being added
     */
    public boolean add(String name) {
        if (name == null || name.isEmpty() || contactList == null) {
            throw new IllegalArgumentException("Illegal");
        }
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).equals(name)) {
                return false;
            }
        }
        System.out.println("+ Adding " + name);
        contactList.add(findInsertLocation(name), name);
        return false;
    }

    // to-do: add(ArrayList<String> names)
    /* this method adds a list of names to the contact list */
    public void add(ArrayList<String> names) {
        if (names == null || contactList == null) {
            throw new IllegalArgumentException("Illegal");
        }
        for (int i = 0; i < names.size(); i++) {
            add(names.get(i));
        }
    }

    // to-do: remove(String name)
    /** removes name from the contact list and keeps list alphabetized */
    public boolean remove(String name) {
        if (name == null || contactList == null) {
            throw new IllegalArgumentException("Illegal");
        }
        System.out.println("- Removing " + name);
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).equals(name)) {
                contactList.remove(i);
                return true;
            }
        }
        return false;
    }

    // to-do: remove(ArrayList<String> names)
    /* this method removes a list of names from the contact list */
    public void remove(ArrayList<String> names) {
        if (names == null || contactList == null) {
            throw new IllegalArgumentException("Illegal");
        }
        for (int i = 0; i < names.size(); i++) {
            remove(names.get(i));
        }
    }

    /** returns a String containing all of the words in list */
    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    // to-do: get(int index)
    /** returns the name at the specified index */
    public String get(int index) {
        if (index < 0 || contactList == null) {
            throw new IllegalArgumentException("Illegal");
        }
        return contactList.get(index);
    }

    // to-do: size()
    /** returns the number of names in the contact list */
    public int size() {
        if (contactList == null) {
            return 0;
        }
        return contactList.size();
    }

    // to-do: clear()
    /** removes all names from the contact list */
    public void clear() {
        System.out.println("Clearing the contact list");
        contactList.clear();
    }

}

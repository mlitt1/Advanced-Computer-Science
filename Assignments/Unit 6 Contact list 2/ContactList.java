import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

public class ContactList extends AbstractList<Contact> {
    private ArrayList<Contact> contactList;

    public ContactList() {
        this.contactList = new ArrayList<Contact>();
    }

    public ArrayList<Contact> getContacts() {
        return contactList;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contactList = contacts;
    }

    @Override
    public Contact get(int index) {
        return contactList.get(index);
    }

    @Override
    public int size() {
        return contactList.size();
    }

    @Override
    public boolean add(Contact contact) {
        for (Contact c : contactList) {
        if (c.equals(contact)) {
            return false;
        }
        }
        contactList.add(contact);
        return true;
    }

    public boolean remove(Contact contact) {
        return contactList.remove(contact);
    }

    public void sortByFirstName() {
        Collections.sort(contactList);
    }

    public void sortByLastName() {
        for (int i = 1; i < contactList.size(); i++) {
            Contact key = contactList.get(i);
            int j = i - 1;
            while (j >= 0 && contactList.get(j).compareByLastName(key) > 0) {
                contactList.set(j + 1, contactList.get(j));
                j--;
            }
            contactList.set(j + 1, key);
        }
    }

    public void sortByTelephoneNumber() {
        for (int i = 0; i < contactList.size() - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < contactList.size(); j++) {
                if (contactList.get(j).getTelephoneNumber().compareTo(contactList.get(minIdx).getTelephoneNumber()) < 0) {
                    minIdx = j;
                }
            }
            Contact temp = contactList.get(minIdx);
            contactList.set(minIdx, contactList.get(i));
            contactList.set(i, temp);
        }
    }

    public Contact searchContacts(String telephoneNumber) {
        sortByTelephoneNumber();
        int low = 0;
        int high = contactList.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = contactList.get(mid).getTelephoneNumber().compareTo(telephoneNumber);
            if (cmp == 0) {
                return contactList.get(mid);
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.join("\n", contactList.stream().map(Contact::toString).toList()) + "\n";
    }
    
}

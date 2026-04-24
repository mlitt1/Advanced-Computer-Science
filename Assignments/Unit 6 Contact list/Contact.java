import java.util.ArrayList;

public class Contact {
    
    private ContactList firstName;
    private ContactList lastName;
    private String phoneNumber;

    public Contact(ContactList firstName, ContactList lastName, String phoneNumber) {
        firstName = new ContactList();
        lastName = new ContactList();
        int count = 0;
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (Character.isDigit(phoneNumber.charAt(i))) {
                count++;
            }
        }
        if (phoneNumber.indexOf("-") == 3 && phoneNumber.lastIndexOf("-") == 7 && count == 10) {
                this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Invalid phone number");
        }
    }

    ArrayList<Contact> contacts = new ArrayList<Contact>();

    public boolean isExisting(Contact contact, Contact other) {
        if (contact.firstName == other.firstName && contact.lastName == other.lastName && contact.phoneNumber == other.phoneNumber) {
            return true;
        } else {
            return false;
        }
    }
    
    public void addNewContact(ContactList firstName, ContactList lastName, String phoneNumber) {
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        for (int i = 0; i < contacts.size(); i++) {
            if (!isExisting(contact, contacts.get(i))) {
                contacts.add(contact);
            }
        }
    }

}

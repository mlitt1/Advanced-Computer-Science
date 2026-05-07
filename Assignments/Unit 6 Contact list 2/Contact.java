public class Contact implements Comparable<Contact> {

    private String firstName;
    private String lastName;
    private String telephoneNumber;

    public Contact(String firstName, String lastName, String telephoneNumber) {
        this.firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        this.lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        int count = 0;
        for (int i = 0; i < telephoneNumber.length(); i++) {
            if (Character.isDigit(telephoneNumber.charAt(i))) {
                count++;
            }
        }

        if (telephoneNumber.indexOf("-") == 3 && telephoneNumber.lastIndexOf("-") == 7 && count == 10) {
            this.telephoneNumber = telephoneNumber;
        } else {
            throw new IllegalArgumentException("Invalid phone number");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + telephoneNumber;
    }

    @Override
    public int compareTo(Contact other) {
        int comp = this.firstName.compareTo(other.firstName);
        if (comp != 0) {
            return comp;
        }
        comp = this.lastName.compareTo(other.lastName);
        if (comp != 0) {
            return comp;
        }
        return this.telephoneNumber.compareTo(other.telephoneNumber);
    }

    public int compareByLastName(Contact other) {
        int cmp = this.lastName.compareTo(other.lastName);
        if (cmp != 0) {
            return cmp;
        }
        cmp = this.firstName.compareTo(other.firstName);
        if (cmp != 0) {
            return cmp;
        }
        return this.telephoneNumber.compareTo(other.telephoneNumber);
    }

    public boolean equals(Contact contact) { 
        if (this == contact) {
            return true;
        }
        if (!(contact instanceof Contact)) {
            return false;
        }

        Contact other = (Contact) contact;
        return this.telephoneNumber.equals(other.telephoneNumber);
    }
}

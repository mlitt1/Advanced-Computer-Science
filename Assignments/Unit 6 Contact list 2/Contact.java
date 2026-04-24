public class Contact {
    // instance variables
    private String firstName;
    private String lastName;
    private String telephoneNumber;

    // getters
    // setters
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

    // constructors
    public Contact(String firstName, String lastName, String telephoneNumber) {
        this.firstName = firstName.toLowerCase().toUpperCase();
        this.lastName = lastName.toLowerCase().toUpperCase();
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
    // methods
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + telephoneNumber;
    }

    public int compareTo(Contact other) {
        if (this.getFirstName() == other.getFirstName() && this.lastName == other.getLastName() && this.telephoneNumber == other.telephoneNumber) {
            return 0;
        } else if ();
    }


}

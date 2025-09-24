public class Bank {
    
    // instance variables
    private int numberOfLoanOfficers;
    private int numberOfTellers;
    
    public Bank() {
    }
    // constructors
    
    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }
    // getters
    
    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }
    // setters
    
    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }
    // methods
    
    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public String toString() {
        String firstPart = "This bank has " + numberOfLoanOfficers;
        String secondPart = " loan officers and " + numberOfTellers + " tellers.";
        
        return firstPart + secondPart;
    }

    public boolean equals(Bank other) {
        boolean partOne = this.numberOfLoanOfficers == other.numberOfLoanOfficers;
        boolean partTwo = this.numberOfTellers == other.numberOfTellers;

        return partOne && partTwo;
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers += numberToHire;
        } else {
            numberOfTellers += numberToHire;
        }
    }

}

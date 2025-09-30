public class Customer {
    // instance variables
    
    private String name;
    private String address;
    private int rewardPoints;
    // constructors
    
    public Customer(String name, String address, int rewardPoints) {
        this.name = name;
        this.address = address;
        this.rewardPoints = rewardPoints;
    }
    // getters

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    // methods

    public String toString() {
        return "Customer Name: "+ name + ", Address: " + address + ", Reward Points: 3500";
    }

    public boolean equals(Customer other) {
        return this.name == other.name && this.address == other.address && this.rewardPoints == other.rewardPoints;
    }

    public double boostPoint(double rewardPoints) {
        return rewardPoints += Math.random() * (100.0);
    }
}

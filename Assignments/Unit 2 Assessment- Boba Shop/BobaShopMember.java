public class BobaShopMember {

    // instance variables

    private String name;
    private boolean[] loyaltyCredits;

    // constructors

    public BobaShopMember(String name, boolean[] loyaltyCredits) {
        this.name = name;
        this.loyaltyCredits = new boolean[10];
    }


    // getters

    public String getName() {
        return name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }


    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    // methods

    public boolean[] grantLoyaltyCredit() {

        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (!loyaltyCredits[i]) {
                loyaltyCredits[i] = true;
                break;
            }
        }

        return loyaltyCredits;
    }

    public int countLoyaltyCredits() {
        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i]) {
                count++;
            }
        }

        return count;
    }

    public String determineMembershipStatus() {
        int creditsCount = countLoyaltyCredits();
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (creditsCount >= 6) {
                return "Gold member";
            } else if (creditsCount >= 3 && creditsCount <= 5) {
                return "Silver member";
            }

        }
        return "Plus member";
    }

    public String loyaltyHistory() {
        String loyalty = "Loyalty History [";

        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i]) {
                loyalty = loyalty + "X";
            } else {
                loyalty = loyalty + "-";
            }
            if (i < this.loyaltyCredits.length - 1) {
                loyalty = loyalty + ",";
            }
        }

        loyalty = loyalty + "]";
        return loyalty;
    }

    public String toString() {
        String coolString;
        String part1 = name + " (" + determineMembershipStatus() + "), ";
        coolString = part1 + loyaltyHistory();
        return coolString;
    }

    public boolean equals(BobaShopMember other) {
        if (this.name == other.name && this.loyaltyCredits == other.loyaltyCredits) {
            return true;
        }
        return false;
    }
}

public class Car {
    
    // instance variables

    private String model;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsOilChange;
    // constructors
    
    public Car(String model, String ownerName,  int cleanlinessLevel) {
        this.model = model;
        this.ownerName = ownerName;
        this.cleanlinessLevel = cleanlinessLevel;
    }

    public Car() {
        this.model = getModel();
        this.ownerName = getOwnerName();
        this.username = AutoUtils.generateUsername("Morgan Litt");
        this.cleanlinessLevel = getCleanlinessLevel();
        this.needsOilChange = isNeedsOilChange();
    }

    // getters
    
    public String getModel() {
        return model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getUsername() {
        return username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public boolean isNeedsOilChange() {
        return needsOilChange;
    }
    
    // setters

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwnerName(String ownerName) {
        AutoUtils.fixName(ownerName);
        this.ownerName = ownerName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.cleanlinessLevel = cleanlinessLevel;
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }

    // methods

    public String toString() {
        String partOne = "== ABOUT CAR ==" + "\nModel: " + getModel() + "\nOwner:" + AutoUtils.fixName(ownerName);
        String partTwo = "\nUsername:" + getUsername() + "\nCleanliness Level: " + getCleanlinessLevel() + "\nDoes car need oil change? " + isNeedsOilChange();
        return partOne + partTwo;
    }

    public boolean equals(Car other) {
        if (this.model == other.model && this.getOwnerName() == other.ownerName && this.cleanlinessLevel == other.getCleanlinessLevel()) {
            return true;
        }
        return false;
    }
}

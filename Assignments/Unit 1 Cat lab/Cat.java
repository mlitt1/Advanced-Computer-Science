public class Cat {

    // instance variables
    private int moodLevel;
    private String name;
    private String ownerName;
    private String catId;
    private char catChar;
    private boolean isHungry;

    // constructors
    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = moodLevel;
        this.catId = catId;
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
    }

    public Cat() {
        this.name = "";
        this.ownerName = "";
        this.moodLevel = 5;
        this.catId = PurrfectUtils.generateCatId();
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
    }

    // getters
    public int getMoodLevel() {
        return moodLevel;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getCatId() {
        return catId;
    }

    public char getCatChar() {
        return catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }


    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            this.moodLevel = 0;
        } else if (moodLevel > 10) {
            this.moodLevel = 10;
        } else {
            this.moodLevel = moodLevel;
        }
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    // methods
    public String generateCatTag() {
        return catId + catChar;
    }

    public String toString() {
        String header = "== ABOUT " + name.toUpperCase() + " ==\n";
        String description = name + " is a cat.\n";
        String tag = "Their tag is " + catId + catChar + ".\n";
        String mood = PurrfectUtils.determineCatMood(this);
        return header + description + tag + mood;
    }

    public boolean equals(Cat other) {
        return this.name.equals(other.name)
            && this.generateCatTag().equals(other.generateCatTag())
            && this.moodLevel == other.moodLevel;
    }
}

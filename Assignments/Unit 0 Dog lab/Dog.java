public class Dog {
    
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    // constructors

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = generateDogChar();
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        this.stillInFacility = getStillInFacility();
    }    

    public Dog() {
        this.name = "Morgan";
        this.ownerName = "Sigma";
        this.age = 15;
        this.dogId = 677;
        this.dogChar = generateDogChar();
        this.dogTag = "67 is tuff";
        this.stillInFacility = true;
    }

    // getters
    // setters
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getDogId() {
        return dogId;
    }
    public void setDogId(int dogId) {
        this.dogId = dogId;
    }
    public char getDogChar() {
        return dogChar;
    }
    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }
    public String getDogTag() {
        return dogTag;
    }
    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }
    public boolean getStillInFacility() {
        return stillInFacility;
    }
    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    // methods

    public boolean equals(Dog other) {
        if (other.age == age && other.name == name && other.dogTag == dogTag) {
            return true;
        } else;
        return false;
    }

    public String toString(String name, String ownerName, int age, int dogId, char dogChar, String dogTag, boolean stillInFacility) {
        
        return name + "is a good dog. They are" + age + "years old and belong to" + ownerName + "." +  getStillInFacility() + "For employee use only: DogTag is" + dogTag;
    }

    public char generateDogChar() {
        int dig3 = dogId % 10;
        int dig2 = dogId/10 % 10;
        int dig1 = dogId/100 % 10;
        return dogChar = (char) ('F' + (dig1 + dig2 + dig3) % 10);
    }
    
}

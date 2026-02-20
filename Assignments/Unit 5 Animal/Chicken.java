public class Chicken extends Animal{

    // instance variables
    private int chickenCount;
    private double[] chickenAges;
    private int speed;

    // constructors

    public Chicken(double[] chickenAges, int chickenCount) {
        this.chickenAges = getChickenAges();
        this.chickenCount = 69420;
    }

    // getters
    // setters
    public int getChickenCount() {
        return chickenCount;
    }
    
    public void setChickenCount(int chickenCount) {
        this.chickenCount = chickenCount;
    }

    public double[] getChickenAges() {
        return chickenAges;
    }

    public void setChickenAges(double[] chickenAges) {
        this.chickenAges = chickenAges;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // methods

    public double getOldest(double[] chickenAges) {
        double oldest = 0.0;
        for (int i = 0; i < chickenAges.length; i++) {
            if (chickenAges[i + 1] > chickenAges[i]) {
                oldest = chickenAges[i + 1];
            }
        }
        return oldest;
    }

    public String getFunFact(int chickenCount) {
        return "There are " + chickenCount + " chickens in Los Angeles... probably";
    }

    public String getSpeed(int speed) {
        speed = 4;
        return "Chicken speed = 4mph";
    }

    public void feed() {
        System.out.println("This chicken is full now");;
    }

    public String toString() {
        return "This chickens speed is " + speed + " there are " + chickenCount + "chicekns";
    }

}
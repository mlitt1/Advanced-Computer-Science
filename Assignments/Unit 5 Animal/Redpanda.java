public class Redpanda extends Animal {
    
    private int speed;
    private String name;
    private double hunger;
    private double weight;
    
    
    public void eat() {
        System.out.println("I am eating concurrently at this precie moment");
    }

    public String funfact() {
        return "Redpandas like bamboo";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void feed() {
        System.out.println(name + " is full");
        if (hunger >= 5.5) {
            hunger -= 5.5;
        }
        weight += 1;
    }

    public String toString() {
        return "This " + name + " weighs " + weight + " their hunger level is " + hunger;
    }

}

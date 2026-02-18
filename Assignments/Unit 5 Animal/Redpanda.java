public class Redpanda extends Animal {
    
    private int speed;
    
    
    public void eat() {
        System.out.println("I am eating concurrently at this precie moment");
    }

    public String funfact() {
        return "Redpandas like bamboo";
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}

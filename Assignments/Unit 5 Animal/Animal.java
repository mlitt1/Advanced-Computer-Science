public abstract class Animal {
    
    // common instance variables
    private int speed;

    // common abstract methods
    public abstract void eat();

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

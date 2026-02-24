public class Triangle extends Polygon{

    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle() {
        super(3);
        this.base = 3;
        this.height = 4;
    }

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (0.5 * base) * height;
    }

    public String toString() {
        String coolPart = super.toString();
        String partone = "It is a triangle with a base of " + base;
        String parttwo = "and height of " + height + ". Its area is " + getArea() + ".";
        return coolPart + partone + parttwo;
    }
    
}

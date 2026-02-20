public class Rectangle extends Polygon {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super(4);
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        super(4);
        this.length = 4;
        this.width = 3;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        String coolString = super.toString();
        String partone = "It is a rectangle with a length of " + length;
        String parttwo = "and width of " + width + ". Its area is " + getArea() + ".";
        return coolString + partone + parttwo;
    }
    
}

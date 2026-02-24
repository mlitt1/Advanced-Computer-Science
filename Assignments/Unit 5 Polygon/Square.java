public class Square extends Rectangle {

    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    public Square() {
        super(4, 4);
    }

    public double getArea() {
        return super.getArea();
    }

    public String toString() {
        String coolString = super.toString();
        String partone = "It is a rectangle with a length of " + super.getLength();
        String parttwo = "and width of " + super.getWidth() + ". Its area is " + getArea() + ".";
        return coolString + partone + parttwo;
        
    }    
}

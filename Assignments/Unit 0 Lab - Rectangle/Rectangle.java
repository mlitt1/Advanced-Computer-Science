public class Rectangle {
    int length;
    int width;

    public Rectangle(int i, int j) {
        length = i;
        width = j;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateDiagonal() {
        return Math.sqrt((length * length) + (width * width));
    }

    public String toString() {
        return "This rectangle has a length of " + length
             + " and a width of " + width
             + ". Its area is " + calculateArea();
    }

    public boolean equals(Rectangle other) {
        return (length == other.length && width == other.width);
    }
}

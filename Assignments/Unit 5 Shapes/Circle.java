import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape {

    private int radius;

    public Circle(int xCoord, int yCoord, int radius) {
        super(xCoord, yCoord);
        this.radius = radius;
    }

    public Circle(int radius) {
        super(0, 0);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        // Initialize a Graphics 2D object
        Graphics2D circle = (Graphics2D) g;
        // Set the color of the circle
        circle.setPaint(Color.blue);
        // Draw the circle using the fillOval method
        circle.fillOval(xCoord, yCoord, radius, radius);

        // set the color of the circle
        circle.setPaint(Color.orange);
        // change the stroke width
        circle.setStroke(new BasicStroke(5));
        // draw the circle using the drawOval method
        circle.drawOval(xCoord, yCoord, radius, radius);

    }

    public String toString() {
        super.toString();
        return "It is a circle with a radius of " + radius + ". It's area is " + getArea() + ".";
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

}

public class Line {
    
    // instance variables
    private int a;
    private int b;
    private int c;
    private Point p1;
    private Point p2;

    // constructors
    
    public Line(int a, int b, int c) {
        this.a = -(p2.getY() - p1.getY()); 
        this.b = p2.getX() - p1.getX(); 
        this.c = -(this.a * p1.getX() + p1.getY() * this.b); 
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;

        this.a = p1.getY() - p2.getY();
        this.b = p2.getX() - p1.getX();
        this.c = -(this.a * p1.getX() + this.b * p1.getY());
    }

    // getters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    // setters
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    // methods
    
    public double calculateSlope() {
        return (double) (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    public double calculateSlopeFromPoints() {
        return (double) (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    public boolean isCoordinateOnLine(Point p) {
        return a * p.getX() + b * p.getY() + c == 0;
    }

    public String toString() {
        return "Equation: " + a + "x + " + b + "y + " + c + " = 0";
    }

    public boolean equals(Line other) {
        return this.a == other.a && this.b == other.b && this.c == other.c;
    }

    public String generatePointSlopeFormula() {
        double slope = calculateSlopeFromPoints();
        return "(y - " + p1.getY() + ") = " + slope + "(x - " + p1.getX() + ")";
    }


}

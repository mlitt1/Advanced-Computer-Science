public class Line<a, b> {
    // instance variables
    private int a;
    private int b;
    private int c;

    // constructors
    
    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    // setters
    
    public void setA() {
        this.a = a;
    }

    public void setB() {
        this.b = b;
    }

    public void setC() {
        this.c = c;
    }

    // methods
    
    public double calculateSlope() {
        return -a / b;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        if ((a)x + (b)y + (c) == 0) {
            return false;
        } else;
    }

    public String toString() {
        return "Equation: " + (a) + "x + " + (b)+ "y + " + (c) + "= 0";
    }
}

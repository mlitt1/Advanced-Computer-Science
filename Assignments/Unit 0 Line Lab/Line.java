public class Line {
    
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
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    // methods
    public double calculateSlope() {
        return -(double) a / b;  // cast to double to avoid integer division
    }

    public boolean isCoordinateOnLine(int x, int y) {
        return a * x + b * y + c == 0;
    }

    public String toString() {
        return "Equation: " + a + "x + " + b + "y + " + c + " = 0";
    }

    public boolean equals(Line other) {
        return this.a == other.a && this.b == other.b && this.c == other.c;
    }
}

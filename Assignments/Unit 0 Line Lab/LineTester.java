public class LineTester {
    public static void main(String[] args) {
        // Testing Line 1
        Line line1 = new Line(5, 4, -17);
        System.out.println(line1.toString());
        System.out.println("Slope: " + line1.calculateSlope());
        System.out.println("Point (5, -2) on line1? " + line1.isCoordinateOnLine(5, -2));

        // Testing Line 2
        Line line2 = new Line(-25, 40, 30);
        System.out.println(line2.toString());
        System.out.println("Slope: " + line2.calculateSlope());
        System.out.println("Point (5, -2) on line2? " + line2.isCoordinateOnLine(5, -2));

        // Equality test
        Line line3 = new Line(5, 4, -17);
        System.out.println("line1 equals line3? " + line1.equals(line3));
    }
}

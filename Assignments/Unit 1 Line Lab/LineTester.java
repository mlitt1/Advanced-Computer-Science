public class LineTester {
    public static void main(String[] args) {
        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);

        Line pointLine = new Line(p1, p2);

        double slope1 = pointLine.calculateSlopeFromPoints();
        double slope2 = pointLine.calculateSlopeFromPoints();

        System.out.println("Using calculateSlope(): " + slope1);
        System.out.println("Using calculateSlopeFromPoints(): " + slope2);

        if (Double.isInfinite(slope1) && Double.isInfinite(slope2)) {
            System.out.println("Slopes are equal: both are infinite (vertical line)");
        } else if (Double.isNaN(slope1) && Double.isNaN(slope2)) {
            System.out.println("Slopes are equal: both are NaN");
        } else if (slope1 == slope2) {
            System.out.println("Slopes are equal: true");
        } else {
            System.out.println("Slopes are equal: false");
        }

        System.out.println("Is p1 on the line? " + pointLine.isCoordinateOnLine(p1));
        System.out.println("Is p2 on the line? " + pointLine.isCoordinateOnLine(p2));
        System.out.println("Is p3 on the line? " + pointLine.isCoordinateOnLine(p3));
        System.out.println("Is p4 on the line? " + pointLine.isCoordinateOnLine(p4));
    }

}

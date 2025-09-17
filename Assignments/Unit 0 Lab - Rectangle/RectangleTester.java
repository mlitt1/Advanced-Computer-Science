public class RectangleTester {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(6, 8);

        System.out.println("Original Rectangles:");
        System.out.println(r1);
        System.out.println(r2);

        r1.setLength(10);
        r1.setWidth(5);

        r2.setLength(10);
        r2.setWidth(5);

        System.out.println("\nModified Rectangles:");
        System.out.println(r1);

        System.out.println("\nAre rectangel 1 and rectangle 2 equal? " + r1.equals(r2));

        System.out.println("\nDiagonal of rectangle: " + r1.calculateDiagonal());

        System.out.println("\nArea of rectangle: " + r1.calculateArea());

        System.out.println("\nPerimeter of rectangle: " + r1.calculatePerimeter());

    }
}

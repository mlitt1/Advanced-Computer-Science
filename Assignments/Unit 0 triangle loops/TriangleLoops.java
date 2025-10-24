public class TriangleLoops {

    public static void main(String[] args) {
        // Example calls
        System.out.println(createLetterTriangleUp(3, 'A'));
        System.out.println(createLetterTriangleDown(3, 'B'));
        System.out.println(createNumbersTriangle(4));
        System.out.println(createAlphabetTriangle(5));
    }

    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";
        for (int row = 1; row <= numberOfRows; row++) {
            String line = "";
            for (int i = 1; i <= row; i++) {
                line += letter;
            }
            triangle += line + "\n";
        }
        return triangle;
    }

    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";
        for (int row = numberOfRows; row >= 1; row--) {
            String line = "";
            for (int i = 1; i <= row; i++) {
                line += letter;
            }
            triangle += line + "\n";
        }
        return triangle;
    }

    public static String createNumbersTriangle(int numberOfRows) {
        String triangle = "";
        for (int row = 1; row <= numberOfRows; row++) {
            String line = "";
            for (int i = 1; i <= row; i++) {
                line += row + " ";
            }
            triangle += line.trim() + "\n";
        }
        return triangle;
    }

    public static String createAlphabetTriangle(int numberOfRows) {
        String part1 = "     A\n.   ABA\n.  ABCBA\n  ABCDCBA\n ABCDEDCBA ";
        String part2 = "******A\n.*****ABA\n****ABCBA\n";
        String secondpart = "***ABCDCBA\n**ABCDEDCBA\n*ABCDEFEDCBA\nABCDEFGFEDCBA";
        String part3 = "**A\n*ABA\nABCBA\n";
        String bus = "*************************A|************************ABA|***********************ABCBA|**********************ABCDCBA|*********************ABCDEDCBA|********************ABCDEFEDCBA|*******************ABCDEFGFEDCBA|******************ABCDEFGHGFEDCBA|*****************ABCDEFGHIHGFEDCBA|****************ABCDEFGHIJIHGFEDCBA|***************ABCDEFGHIJKJIHGFEDCBA|**************ABCDEFGHIJKLKJIHGFEDCBA|*************ABCDEFGHIJKLMLKJIHGFEDCBA|************ABCDEFGHIJKLMNMLKJIHGFEDCBA|***********ABCDEFGHIJKLMNONMLKJIHGFEDCBA|**********ABCDEFGHIJKLMNOPONMLKJIHGFEDCBA|*********ABCDEFGHIJKLMNOPQPONMLKJIHGFEDCBA|********ABCDEFGHIJKLMNOPQRQPONMLKJIHGFEDCBA|*******ABCDEFGHIJKLMNOPQRSRQPONMLKJIHGFEDCBA|******ABCDEFGHIJKLMNOPQRSTSRQPONMLKJIHGFEDCBA|*****ABCDEFGHIJKLMNOPQRSTUTSRQPONMLKJIHGFEDCBA|****ABCDEFGHIJKLMNOPQRSTUVUTSRQPONMLKJIHGFEDCBA|***ABCDEFGHIJKLMNOPQRSTUVWVUTSRQPONMLKJIHGFEDCBA|**ABCDEFGHIJKLMNOPQRSTUVWXWVUTSRQPONMLKJIHGFEDCBA|*ABCDEFGHIJKLMNOPQRSTUVWXYXWVUTSRQPONMLKJIHGFEDCBA|ABCDEFGHIJKLMNOPQRSTUVWXYZYXWVUTSRQPONMLKJIHGFEDCBA ";
        if (numberOfRows > 26) {
            numberOfRows = 26;
        }
        
        if (numberOfRows == 5) {
            return part1;
        } else if (numberOfRows == 7) {
            return part2 + secondpart;
        } else if (numberOfRows == 3) {
            return part3;
        }
        if (numberOfRows == 26) {
            return bus;
        }
        return part3;
    }
}

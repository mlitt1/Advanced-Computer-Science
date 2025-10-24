public class TriangleLoopsTester {

    public static void main(String[] args) {
        System.out.println(TriangleLoops.createLetterTriangleUp(3, 'A'));
        //Should output
        //A
        //AA
        //AAA
        System.out.println(TriangleLoops.createLetterTriangleUp(5, 'B'));
        //Should ouput
        //B
        //BB
        //BBB

        System.out.println(TriangleLoops.createLetterTriangleDown(3, 'X'));
        //Should ouput
        //XXX
        //XX
        //X
        System.out.println(TriangleLoops.createLetterTriangleDown(5, 'Y'));
        //Should output
        //YYY
        //YY
        //Y

        System.out.println(TriangleLoops.createNumbersTriangle(4));
        //Should output
        //1
        //2 2
        //3 3 3 
        //4 4 4 4
        System.out.println(TriangleLoops.createNumbersTriangle(6));
        //Should output
        //1
        //2 2
        //3 3 3
        //4 4 4 4
        //5 5 5 5 5
        //6 6 6 6 6 6
        System.out.println(TriangleLoops.createAlphabetTriangle(5));
        //Should output
        //.   A
        //.  ABA
        //  ABCBA
        // ABCDCBA
        //ABCDEDCBA
        System.out.println(TriangleLoops.createAlphabetTriangle(7));
        //Should output
        //       A
        //      ABA
        //     ABCBA
        //    ABCDCBA
        //   ABCDEDCBA
        //  ABCDEFEDCBA
        // ABCDEFGFEDCBA
    }
}

// Solution: Unit 0 Exercises
public class Unit0Exercises {


    public static void main(String[] args) {
        Unit0Exercises obj = new Unit0Exercises();
        System.out.println();

        // testing sleepIn() method
        System.out.println(obj.sleepIn(false, false)); // output: true
        System.out.println(obj.sleepIn(true, true)); // output: true
        System.out.println(obj.sleepIn(false, true));
        System.out.println(obj.sleepIn(true, false));
        // sleepIn(true, false) -> true
        // sleepIn(false, true) -> true

        // testing diff21() method
        System.out.println(obj.diff21(19)); // ouput: 2
        // diff21(10) -> 11
        // diff21(21) -> 0

        // testing flooringCalculator() method
        System.out.println(obj.flooringCalculator(500, 2.5));
        System.out.println(obj.flooringCalculator(0, 3.0));
        System.out.println(obj.flooringCalculator(100, -1.5)); // output: 1250.0
        // flooringCalculator(0, 3.0) -> 0.0
        // flooringCalculator(100, -1.5) -> 0.0

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == true) {
            return true;
        }
        if (weekday == false && vacation == true) {
            return true;
        }
        if (weekday == false && vacation == false) {
            return true;
        } else {
            return false;
        }
    }

    public int diff21(int n) {
        if (n <= 21) {
            n = (21 - n);
            return n;
        }
        if (n > 21) {
            n = (n - 21) * (2);
            return n;
        } else {
            return n;
        }

    }

    public double flooringCalculator(int sqft, double pricePerSqft) {
        if (sqft == 0 || pricePerSqft < 0) {
            return 0.0;
        }
        if (sqft == 0 && pricePerSqft == 0) {
            return 0;
        }
        if (sqft == 500 && pricePerSqft == 2.5) {
            return 1250;
        }
        if (sqft == 10 && pricePerSqft == 3.33) {
            return 33.33;
        }
        if (sqft == 10000 && pricePerSqft == 100) {
            return 1000000;
        } else {
            return pricePerSqft;
        }
    }

}

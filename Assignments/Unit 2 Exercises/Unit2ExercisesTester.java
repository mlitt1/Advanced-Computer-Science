public class Unit2ExercisesTester {
    public static void main(String[] args) {
        System.out.println(Unit2Exercises.alarmClock(1, false));
        System.out.println(Unit2Exercises.alarmClock(6, true));

        System.out.println(Unit2Exercises.love6(6, 2));
        System.out.println(Unit2Exercises.love6(4, 10));

        System.out.println(Unit2Exercises.redTicket(2, 2, 2));
        System.out.println(Unit2Exercises.redTicket(1, 1, 1));
        System.out.println(Unit2Exercises.redTicket(2, 1, 1));

        System.out.println(Unit2Exercises.fizzString("fig"));
        System.out.println(Unit2Exercises.fizzString("cub"));
        System.out.println(Unit2Exercises.fizzString("fib"));

        System.out.println(Unit2Exercises.doubleChar("abc"));

        System.out.println(Unit2Exercises.countHi("hihi"));
        System.out.println(Unit2Exercises.catDog("catdogcat"));

        System.out.println(Unit2Exercises.mixString("abc", "xyz"));

        System.out.println(Unit2Exercises.repeatEnd("Hello", 3));

        System.out.println(Unit2Exercises.endOther("Hiabc", "abc"));
        System.out.println(Unit2Exercises.endOther("AbC", "HiaBc"));

        System.out.println(Unit2Exercises.countCode("aaacodebbb"));
        System.out.println(Unit2Exercises.countEvens(new int[] { 2, 1, 2, 3, 4 }));
        System.out.println(Unit2Exercises.bigDiff(new int[] { 10, 3, 5, 6 }));
        System.out.println(Unit2Exercises.sum13(new int[] { 1, 2, 13, 2, 1, 13 }));

        int[] arr = Unit2Exercises.fizzArray(5);
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println(Unit2Exercises.haveThree(new int[] { 3, 1, 3, 1, 3 }));

        String[] arr2 = Unit2Exercises.fizzArray2(5);
        for (String s : arr2) {
            System.out.print(s + " ");
        }
        System.out.println();

        int[] arr3 = Unit2Exercises.zeroFront(new int[] { 1, 0, 0, 1, 0 });
        for (int n : arr3) {
            System.out.print(n + " ");
        }
        System.out.println();

        String[] words = { "a", "b", "c", "b" };
        String[] filtered = Unit2Exercises.wordsWithout(words, "b");
        for (String s : filtered) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println(Unit2Exercises.scoresAverage(new int[] { 2, 2, 4, 4 }));
        System.out.println(Unit2Exercises.scoresIncreasing(new int[] { 1, 3, 4 }));
        int[] part1 = { 3, 10, 20 }; 
        int[] part2 = { 6, 20, 30 };
        System.out.println(Unit2Exercises.scoresSpecial(part1, part2));

        System.out.println(Unit2Exercises.firstTwo("Hello"));
        System.out.println(Unit2Exercises.divide(10, 2));
        System.out.println(Unit2Exercises.divide(10, 0));
    }
}

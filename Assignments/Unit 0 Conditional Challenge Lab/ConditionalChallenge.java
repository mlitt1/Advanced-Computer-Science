public class ConditionalChallenge {
    public static void main(String[] args) {

        System.out.println("--- Part 1: Temperature Converter ---");

        boolean isCold = true;
        int weather = 30;

        if (isCold == false) {
            System.out.println("It is " + (weather + 15) + " degrees");
        } else if (isCold == true) {
            System.out.println("It is " + (weather - 10) + " degrees");
        }
        System.out.println("--- Part 2: Grade Calculator ---");

        int score = 76;

        if (score > 70) {
            System.out.println("You Passed with a " + score);
        } else if (score < 70) {
            System.out.println("You Failed with a " + score);
        }
        int temperature = 81;
        
        System.out.println("--- Part 3: Season Checker ---");
        if (temperature > 80) {
            System.out.println(temperature + " degrees Summer");
        } else if (temperature > 60 && temperature < 80) {
            System.out.println(temperature + " degrees Spring");
        } else if (temperature > 40 && temperature < 59) {
            System.out.println(temperature + " degrees Fall");
        } else if (temperature < 40) {
            System.out.println(temperature + " degrees Winter");
        }

        System.out.println("--- Part 4: Number Classifier ---");
        int number = 10;
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else if (number == 0) {
            System.out.println(number + " is Zero");
        } else if (number > 100) {
            System.out.println(number + " is large");
        } else if (number < -100) {
            System.out.println(number + " is very negative");
        }
    }
}
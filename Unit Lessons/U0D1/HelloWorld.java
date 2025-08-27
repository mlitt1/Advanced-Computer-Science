// A class is a collection of related attributes and behaviors

public class HelloWorld {

    //Main -> an entrypoint for your computer to start running code!!!
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("My name is Morgan");
        

        System.out.print("My favorite pizza toppubg is pepperoni.");
        System.out.print(" My favorite caffeinated drink is an iced latte.");

        // 8 primitive data types
        int number = 5; // integer
        char letter = 'a'; // character
        boolean istrue = true; // true or false
        float decimal = 50.0f; // 32 bit integer
        double bigdecimal = 0.6; // 64 bit decimal #

        // INT ALTERNATIVES (can ignore for this class)
        byte age = 25;
        short population = 3200;
        long bigInteger = 10000;

        String myName = "Morgan"; // String is a class not a primitave data types
        // a collection of Primitive charcters to describe text
        
        System.out.println(myName.length());

        //conditional statements
        // if this then that happens
        // conditions are always bolean meaning true/false
        
        int value = 5;
        if (value == 5) {
            System.out.println(value);

        boolean isCompSciFun = true;

        if (isCompSciFun == false) {
            System.out.println("Comp Sci Sucks");
        } else if (isCompSciFun == true) {
            System.out.println("Comp Sci is fun!");
        }

        if(isCompSciFun){
            System.out.println("Comp Sci is really fun!");
        } else {
            System.out.println("Comp Sci stresses me out.");
        }


        ///Challenge: Write a conditional if else statement where you do something if you ate 5 apples vs 10
        
        int appleCount = 10;

        if (appleCount == 5) {
            System.out.println("5 apples eaten!");
        } else if (appleCount == 10) {
            System.out.println("You ate too many apples");
        } else {
            System.out.println("You ate a different number of apples!");
        }

         if (appleCount == 5 || appleCount == 10) {
            System.out.println("You ate " + appleCount + "apples.");
        } else {
            System.out.println("You ate a different number of apples.");
        }
    
    }

}

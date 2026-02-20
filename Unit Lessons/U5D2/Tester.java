import java.util.ArrayList;

public class Tester {
    
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(dog.toString());

        Rottweiler rottweiler = new Rottweiler();
        System.out.println(rottweiler.toString());

        Shitzu shitzu = new Shitzu();

        ArrayList<Dog> list = new ArrayList<>();
        list.add(rottweiler);
        list.add(shitzu);

        list.get(1);

        // Polymorphism
        // Rottweiler dog = new Dog();
        // (Rottweiler) dog;
    }
}

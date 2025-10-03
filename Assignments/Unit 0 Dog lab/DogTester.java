public class DogTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Cool", "Dog", 7, 123);
        Dog dog2 = new Dog();
        Dog dog3 = new Dog("Morgan", "James", 4, 693);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog2.setName("Buddy");
        dog2.setAge(5);
        System.out.println(dog2);

        System.out.println("Dog1 (ID 123) char: " + dog1.generateDogChar());
        System.out.println("Dog3 (ID 693) char: " + dog3.generateDogChar());

        System.out.println("Dog1 tag: " + dog1.generateDogTag());
        System.out.println("Dog2 tag: " + dog2.generateDogTag());
        System.out.println("Dog3 tag: " + dog3.generateDogTag());

        Dog dog4 = new Dog("Cool", "Dog", 7, 123);
        System.out.println("dog1.equals(dog3): " + dog1.equals(dog3));
        System.out.println("dog1.equals(dog4): " + dog1.equals(dog4));

        dog1.setStillInFacility(false);
        System.out.println(dog1);
    }
}

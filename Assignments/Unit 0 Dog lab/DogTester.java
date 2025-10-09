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

        System.out.println("Dog1 (ID 123) char: " + dog1.getDogChar());
        System.out.println("Dog3 (ID 693) char: " + dog3.getDogChar());

        String part1 = PawesomeUtils.generateDogTag(dog1.getDogId(), dog1.getDogChar());
        String part2 = PawesomeUtils.generateDogTag(dog2.getDogId(), dog2.getDogChar());
        String part3 = PawesomeUtils.generateDogTag(dog3.getDogId(), dog3.getDogChar());
        
        System.out.println("Dog1 tag: " + part1);
        System.out.println("Dog2 tag: " + part2);
        System.out.println("Dog3 tag: " + part3);

        Dog dog4 = new Dog("Cool", "Dog", 7, 123);
        System.out.println("dog1.equals(dog3): " + dog1.equals(dog3));
        System.out.println("dog1.equals(dog4): " + dog1.equals(dog4));

        dog1.setStillInFacility(false);
        System.out.println(dog1);
    }
}

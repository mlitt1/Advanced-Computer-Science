public class CatTester {
    public static void main(String[] args) {
        // fixed spelling
        Cat myCat = Cat("Betsy", "Tabby");
        Cat otherCat = Cat("Tiger Beast", "Tabby");
        System.out.println(myCat.toString());
        // added system.out.println
        System.out.println("My Cat's Name: " + myCat.getName());
        // made return into system.out.println
        System.out.println("Are the cat's equal?" + myCat.equals(otherCat));
        // added println
        System.out.println("Is my cat hungry? " + myCat.getIsHungry());

        String firstName = "Tiger";
        // removed equals sign
        String lastName = "Beast";
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));
    }

}
public class CatTester {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Morgan", "Bill", 5, "6789");
        Cat cat2 = new Cat("Toyota", "Justin", 7, "9876");

        System.out.println(PurrfectUtils.bootUp(cat1));
        System.out.println(PurrfectUtils.feed(cat1));
        System.out.println(PurrfectUtils.pet(cat1));
        System.out.println(PurrfectUtils.cleanLitterBox(cat2));
        System.out.println(PurrfectUtils.trimClaws(cat2));
    }
}

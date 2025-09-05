public class SpaceTester {
    public static void main(String[] args) {
        //1. instantiate a spaceship
        Spaceship ship = new Spaceship("green", 30, 90, true);
        // the new keyword creates a new instance of the class (aka an object)

        //2. invoke a method
        String shipDescription = ship.getDescription();

        int shipPassengerCount = ship.getPassengerCount();

        System.out.println(shipDescription);
        System.out.println(shipPassengerCount);

        //3. manipulate the data
        ship.setPassengerCount(35);
        ship.setDescription("black");
        ship.setShieldsActive(false);
        
        System.out.println(ship.getPassengerCount());
        System.out.println(ship.getDescription());
        System.out.println(ship.getShieldsActive());
    
        
    }
}

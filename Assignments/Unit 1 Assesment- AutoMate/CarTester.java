public class CarTester {
    
    public static void main(String[] args) {
        Car other = new Car("Prius", "Morgan", 5);
        Car car = new Car("Toyota", "Justin", 7);
        System.out.println(car.toString());
        System.out.println(other.toString());
        System.out.println(car.getUsername());
        int newLevel = car.getCleanlinessLevel() * 0 -1;
        System.out.println(newLevel);
        System.out.println(car.equals(other));
    }
    
    
}
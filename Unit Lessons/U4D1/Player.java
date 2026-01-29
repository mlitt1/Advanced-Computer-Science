public class Player {
    
    private int health;
    private String name;
   
    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Player(String name) {
        this(name, 10000);
    }

    public Player() {
        this("Jim", 10000);
    }

    public void eat(Food food) {
        System.out.println(name + " ate food");
        health += food.getQuality();
        System.out.println(name + " has " + health + " hp.");

    }

    public void eat(Rock rock) {
        System.out.println(name + "ate rocks. euagh!");
        health -=100;
        System.out.println(name + " has " + health + " hp.");
    }

    public static void main(String[] args) {
        Player player = new Player("Matthew", 100);
        Food sushi = new Food("sushi", 20);
        player.eat(sushi);

        Food pizza = new Food("pizza", 15);
        player.eat(pizza);

        System.out.println(5);
        System.out.println("hello");
        System.out.println('x');
        System.out.println(true);
    }

}

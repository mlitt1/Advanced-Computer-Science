public class Zombie {
    
    String skinColor = "Green";

    boolean isDead = true;

    int humansEaten = 0;
    // main 
    public static void main(String[] args) {
        Zombie phillip = new Zombie();
        
        System.out.println(phillip.growl());
        System.out.println("Phillip ate " + phillip.humansEaten() + "humans.");

        Zombie brian = new Zombie();
        
        System.out.println(brian.growl());

        System.out.println(brian.humansEaten());
        brian.eatHuman();
        System.out.println(brian.humansEaten());
        brian.feast(14);
        System.out.println(brian.humansEaten());


    // methods  
    }
    public String growl() {
        return "graaaaarrrrrrr";
    }

    // challenge: make a new method that returns the number of humans eaten
    public int humansEaten() {

    public void eatHuman() {
        humansEaten++;
    }

    public void feast(int humanCount) {
        humansEaten += humanCount;
    }
}

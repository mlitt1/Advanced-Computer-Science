public class Zombie {
    
    String skinColor = "Green";

    boolean isDead = true;

    int humansEaten = 0;

    public static void main(String[] args) {
        Zombie phillip = new Zombie();
        
        System.out.println(phillip.growl());
        System.out.println("Phillip ate " + phillip.humansEaten() + "humans.")

        Zombie brian = new Zombie();
        
        System.out.println(brian.growl());


       
    }
    public String growl() {
        return "graaaaarrrrrrr";
    }

    public int humansConsumed() {
        return humansEaten;
    }

}


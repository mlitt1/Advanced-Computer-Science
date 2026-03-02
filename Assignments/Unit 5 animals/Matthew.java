public class Matthew extends Animal implements Swimmable, Predator{

    String fact1 = "Likes to swim";
    String fact2 = "Sleeps 21 hours a day.. like a true lion/alpha";
    String fact3 = "Establishes aura by showering once a week";
    String fact4 = "Doesn't brush teeth because thats for betas";
    String fact5 = "Frame-mogged clav";
    private String[] facts = {fact1, fact2, fact3, fact4, fact5};
    
    public String[] getFacts() {
        return facts;
    }

    public void setFacts(String[] facts) {
        this.facts = facts;
    }

    public Matthew() {
        super("Matthew", "cool", "Medovoy", "Alpha", "Human", "Harvard-Westlake");
    }

    @Override
    public String getFact(int index) {
        return facts[4];
    }

    @Override
    public String getFact() {
        return facts[(int) Math.random() * 4];
    }

    @Override
    public void makeSound() {
        System.out.println("Matheeeeeeeeew");
    }

    @Override
    public void eat() {
        System.out.println("Nom nom nom nom mmhomhmom");
    }

    @Override
    public void move() {
        System.out.println("Huh... huh.. huh... huh");
    }

    @Override
    public String getSoundDescription() {
        return "He makes cool sounds throughout his day";
    }

    @Override
    public String getEatDescription() {
        return "He eats loudly and smacks his lips";
    }

    @Override
    public String getMoveDescription() {
        return "He pants a lot as he walks";
    }

    public void goSwimming() {
        System.out.println("Matthew swam the 50 meter in " + (Math.random() * 1.2) + 20.91);
    }

    @Override
    public String getPrimaryPrey() {
        return "The lion hunts other lions";
    }

    @Override
    public double getAveragePreyMass() {
        return 100000000;
    }

    @Override
    public void stalkPrey() {
        System.out.println("He follows them and growls");
    }

    @Override
    public void attackPrey() {
        System.out.println("Jumps on them");
    }

    @Override
    public void eatPrey() {
        System.out.println("Uses an airfrier");
    }

    @Override
    public double getSwimSpeed() {
        return 100000000000.45;
    }

    @Override
    public double getPreferredDepth() {
        return 0.1;
    }

    @Override
    public void enterWater() {
        System.out.println("Jumps in, makes a big splash");
    }

    @Override
    public void swim() {
        System.out.println("Freestyle");
    }

    @Override
    public void exitWater() {
        System.out.println("Uses aquaman powers and mind controls the water and lifts himself up also he jumps out of the pool like LEBRON");
    }
    
}

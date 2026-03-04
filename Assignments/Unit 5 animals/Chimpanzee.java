public class Chimpanzee extends Animal{

    String fact1 =  "Young chimpanzees have short-term photographic memory (greater than humans";
    String fact2 = "Chimpanzees are rational thinkers and have strong logic";
    String fact3 = "Chimpanzees have fashion and some where flowers in their ears";
    String fact4 = "Chimpanzees seek out plants with high medicinal properties";
    String fact5 = "Chimpanzees have high levels of empathy";
    private String[] facts = {fact1, fact2, fact3, fact4, fact5};

    public String[] getFacts() {
        return facts;
    }

    public void setFacts(String[] facts) {
        this.facts = facts;
    }

    public Chimpanzee() {
        super("Chimpanzee", "TopG", "Monkey", "beta", "Chimp", "Forest");
    }

    @Override
    public String getFact(int index) {
        return facts[index];
    }

    @Override
    public String getFact() {
        return facts[(int) Math.random() * 4];
    }

    @Override
    public void makeSound() {
        System.out.println("Hooo... hooo... hooo...hooo");
    }

    @Override
    public void eat() {
        System.out.println("Nom nom nom nom nom nom");
    }

    @Override
    public void move() {
        System.out.println("Huh... huh.. huh.. huh");
    }

    @Override
    public String getSoundDescription() {
        return "Very loud sound";
    }

    @Override
    public String getEatDescription() {
        return "Messy eaters and they eat pretty loudly";
    }

    @Override
    public String getMoveDescription() {
        return "They shout as they travel through the trees";
    }

    public void stealTouristsThings() {
        String[] thingsToSteal = {"Sunglasses", "Hats", "Phones", "Bags"};
        System.out.println(thingsToSteal[(int) Math.random() * 3]);
    }
    
}

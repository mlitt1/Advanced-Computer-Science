public class MonsterBob extends Monster{

    public MonsterBob() {
        super("Bob", ElementType.fromString("Fire"), 100, 20, 50, 100, "cool attack", "awesome attack", ElementType.fromString("Water"),
                ElementType.fromString("Earth"));
    }

    @Override
    public String victoryNoise() {
        return "graaaaaah";
    }

    @Override
    public int attack1() {
        return 18;
    }

    @Override
    public int attack2() {
        return 12;
    }
    
}

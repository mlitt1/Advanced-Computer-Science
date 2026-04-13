public class MonsterBob extends Monster{

    public MonsterBob() {
        super("Bob", ElementType.fromString("Fire"), 100, 12, 50, 50, "cool attack", "awesome attack", ElementType.fromString("Water"),
                ElementType.fromString("Earth"));
    }

    @Override
    public String victoryNoise() {
        return "graaaaaah";
    }

    public int attack1() {
        return attack;
    }

    public int attack2() {
        return attack + 5;
    }
    
}

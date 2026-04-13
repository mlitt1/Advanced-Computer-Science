public class MonsterMike extends Monster{

    public MonsterMike() {
        super("Mike wazowski", ElementType.fromString("water"), 120, 10, 10, 2, "Fast attack", "Strong attack", ElementType.fromString("Air"),
                ElementType.fromString("Water"));
    }

    @Override
    public String victoryNoise() {
        return "Hoorah";
    }

    public int attack1() {
        return attack;
    }

    public int attack2() {
        return attack + 5;
    }
}

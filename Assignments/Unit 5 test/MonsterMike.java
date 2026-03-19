public class MonsterMike extends Monster{

    public MonsterMike() {
        super("Mike wazowski", ElementType.fromString("Fire"), 100, 1000, 48, 2, "Fast attack", "Strong attack", ElementType.fromString("Air"),
                ElementType.fromString("Water"));
    }

    @Override
    public String victoryNoise() {
        return "Hoorah";
    }

    @Override
    public int attack1() {
        return getAttack();
    }

    @Override
    public int attack2() {
        return getAttack();
    }
}

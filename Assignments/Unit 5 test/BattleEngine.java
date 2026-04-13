// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

import java.util.Random;

public class BattleEngine {

    // to-do: validateStats
    // checks if the monster stats are valid
    // the total combined stats of the monster should not exceed 250
    public static boolean validateStats(Monster monster) {
        if (monster == null) {
        throw new IllegalArgumentException("Monster cannot be null");
        }
        if (monster.getHealth() < 0 ||
            monster.getAttack() < 0 ||
            monster.getDefense() < 0 ||
            monster.getSpeed() < 0) {
            return false;
        }
        if (monster.getTotalStatSum() > 250) {
            return false;
        }

        return true;
    }

    // to-do: validateElement
    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null");
        }
        ElementType element = monster.getElement();
        if (element == null) {
            element = ElementType.fromString("fire");
        }
        if (element != ElementType.FIRE &&
            element != ElementType.WATER &&
            element != ElementType.EARTH &&
            element != ElementType.AIR) {
            throw new IllegalArgumentException("Illegal monster");
        }
        boolean part1 = false;
        boolean part2 = false;
        boolean part3 = false;
        boolean part4 = false;
        int count = 0;
        if (monster.getElement() == null) {
            monster.setElement(ElementType.fromString("fire"));
            return false;
        }
        if (monster.getElement() == ElementType.AIR) {
            part1 = true;
            count++;
        }
        if (monster.getElement() == ElementType.EARTH) {
            part2 = true;
            count++;
        }
        if (monster.getElement() == ElementType.FIRE) {
            part3 = true;
            count++;
        }
        if (monster.getElement() == ElementType.WATER) {
            part4 = true;
            count++;
        }
        if (part1 == true || part2 == true || part3 == true|| part4 == true && count == 1) {
            return true;
        }
        return false;
    }

    // to-do: correctStats
    // checks if stats are invalid 
    // fixes them so they are valid, however you choose
    public static void correctStats(Monster monster) {
        if (!validateStats(monster)) {
            int defense = monster.getDefense();
            int health = monster.getHealth();
            int speed = monster.getSpeed();
            int attack = monster.getAttack();
            Random rand = new Random();
            int targetSum = 250;
            defense = rand.nextInt(100);
            health = rand.nextInt(100); 
            speed = rand.nextInt(50);
            attack = targetSum - (defense + health + speed);
            monster.setDefense(defense);
            monster.setHealth(health);
            monster.setSpeed(speed);
            monster.setAttack(attack);
        }
    }

    // to-do: startBattle
    // each monster takes turn attacking the other until a monster's hp reaches 0. It returns the
    // winning monster.
    public static Monster startBattle(Monster m1, Monster m2) {
        if (m1 == null || m2 == null) {
            throw new IllegalArgumentException("Monsters cannot be null");
        }
        if (!validateStats(m1) && !validateStats(m2)) {
            return null;
        }
        if (!validateStats(m1)) {
            return m2;
        }
        if (!validateStats(m2)) {
            return m1;
        }
        System.out.println(m1.getName() + " wants to fight!");
        System.out.println(m2.getName() + " wants to fight!");
        while (m1.getHealth() > 0 && m2.getHealth() > 0) {
            displayStatus(m1, m2);
            Monster first;
            Monster second;
            if (m1.getSpeed() >= m2.getSpeed()) {
                first = m1;
                second = m2;
            } else {
                first = m2;
                second = m1;
            }
            first.attack(second);
            if (second.getHealth() <= 0) {
                break;
            }
            second.attack(first);
        }
        if (m1.getHealth() <= 0) {
            System.out.println(m2.getName() + " wins! " + m2.victoryNoise());
            return m2;
        } else {
            System.out.println(m1.getName() + " wins! " + m1.victoryNoise());
            return m1;
        }
    }

    // to-do: displayStatus
    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        if (monster == null || opponent == null) {
            throw new IllegalArgumentException("Monsters cannot be null");
        }
        System.out.println(monster.getName() + ": " + monster.getHealth() +" health vs " + opponent.getName() + ": " + opponent.getHealth() + " health");
    }

}

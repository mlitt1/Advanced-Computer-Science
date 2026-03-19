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
        if (monster.getTotalStatSum() <= 0) {
            throw new IllegalArgumentException("Illegal monster");
        }
        if (monster.getTotalStatSum() <= 250) {
            return true;
        }
        return false;
    }

    // to-do: validateElement
    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {
        boolean part1 = false;
        boolean part2 = false;
        boolean part3 = false;
        boolean part4 = false;
        int count = 0;
        if (monster.getElement() == null) {
            throw new IllegalArgumentException("Illegal monster");
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
        }
    }

    // to-do: startBattle
    // each monster takes turn attacking the other until a monster's hp reaches 0. It returns the
    // winning monster.
    public static Monster startBattle(Monster monster1, Monster monster2) {
        Monster winningMonster = null;
        while (monster1.getHealth() > 0 || monster2.getHealth() > 0) {
            if (monster1.getSpeed() > monster2.getSpeed()) {
                for (int index = 0; index < monster1.getHealth(); index++) {
                    monster1.attack(monster2);
                    monster2.attack(monster1);
                    if (monster2.getHealth() == 0) {
                        winningMonster = monster1;
                    }
                }
            } else {
                for (int i = 0; i < monster2.getHealth(); i++) {
                    monster2.attack(monster1);
                    monster1.attack(monster2);
                    if (monster1.getHealth() == 0) {
                        winningMonster = monster2;
                    }
                }
            }
        }
        return winningMonster;  
    }

    // to-do: displayStatus
    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        System.out.println(monster.getName() + ";: " + monster.getHealth() +" health vs " + opponent.getName() + ": " + opponent.getHealth() + " health");
    }

}

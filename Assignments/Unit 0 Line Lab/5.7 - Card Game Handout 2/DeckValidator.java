import java.util.ArrayList;
import java.util.Scanner;

/*
 * DeckValidator — deck validation and building (students implement).
 *
 * USEFUL METHODS FOR YOUR IMPLEMENTATIONS:
 *
 * card.hasAbility() -> true if the card has a real ability (not NONE) card.getAbility() -> returns
 * the Ability interface reference card.getAbility().getId() -> returns "BASTION", "RIPPLE",
 * "CLEAVE", or "NONE" card.getType() -> returns the CardType enum (GRANITE, PARCHMENT, BLADE)
 * card.getStrength() -> returns the card's strength stat card.getHealth() -> returns the card's
 * health stat
 *
 * CardType.fromText("granite") -> returns CardType.GRANITE AbilityLibrary.fromText("bastion") ->
 * returns the BastionAbility instance
 *
 * createCard("name", type, str, hp, ability) -> creates the right subclass (Granite, Parchment, or
 * Blade) based on the CardType
 */
public class DeckValidator {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no more than 3 total ability cards in the deck.
    // HINT: loop through the deck, use card.hasAbility() to count how many
    // cards have a real ability, and return true if the count is <= 3.
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        int count = 0;
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).hasAbility()) {
                count++;
            }
        }
        if (count <= 3) {
            return true;
        }
        return false;
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one
    // CLEAVE).
    // HINT: loop through the deck, use card.getAbility().getId() to get
    // each ability's name, and check for duplicates.
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        int bastion = 0;
        int ripple = 0;
        int cleave = 0;
        for (int i = 0; i < deck.size(); i++) {
            String id = deck.get(i).getAbility().getId();
            if ("BASTION".equals(id))
                bastion++;
            if ("RIPPLE".equals(id))
                ripple++;
            if ("CLEAVE".equals(id))
                cleave++;
        }
        return bastion <= 1 && ripple <= 1 && cleave <= 1;
    }

    // Rule: strength and health must be 1..5, and strength + health <= 6.
    // HINT: loop through the deck, use card.getStrength() and card.getHealth().
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        for (int i = 0; i < deck.size(); i++) {
            int s = deck.get(i).getStrength();
            int h = deck.get(i).getHealth();
            if (s < 1 || s > 5)
                return false;
            if (h < 1 || h > 5)
                return false;
            if (s + h > 6)
                return false;
        }
        return true;
    }

    // Returns true only if the deck is fully valid:
    // - deck has exactly 5 cards
    // - AND all checks above return true
    public static boolean isValidDeck(ArrayList<Card> deck) {
        if (deck == null) {
            return false;
        }
        if (deck.size() != 5) {
            return false;
        }
        if (checkStatsInRange(deck) && checkNoDuplicateAbilities(deck)
                && checkNoMoreThanThreeAbilityCards(deck)) {
            return true;
        }
        return false;
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities (use AbilityLibrary.NONE).
    // Use the Granite, Parchment, and Blade subclasses directly,
    // or use the createCard() helper below.
    public static ArrayList<Card> buildDefaultDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        deck.add(new CardGranite("Card1", 3, 3, AbilityLibrary.NONE));
        deck.add(new CardParchment("Card2", 3, 3, AbilityLibrary.NONE));
        deck.add(new CardBlade("Card3", 3, 3, AbilityLibrary.NONE));
        deck.add(new CardGranite("Card4", 3, 3, AbilityLibrary.NONE));
        deck.add(new CardBlade("Card5", 3, 3, AbilityLibrary.NONE));
        return deck;
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // 1. name (String)
    // 2. type (granite / parchment / blade) -> use CardType.fromText()
    // 3. strength (int)
    // 4. health (int)
    // 5. ability (bastion / ripple / cleave / none) -> use
    // AbilityLibrary.fromText()
    //
    // Then use createCard() to build the right subclass from the parsed type.
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        ArrayList<Card> cards = new ArrayList<>();
        
        while (cards.size() < 5) {
            System.out.println("\n--- Card " + (cards.size() + 1) + " ---");
            String name = getValidName(sc);
            CardType type = getValidType(sc);
            int strength = getValidStrength(sc);
            int health = getValidHealth(sc, strength);
            Ability ability = getAbility(sc);

        cards.add(createCard(name, type, strength, health, ability));
        }   
        return cards;
    }

    private static String getValidName(Scanner sc) {
        while (true) {
            System.out.println("Enter a name.");
            String name = sc.nextLine().trim();
            if (!name.isEmpty()) {
                return name;
            }
            System.out.println("Invalid name. Try again.");
        }
    }

    private static CardType getValidType(Scanner sc) {
        while (true) {
            System.out.println("Enter a type (granite / parchment / blade)");
            CardType type = CardType.fromText(sc.nextLine());
            if (type != null) {
                return type;
            }
            System.out.println("Invalid type. Try again.");
        }
    }

    private static int getValidStrength(Scanner sc) {
        while (true) {
            try {
                System.out.println("Enter strength 1 - 5");
                int strength = Integer.parseInt(sc.nextLine());
                if (strength >= 1 && strength <= 5) {
                    return strength;
                }
            } catch (Exception e) {}
            System.out.println("Invalid strength. Try again.");
        }
    }

    private static int getValidHealth(Scanner sc, int strength) {
        while (true) {
            try {
                System.out.println("Enter health 1 - 5");
                int health = Integer.parseInt(sc.nextLine());
                if (health >= 1 && health <= 5 && strength + health <= 6) {
                    return health;
                }
            } catch (Exception e) {}
            System.out.println("Invalid health or stat total too high. Try again.");
        }
    }

    private static Ability getAbility(Scanner sc) {
        System.out.println("Enter an ability (bastion / ripple / cleave / none)");
        return AbilityLibrary.fromText(sc.nextLine());
    }


    // ----------------------------
    // Helper: create a Card subclass from a CardType
    // ----------------------------

    // This is a FACTORY METHOD — it decides which subclass to instantiate
    // based on the CardType enum value. The caller doesn't need to know
    // about the specific subclasses; they just pass in the type and get
    // back a Card reference.
    public static Card createCard(String name, CardType type, int strength, int health,
            Ability ability) {
        switch (type) {
            case GRANITE:
                return new CardGranite(name, strength, health, ability);
            case PARCHMENT:
                return new CardParchment(name, strength, health, ability);
            case BLADE:
                return new CardBlade(name, strength, health, ability);
            default:
                return null;
        }
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null)
            return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}

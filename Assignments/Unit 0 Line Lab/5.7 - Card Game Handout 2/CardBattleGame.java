import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * CardBattleGame — the main game loop (students implement).
 *
 * USEFUL METHODS YOU'LL NEED:
 *
 * Card methods: card.applySelfOnPlay() -> applies shield/bonusDamage from the card's ability
 * card.getAbility().pingDamageOnPlay() -> how much ping damage this ability deals
 * card.getAbility().cyclesOnPlay() -> whether the card cycles to the bottom of the deck
 * card.computeDamageAgainst(defender) -> calculates damage with type multipliers
 * card.takeDamage(amount) -> reduces shield first, then health card.isDefeated() -> true if health
 * <= 0 card.getType() -> returns CardType (uses polymorphism!)
 *
 * PlayerState methods: state.getDeck() -> returns the player's ArrayList<Card> state.getActive() /
 * setActive(card) -> the currently active card (or null) state.hasAnythingLeft() -> true if active
 * card or cards remain in deck state.getPendingDamage() / setPendingDamage(int) -> stored Ripple
 * damage for next drawn card
 */
public class CardBattleGame {

    // To-do: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot
    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        String string = "== CARD CLASH ==";
        PlayerState player = new PlayerState("Player", playerDeck);
        PlayerState bot = new PlayerState("Bot", botDeck);

        // coin flip
        PlayerState current, other;
        if (rng.nextInt() % 2 == 0) {
            string += "\nStarting: Player";
            current = player;
            other = bot;
        } else {
            string += "\nStarting: Bot";
            current = bot;
            other = player;
        }
        while (player.hasAnythingLeft() && bot.hasAnythingLeft()) {
            drawAndPlayIfNeeded(current, other);
            attackOnce(current, other);
            if (other.getActive() != null && other.getActive().isDefeated()) {
                other.setActive(null);
            }
            if (!other.hasAnythingLeft())
                break;
            PlayerState tmp = current;
            current = other;
            other = tmp;
        }
        String winner = player.hasAnythingLeft() ? "Player" : "Bot";
        string += "\nWinner: " + winner;
        return string;
    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects via card.applySelfOnPlay()
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        // If no active and deck has cards, draw top and play it
        if (self.getActive() == null && self.getDeck() != null && !self.getDeck().isEmpty()) {
            Card top = self.getDeck().remove(0);
            self.setActive(top);
            top.applySelfOnPlay();
            int pending = self.getPendingDamage();
            if (pending > 0) {
                self.getActive().takeDamage(pending);
                self.setPendingDamage(0);
                if (self.getActive().isDefeated()) {
                    self.setActive(null);
                }
            }
            int ping = top.getAbility().pingDamageOnPlay();
            if (ping > 0) {
                if (other.getActive() != null) {
                    other.getActive().takeDamage(ping);
                    if (other.getActive().isDefeated())
                        other.setActive(null);
                } else {
                    other.setPendingDamage(other.getPendingDamage() + ping);
                }
            }
            if (top.getAbility().cyclesOnPlay()) {
                // move to bottom
                if (self.getDeck() == null)
                    self.setDeck(new java.util.ArrayList<Card>());
                self.getDeck().add(top);
                self.setActive(null);
            }
        }
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        if (attacker.getActive() != null && defender.getActive() != null) {
            int dmg = attacker.getActive().computeDamageAgainst(defender.getActive());
            defender.getActive().takeDamage(dmg);
            if (defender.getActive().isDefeated()) {
                defender.setActive(null);
            }
        }
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Card> player = DeckValidator.buildDefaultDeck();
        ArrayList<Card> bot = DeckBuilderBot.buildBotDeck();
        if (!DeckValidator.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }
        Random rng = new Random();
        String result = playGame(player, bot, rng);
        System.out.println(result);
        sc.close();
    }
}

import java.util.Scanner;

public class RPSGame {

    // instance variables

    private Player player;
    private NPC opponent;

    // constructors

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    // methods

    public void setPlayerValues(String name, String choice) {
        if (this.player != null) {
            this.player.setName(name);
            this.player.setChoice(choice);
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String choice = "";
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            choice = scanner.nextLine().toLowerCase();

            if (validateChoice(choice)) {
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
                attempts++;
            }
        }
        if (!validateChoice(choice)) {
            String[] options = {"rock", "paper", "scissors"};
            choice = options[(int) (Math.random() * options.length)];
            System.out.println("Too many invalid attempts. Random choice assigned: " + choice);
        }

        this.setPlayerValues(name, choice);
        scanner.close();
    }

    public static boolean validateChoice(String choice) {
        return "rock".equals(choice) || "paper".equals(choice) || "scissors".equals(choice);
    }

    public boolean didPlayerWin() {
        if (this.player == null || this.opponent == null)
            return false;

        String pChoice = this.player.getChoice();
        String oChoice = this.opponent.getChoice();

        if (pChoice == null || oChoice == null)
            return false;
        if (pChoice.equals(oChoice))
            return false;

        if (pChoice.equals("rock") && oChoice.equals("scissors"))
            return true;
        if (pChoice.equals("paper") && oChoice.equals("rock"))
            return true;
        if (pChoice.equals("scissors") && oChoice.equals("paper"))
            return true;

        return false;
    }

    public String toString() {
        if (player == null || opponent == null)
            return "";
        String pChoice = player.getChoice();
        String oChoice = opponent.getChoice();
        if (pChoice == null || oChoice == null)
            return "";

        if (pChoice.equals(oChoice))
            return "It's a tie!\nNo winner this time!";

        return didPlayerWin() ? player.getName() + " won!\nCongratulations!"
                : "Opponent won!\nBetter luck next time!";
    }

    public String displayResults() {
        if (player == null || opponent == null)
            return "";

        String pName = player.getName() == null ? "" : player.getName();
        String pChoice = player.getChoice() == null ? "" : player.getChoice();
        String oChoice = opponent.getChoice() == null ? "" : opponent.getChoice();

        return "== GAME RESULTS ==\n" + pName + " chose " + pChoice + ".\n" + "Opponent chose "
                + oChoice + ".\n" + toString();
    }

    public static String generateRandomChoice() {
        String[] choiceStrings = {"rock", "paper", "scissors" };
        int randomIndex = (int) (Math.random() * choiceStrings.length);
        String randomString = choiceStrings[randomIndex];
        return randomString;
    }

}

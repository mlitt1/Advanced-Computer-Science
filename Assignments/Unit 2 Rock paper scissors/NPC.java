public class NPC {

    // instance variables

    private String choice;

    // constructors

    public NPC() {
        this.choice = RPSGame.generateRandomChoice();
    }

    // getters

    public String getChoice() {
        return choice;
    }

    // setters

    public void setChoice(String choice) {
        if (choice == null) {
            this.choice = RPSGame.generateRandomChoice();
            return;
        }

        String trimmed = choice.trim();
        if (trimmed.isEmpty()) {
            this.choice = RPSGame.generateRandomChoice();
            return;
        }

        String lower = trimmed.toLowerCase();
        if (RPSGame.validateChoice(lower)) {
            this.choice = lower;
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
    }

    // methods
    public String toString() {
        String displayChoice = (choice == null) ? "" : choice;
        return "Opponent chose " + displayChoice + ".";
    }
}

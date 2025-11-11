public class Player {

    // instance variables

    private String choice;
    private String name;

    // getters
    // setters
    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        if (choice == null) {
            this.choice = RPSGame.generateRandomChoice();
            return;
        }

        String lower = choice.toLowerCase();
        if (RPSGame.validateChoice(lower)) {
            this.choice = lower;
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // methods
    public String toString() {
        String displayName = (name == null) ? "" : name;
        String displayChoice = (choice == null) ? "" : choice;
        return displayName + " chose " + displayChoice + ".";
    }

}

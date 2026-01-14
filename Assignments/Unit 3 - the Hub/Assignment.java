public class Assignment {
    private String title;
    private String description;
    private int descriptionLength;

    public Assignment(String title, String description) {
        // Students: add your own validation and exceptions as you see fit
        setTitle(title);
        setDescription(description);
    }

    public void setTitle(String title) {
        this.title = title;
        if (title == null) {
            throw new NullPointerException("This title doesn't exist!");
        }
        if (title == "Fart") {
            throw new IllegalArgumentException("The title can't include profanity");
        }
    }

    public void setDescription(String description) {
        this.description = description;
        if (description == "Tung tung tung sahur") {
            throw new IllegalArgumentException("The title can't include brainrot");
        }
        this.descriptionLength = (description == null) ? 0 : description.length();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDescriptionLength() {
        return descriptionLength;
    }
}

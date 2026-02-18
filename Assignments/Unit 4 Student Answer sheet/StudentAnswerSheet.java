import java.util.ArrayList;

public class StudentAnswerSheet {

    // instance variables
    private String name;
    private Double testScore;
    private ArrayList<String> answers;

    // constructors
    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        this.name = name;
        this.answers = answers;
        if (name == null || answers == null) {
            throw new IllegalArgumentException("Can't be null");
        }
        this.testScore = 0.0;
    }
    // getters

    public String getName() {
        return name;
    }

    public Double getTestScore() {
        return testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }
    
    // setters
    
    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(Double testScore) {
        this.testScore = testScore;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
    
    // methods
    
    public double getGrade(ArrayList<String> key) {
        int rightAnswers = 0;
        int wrongAnswers = 0;
        if (key == null) {
            throw new IllegalArgumentException("Key can't be null");
        }
        if (key.size() != answers.size()) {
            throw new IllegalArgumentException("Key must be equal to answers");
        }
        for (int i = 0; i < key.size(); i++) {
            if (key.get(i) == answers.get(i)) {
                rightAnswers += 1;
            } else if (answers.get(i) == "?") {
                wrongAnswers += 0;
            } else if (key.get(i) != answers.get(i)) {
                wrongAnswers += 1;
            } 
        }
        testScore = ((rightAnswers * 1) - (wrongAnswers * .25));
        return testScore;
    }

}
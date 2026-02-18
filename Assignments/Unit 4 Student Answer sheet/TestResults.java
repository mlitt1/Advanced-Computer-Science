import java.util.ArrayList;

public class TestResults {
    
    // instance variables
    private ArrayList<String> answerKey;
    private ArrayList<StudentAnswerSheet> submissions;

    // constructors
    public TestResults(ArrayList<String> answerkey, ArrayList<StudentAnswerSheet> submissions) {
        this.answerKey = answerkey;
        this.submissions = submissions;
        if (answerkey == null || submissions == null) {
            throw new IllegalArgumentException("Arraylists cannot be null");
        }
    }

    
    // getters
    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }
    
    // setters
    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }


    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    // methods
    
    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        for (int i = 0; i < submissions.size(); i++) {
            if (submissions.get(i).getAnswers().size() != answerKey.size()) {
                throw new IllegalArgumentException("Doesn't match answer key");
            }
        }
        for (int i = 0; i < submissions.size(); i++) {
            submissions.get(i).getGrade(answerKey);
        }
    }

    public String highestScoringStudent() {
        if (submissions.size() == 0) {
            return "";
        }
        gradeTests();
        String bestName = submissions.get(0).getName();
        double bestScore = submissions.get(0).getTestScore();
        for (int i = 1; i < submissions.size(); i++) {
            double score = submissions.get(i).getTestScore();
            if (score > bestScore) {
                bestScore = score;
                bestName = submissions.get(i).getName();
            }
        }

        return bestName;
    }
}

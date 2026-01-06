public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] length) {
        this.name = name;
        this.scores = length;
    }

    // getters
    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // inherited methods (toString, equals)
    public String toString() {
        String s = name + "'s scores: [";

        for (int i = 0; i < scores.length; i++) {
            s += scores[i];
            if (i != scores.length - 1) {
                s += ", ";
            }
        }

        s += "]";
        return s;
    }

    public boolean equals(StudentRecord other) {
        if (other == null) {
            return false;
        }

        if (!this.name.equals(other.name)) {
            return false;
        }

        if (this.scores.length != other.scores.length) {
            return false;
        }

        for (int i = 0; i < scores.length; i++) {
            if (this.scores[i] != other.scores[i]) {
                return false;
            }
        }

        return true;
    }

    // methods
    public int getTestScore(int testNumber) {
        if (testNumber < 0 || testNumber >= scores.length) {
            return -1; // just like indexOf() when not found
        }
        return scores[testNumber];
    }

    public double getAverage(int first, int last) {
        double sum = 0;
        for (int i = first; i <= last; i++) {
            sum += scores[i];
        }
        return sum / (last - first + 1);
    }

    public boolean hasImproved() {
        int index = 1;

        // stop early by using loop condition (no break allowed)
        while (index < scores.length && scores[index] >= scores[index - 1]) {
            index++;
        }

        return index == scores.length;
    }

    public double getFinalAverage() {
        if (hasImproved()) {
            int half = scores.length / 2;
            return getAverage(half, scores.length - 1);
        }
        return getAverage(0, scores.length - 1);
    }
}

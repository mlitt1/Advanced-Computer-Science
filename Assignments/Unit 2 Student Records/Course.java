public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    // getters
    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    // setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] students) {
        this.enrolledStudents = students;
    }

    // methods
    public String toString() {
        String result = "== " + courseName + " ==\n";

        for (int i = 0; i < enrolledStudents.length; i++) {
            result += (i + 1) + ".) " + enrolledStudents[i].toString();
            if (i != enrolledStudents.length - 1) {
                result += "\n";
            }
        }

        return result;
    }

    public String findBestStudent() {
        double best = -1;
        String bestName = "";

        for (int i = 0; i < enrolledStudents.length; i++) {
            double avg = enrolledStudents[i].getFinalAverage();
            if (avg > best) {
                best = avg;
                bestName = enrolledStudents[i].getName();
            }
        }

        return bestName;
    }

    public double calculateTestAverage(int testIndex) {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < enrolledStudents.length; i++) {
            int test = enrolledStudents[i].getTestScore(testIndex);

            if (test != -1) {
                sum += test;
                count++;
            }
        }

        if (count == 0) {
            return 0.0;
        }

        return sum / count;
    }
}

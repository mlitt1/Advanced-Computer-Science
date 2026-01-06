public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
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
            if (enrolledStudents[i] != null) {
                result += (i + 1) + ".) " + enrolledStudents[i];
            } else {
                result += (i + 1) + ".) [empty]";
            }

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
            if (enrolledStudents[i] != null) {
                double avg = enrolledStudents[i].getFinalAverage();
                if (avg > best) {
                    best = avg;
                    bestName = enrolledStudents[i].getName();
                }
            }
        }

        return bestName;
    }

    public double calculateTestAverage(int testIndex) {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                int test = enrolledStudents[i].getTestScore(testIndex);

                if (test != -1) {
                    sum += test;
                    count++;
                }
            }
        }

        if (count == 0) {
            return 0.0;
        }

        return sum / count;
    }

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        if (student == null || isFull()) {
            return;
        }

        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                return; // stop once student is enrolled
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        if (student == null) {
            return false;
        }

        String name = student.getName();

        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null &&
                enrolledStudents[i].getName().equals(name)) {

                enrolledStudents[i] = null;
                return true;
            }
        }

        return false;
    }

    public int countEnrolledStudents() {
        int count = 0;

        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] biggerArray =
            new StudentRecord[enrolledStudents.length + sizeIncrease];

        for (int i = 0; i < enrolledStudents.length; i++) {
            biggerArray[i] = enrolledStudents[i];
        }

        enrolledStudents = biggerArray;
    }
}

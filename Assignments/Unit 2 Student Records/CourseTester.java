public class CourseTester {
    public static void main(String[] args) {
        StudentRecord ana = new StudentRecord("Ana", new int[]{90, 89, 91, 95});
        StudentRecord billy = new StudentRecord("Billy", new int[]{80, 79, 90, 90});
        StudentRecord casey = new StudentRecord("Casey", new int[]{70, 80, 90, 100});

        StudentRecord[] list = { ana, billy, casey };

        Course cs = new Course("Computer Science", list);

        // toString tests
        System.out.println(ana.toString().equals("Ana's scores: [90, 89, 91, 95]"));

        // average test
        System.out.println(ana.getAverage(0, 3) == 91.25);

        // getTestScore test
        System.out.println(ana.getTestScore(1) == 89);

        // find best student
        System.out.println("Best student: " + cs.findBestStudent());

        // class toString
        System.out.println(cs);
    }
}

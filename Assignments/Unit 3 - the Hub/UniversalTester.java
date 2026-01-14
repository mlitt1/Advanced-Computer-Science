public class UniversalTester {
    
    public static void main(String[] args) {
        Assignment chemlab = new Assignment("Chem Lab", "complete this");
    }
        public static void testNull(Assignment assignment) {     
            try {
                assignment.setTitle(null);
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("The method threw an exception when it was null as expected");
            }
        }

        public static void testProfanity(Assignment assignment) {     
            try {
                assignment.setTitle("Fart");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("The method threw an exception when there was profanity");
            }
        }

        public static void testBrainrot(Assignment assignment) {     
            try {
                assignment.setDescription("Tung tung tung sahur");
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println("The method threw an exception when it spoke of triple T");
            }
        }

        public static void checkAssignment(Assignment chemlab) {
            System.out.println(chemlab.getTitle());
            System.out.println(chemlab.getDescription());
            System.out.println(chemlab.getDescriptionLength());

        }

        
}

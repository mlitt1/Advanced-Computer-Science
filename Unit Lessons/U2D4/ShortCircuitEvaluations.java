public class ShortCircuitEvaluations {

    public static void main(String[] args) {

        String[] poop = {"Daniel the aura king", "Owen", "Justin","Morgan", null, null, null, null, "Boyan the sigma god"};
        
        int count = 0;
        for (int i = 0; i < poop.length; i++) {
            if (poop[i] != null && poop[i].length() > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}

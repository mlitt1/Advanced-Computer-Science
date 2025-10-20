public class Loops {
    
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }


        boolean isRunning = true;
        while (isRunning) {
            count++;
            if(count == 100) {
                isRunning = false;
            }
        }

        for (int count = 0; count2 < 10; count2++) {
            System.out.println();
        }
    }
}
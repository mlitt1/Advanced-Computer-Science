public class Cheetah {
    
    // instance variables

    private int speed;
    private double[] bestTimes = {45.6, 44.2, 43.8, 41.9};
    private String[] cheetahs = {"Matthew", "Morgan", "Owen"};
    
    // constructors

    public Cheetah(String[] cheetahs, int speed, double[] bestTimes) {
        this.speed = speed;
        this.bestTimes = bestTimes;
    }

    public Cheetah(String[] cheetahs, int speed) {
        this.cheetahs = cheetahs;
        this.speed = speed;
    }


    // getters

    public int getSpeed() {
        return speed;
    }

    public double[] getBestTimes() {
        return bestTimes;
    }
    
    // setters
    
    public void setSpeed(int speed) {
        for (int i = 0; i < cheetahs.length; i++) {
            this.speed = 10 * (cheetahs[i].length());
        }
    }
    
    public void setBestTimes(double[] bestTimes) {
        this.bestTimes = bestTimes;
    }

    // methods

    public double getBestTimes(double[] bestTimes) {
        double bestTime = 0;
        for (int i = 0; i < bestTimes.length; i++) {
            if (bestTimes[i + 1] > bestTimes[i]) {
                bestTime = bestTimes[i + 1];
            }
        }
        return bestTime;
    }

    public String fastestCheetah(String[] cheetahs) {
        String fastest = "";
        for (int i = 0; i < cheetahs.length; i++) {
            if (cheetahs[i + 1].length() * 10 > cheetahs[i].length() * 10) {
                fastest = cheetahs[i + 1];
            }
        }
        return fastest;
    }


}

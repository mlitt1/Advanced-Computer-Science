public class Skyview {

    // instance variables
    private double[][] view;

    // constructors
    public Skyview(int numberOfRows, int numberOfCols, double[] scanned) {
        if (numberOfRows <= 0 || numberOfCols <= 0)
            throw new IllegalArgumentException("Invalid number");
        view = new double[numberOfRows][numberOfCols];
        for (int i = 0; i < scanned.length; i++) {
            for (int j = 0; j < view.length; j++) {
                if (view.length <= scanned.length) {
                    view[i][j] = scanned[i];
                } else {
                    throw new IllegalArgumentException("View cannot be bigger than scanned");
                }
            }  
        }
    }

    // getters
    public double[][] getView() {
        return view;
    }

    // setters
    public void setView(double[][] view) {
        this.view = view;
    }

    
}
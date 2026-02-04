public class SkyView {

    // instance variables
    private double[][] view;

    // constructors
    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Invalid number");
        }
        if (scanned.length < numberOfRows * numberOfCols) {
            throw new IllegalArgumentException("View cannot be bigger than scanned");
        }     
        view = new double[numberOfRows][numberOfCols];
        int index = 0;
        for (int r = 0; r < numberOfRows; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < numberOfCols; c++) {
                    view[r][c] = scanned[index];
                    index++;
                }
            } else {
                for (int c = numberOfCols - 1; c >= 0; c--) {
                    view[r][c] = scanned[index];
                    index++;
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

    // methods

    public String toString() {
        String result = "";
        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view[i].length; j++) {
                result += view[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public boolean equals(SkyView other) {
        if (other == null) {
            return false;
        }
        if (view.length != other.view.length || view[0].length != other.view[0].length) {
            return false;
        }
        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view[i].length; j++) {
                if (view[i][j] != other.view[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0.0;
        int count = 0;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                sum += view[i][j];
                count++;
            }
        }
        return sum / count;
    }
}
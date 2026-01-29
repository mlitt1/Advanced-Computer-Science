public class MatrixFun {
    // instance variables
    private int[][] matrix;
    int numberOfRows;
    int numberOfCols;

    // constructors
    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows <= 0 || numberOfCols <= 0)
            throw new IllegalArgumentException("Invalid number");
        this.numberOfRows = numberOfRows;
        this.numberOfCols = numberOfCols;
        matrix = new int[numberOfRows][numberOfCols];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = (int)(Math.random() * 10);
    }

    public MatrixFun(int[][] starterMatrix) {
        if (starterMatrix == null || starterMatrix.length == 0)
            throw new IllegalArgumentException("matrix doesn't exist");
        matrix = starterMatrix;
        numberOfRows = matrix.length;
        numberOfCols = matrix[0].length;
    }

    public MatrixFun() {
        this(3,3);
    }

    // getters
    public int[][] getMatrix() {
        return matrix;
    }

    // setters
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // methods
    public String toString() {
        String output = "";
        int width = 0;

        if (matrix.length > 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                width += String.valueOf(matrix[0][j]).length() + 1;
            }
            width--;
        }

        output += "=".repeat(5); 
        output += "\n";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                output += matrix[i][j] + " ";
            } 
            output += "\n";
        }

        output += "=".repeat(5); 
        output += "\n";

        return output;
    }

    public boolean equals(MatrixFun other) {
        if (other == null) {
            return false;
        }
        return this.toString().equals(other.toString());
    }

    public boolean equals(int[][] other) {
        if (other == null || other.length != matrix.length) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (other[i].length != matrix[i].length) {
                return false;
            }
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] != other[i][j]) {
                    return false;
                }
        }
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] == oldValue) {
                    matrix[i][j] = newValue;
                }    
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 0 || rowB < 0 || rowA >= matrix.length || rowB >= matrix.length) {
            throw new IllegalArgumentException();
        } 
        int[] temp = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = temp;
    }
}

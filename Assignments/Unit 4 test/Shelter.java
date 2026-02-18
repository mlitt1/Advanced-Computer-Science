import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Invalid number");
        }
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Invalid.");
        }
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels.length; j++) {
                if (kennels[i][j] == null) {
                    kennels[i][j] = animal;
                    break;
                } else {
                    System.out.println("No empty kennels.");
                }
            }
        }
    }


    public void add(Dog animal, int row, int col) {
        if (animal == null || row <= 0 || col <= 0) {
            throw new IllegalArgumentException("Invalid.");
        }
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels.length; j++) {
                kennels[row][col] = animal;
            }
        }
    }

    public void add(ArrayList<Dog> animals) {
        if (animals == null) {
            throw new IllegalArgumentException("Invalid.");
        }
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels.length; j++) {
                if (kennels[i][j] == null) {
                    kennels[i][j] = animals.get(i);
                }
            }
        }
    }

    public Dog adopt(int row, int col) {
        if (row < 0 || col < 0) {
            throw new IllegalArgumentException("Invalid.");
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (kennels[i][j] != null) {
                    System.out.println(kennels[i][j]);
                    kennels[i][j] = null;
                } else if (kennels[i][j] == null) {
                    throw new IllegalArgumentException("Invalid.");
                }
            }
        }
        return new Dog();

    }

    public ArrayList<Dog> search(String name) {
        ArrayList<Dog> numbers = new ArrayList<Dog>();
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                Dog dog = kennels[i][j];
                if (dog != null && name != null && name.equals(dog.getName())) {
                    numbers.add(dog);
                }
            }
        }
        return numbers;
    }

    public ArrayList<Dog> search(int age) {
        ArrayList<Dog> numbers = new ArrayList<Dog>();
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                Dog newdog = kennels[i][j];
                if (age >= 0 && age == newdog.getAge()) {
                    numbers.add(newdog);
                }
            }
        }
        return numbers;

    }
}

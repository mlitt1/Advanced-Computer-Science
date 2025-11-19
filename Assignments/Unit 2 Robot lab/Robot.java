public class Robot {
    // to-do: change file name, class, and constructor to Robot

    // instance variables
    private int[] hallway = new int[4];
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right


    // constructors
    public Robot(int[] hallwayToClean, int startingPosition) {
        hallway = new int[hallwayToClean.length];

        for (int i = 0; i < hallwayToClean.length; i++) {
            hallway[i] = Math.max(0, hallwayToClean[i]); // replace negatives with 0
        }

        if (startingPosition < 0) {
            position = 0;
        } else if (startingPosition >= hallway.length) {
            position = hallway.length - 1;
        } else {
            position = startingPosition;
        }

        isFacingRight = true;
        // to-do: implement constructor
    }

    // getters and setters

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallway) {
        for (int i = 0; i < getHallway().length; i++) {
            hallway[i] = Math.max(0, hallway[i]); // replace negatives with 0
        }
        this.hallway = hallway;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        // if caller passed a valid index, use it
        if (position >= 0 && position < hallway.length) {
            this.position = position;
        }
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    // methods

    // duplicate field removed; use the private int[] hallway declared above


    public void displayState() {
        // print hallway
        for (int n : hallway) {
            System.out.print(n + " ");
        }
        System.out.println();

        // print robot position & direction
        for (int i = 0; i < position; i++) {
            System.out.print("  ");
        }
        System.out.println(isFacingRight ? ">" : "<");
    }

    public boolean isRobotBlockedByWall() {
        if (isFacingRight && position == hallway.length - 1) {
            return true;
        }
        if (!isFacingRight && position == 0) {
            return true;
        }
        return false;
    }


    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        // pick up item if present
        if (hallway[position] > 0) {
            hallway[position]--;
            if (hallway[position] > 0) {
                return;
            }
        }

        // move or turn
        if (!isRobotBlockedByWall()) {
            position += isFacingRight ? 1 : -1;
        } else {
            isFacingRight = !isFacingRight;
        }
    }

    /**
     * This method displays the current state of the robot and the hallway. It then calls the move()
     * method and counts the number of moves it takes to clear the hallway. The method should
     * display the current state of the robot after each move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        displayState();

        while (!hallIsClear()) {
            move();
            count++;
            displayState();
        }

        return count;
    }

    /**
    * This method determines if the hallway contains any items.
    * 
    * @return a boolean value indicating if the hallway contains any items
    */
    public boolean hallIsClear() {
        for (int v : hallway) {
            if (v > 0) {
                return false;
            }
        }
        return true;
    }

    /*
    * Displays the current state of the robot and the hallway.
    */

}

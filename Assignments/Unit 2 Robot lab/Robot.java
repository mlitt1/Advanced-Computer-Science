public class Robot {
    // to-do: change file name, class, and constructor to Robot

    // instance variables
    private int[] hallway = new int[4];
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right


    // constructors
    public Robot(int[] hallwayToClean, int startingPosition) {
        // to-do: implement constructor
    }

    // getters and setters

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public int[] getHallway() {
        hallway = new int[] {1, 2, 4, 5};
        return hallway;
    }

    public void setHallway(int[] hallway) {
        this.hallway = hallway;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        // if caller passed a valid index, use it
        if (position >= 0 && position < hallway.length) {
            this.position = position;
            return;
        }
        // otherwise treat the argument as a value and find its index in the hallway
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] == position) {
                this.position = i;
                return;
            }
        }
        // fallback: not found — default to 0 (or choose another sentinel as needed)
        this.position = 0;
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
        for (int i = 0; i < hallway.length; i++) {
            System.out.print(getHallway()[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < position; i++) {
            System.out.print("  ");
        }

        if (isFacingRight) {
            System.out.println(">");
        } else {
            System.out.println("<");
        }
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
        
        if (hallway == null || hallway.length == 0) {
            return;
        }
        if (position < 0 || position >= hallway.length) {
            return;
        }

        if (hallway[position] > 0) {
            hallway[position] = hallway[position] - 1;

            if (hallway[position] > 0) {
                return;
            }

        } else {

        }

        if (!isRobotBlockedByWall()) {
            // move forward
            if (isFacingRight) {
                position = position + 1;
            } else {
                position = position - 1;
            }
        } else {
            // blocked: reverse direction only
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
        // to-do: implement this method

        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        // to-do: implement this method

        return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */

}

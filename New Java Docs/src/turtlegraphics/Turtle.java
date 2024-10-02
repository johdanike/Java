package turtlegraphics;

import static turtlegraphics.Direction.*;

public class Turtle {
    private boolean penIsUp = true;
    private Direction currentDirection = EAST;

    public boolean penIsUp() {
        return penIsUp;
    }
    public boolean penIsDown() {
        return penIsUp = false;
    }
    public Direction getCurrentDirection() {
        return currentDirection;
    }
    public void turnRight() {
        if (currentDirection == SOUTH) currentDirection = WEST;
        else if(currentDirection == EAST) currentDirection = SOUTH;
        else if(currentDirection == WEST) currentDirection = NORTH;
        else if(currentDirection == NORTH) currentDirection = EAST;
    }

    public void turnLeft() {
        if (currentDirection == EAST) currentDirection = NORTH;
        else if(currentDirection == WEST) currentDirection = SOUTH;
        else if(currentDirection == SOUTH) currentDirection = EAST;
        else if(currentDirection == NORTH) currentDirection = WEST;
    }

    public Position getCurrentPosition() {
        return null;
    }

    public void moveForward(int move) {

    }
}

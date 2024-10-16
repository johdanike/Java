package turtlegraphics;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtlegraphics.Direction.*;

public class TurtleTest {
    Turtle turtle;
    @BeforeEach
    void setUp() {
        turtle = new Turtle();
    }
    @Test
    void testThatTurtle_IsInIts_DefaultState(){
        Turtle turtle = new Turtle();
        assertTrue(turtle.penIsUp());
    }
    @Test
    void testThatPen_Can_Move_Down(){
        boolean when = turtle.penIsUp();
        assertTrue(when);
        boolean given = turtle.penIsDown();
        assertFalse(given);
    }
    @Test
    void testThatPen_Can_TurnRight_WhenFacingEast(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void testThatPen_Can_TurnRight_WhenFacingSouth(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }
    @Test
    void testThatPen_Can_TurnLeft_WhenFacingEast(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void testThat_Turtle_CanMoveForward_WhenPenIsUp_AndFacing_East(){
        Position position;
        assertSame(EAST, turtle.getCurrentDirection());
//        assertEquals(new position(0,0), turtle.getCurrentPosition());
        turtle.moveForward(3);
//        assertEquals(new position(0,3), turtle.getCurrentPosition());
    }

}

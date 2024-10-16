package automaticbike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    private AutomaticBike automaticBike;
    private int speed;

    @BeforeEach
    public void startAllTestWithThis() {
        automaticBike = new AutomaticBike();
    }

    @Test
    public void bikeIsOff_iTurnItOn_itIsOn() {
//        @DisplayName("Test that bike is on, i turn it on and it is now on")
        assertFalse(automaticBike.getIsOn());
        automaticBike.turnOnBike();
        assertTrue(automaticBike.getIsOn());
    }

    @Test
    public void bikeIsOn_iTurnItOff_itIsOff() {
        assertFalse(automaticBike.getIsOn());
        automaticBike.turnOnBike();
        assertTrue(automaticBike.getIsOn());
        automaticBike.turnOffBike();
        assertFalse(automaticBike.getIsOn());
    }

    @Test
    public void bikeIsOn_andOnGear1_iAccel_speedIs15() {
        automaticBike.turnOffBike();
        assertFalse(automaticBike.getIsOn());
        automaticBike.turnOnBike();
        assertTrue(automaticBike.getIsOn());
        for(int index = 0; index < 15; index++) {
            automaticBike.setAccelerate();
        }
        assertEquals(15, automaticBike.getSpeed());
    }

    @Test
    public void bikeIsOn_andOnGear1_currentSpeedIs15_iAccelSpeedIs16() {
        automaticBike.turnOffBike();
        assertFalse(automaticBike.getIsOn());
        automaticBike.turnOnBike();
        assertTrue(automaticBike.getIsOn());
        for(int index = 0; index < 15; index++) {
            automaticBike.setAccelerate();
        }
        assertEquals(15, automaticBike.getSpeed());
        automaticBike.setAccelerate();
        assertEquals(16, automaticBike.getSpeed());
    }

    @Test
    public void bikeIsOn_andOnGear2_currentSpeedIs24_iAccelSpeedIs26() {
        automaticBike.turnOffBike();
        assertFalse(automaticBike.getIsOn());
        automaticBike.turnOnBike();
        assertTrue(automaticBike.getIsOn());
        for(int index = 0; index < 24; index++) {
            automaticBike.setAccelerate();
        }
        assertEquals(27, automaticBike.getSpeed());
    }

    @Test
    public void bikeIsOn_andOnGear3_currentSpeedIs35_iAccelSpeedIs38() {
        automaticBike.turnOffBike();
        assertFalse(automaticBike.getIsOn());
        automaticBike.turnOnBike();
        assertTrue(automaticBike.getIsOn());
        for(int index = 0; index < 35; index++) {
            automaticBike.setAccelerate();
        }
        assertEquals(38, automaticBike.getSpeed());

    }

//    @Test
//    public void bikeIsOn_andOnGear4_currentSpeedIs44_iAccelSpeedIs48() {
//        int on = 1;
//        int button = automaticBike.getPowerOn();
//        assertEquals(on, button);
//        int speedSet = automaticBike.setAccel(44);
//        assertEquals(44, speedSet);
//        int newSpeed = automaticBike.setAccel(48);
//        assertEquals(48, newSpeed);
//    }
//
//    @Test
//    public void bikeIsOn_andOnGear1_iDecelAndSpeedIs15_speedBecomes14() {
//        int on = 1;
//        int button = automaticBike.getPowerOn();
//        assertEquals(on, button);
//        int speedSet = automaticBike.setAccel(15);
//        assertEquals(15, speedSet);
//        int newSpeed = automaticBike.setDeccel(14);
//        assertEquals(14, newSpeed);
//    }
//
//    @Test
//    public void bikeIsOn_andOnGear2_iDecelAndSpeedIs24_speedBecomes22() {
//        int on = 1;
//        int button = automaticBike.getPowerOn();
//        assertEquals(on, button);
//        int speedSet = automaticBike.setAccel(24);
//        assertEquals(24, speedSet);
//        int newSpeed = automaticBike.setDeccel(22);
//        assertEquals(22, newSpeed);
//    }
//
//    @Test
//    public void bikeIsOn_andOnGear3_iDecelAndSpeedIs35_speedBecomes32() {
//        int on = 1;
//        int button = automaticBike.getPowerOn();
//        assertEquals(on, button);
//        int speedSet = automaticBike.setAccel(35);
//        assertEquals(35, speedSet);
//        int newSpeed = automaticBike.setDeccel(32);
//        assertEquals(32, newSpeed);
//    }
//
//    @Test
//    public void bikeIsOn_andOnGear4_iDecelAndSpeedIs44_speedBecomes40() {
//        int on = 1;
//        int button = automaticBike.getPowerOn();
//        assertEquals(on, button);
//        int speedSet = automaticBike.setAccel(44);
//        assertEquals(44, speedSet);
//        int newSpeed = automaticBike.setDeccel(42);
//        assertEquals(42, newSpeed);
//    }
//
//

}


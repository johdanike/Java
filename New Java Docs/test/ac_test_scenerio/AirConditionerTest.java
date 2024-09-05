package ac_test_scenerio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    private AirConditioner airConditioner;
    private final int on = 1;
    private final int off = 0;


    @BeforeEach
    public void startAllTestWithThis(){
        int temp = 0;
        airConditioner = new AirConditioner(temp);
    }

    @Test
    public void i_HaveAnAC_itIsOff_iTurnIt_onItIsOn() {
        int button = airConditioner.getOn(off);
        assertEquals(off, button);
        int valueIn = airConditioner.getOn(on);
        assertEquals(on, valueIn);
    }

    @Test
    public void i_HaveAnAC_itIsOn_iTurnItIsOff_itIsOff() {
        int button = airConditioner.getOn(on);
        assertEquals(on, button);
        int valueIn = airConditioner.getOff(off);
        assertEquals(0, valueIn);
    }

    @Test
    public void i_HaveAnAc_itIsOn_iIncreaseTemp_itIncreases() {
        int button = airConditioner.getOn(on);
        assertEquals(on, button);
        airConditioner.setTemp(25);
        int valueIn = airConditioner.getTemp();
        assertEquals(25, valueIn );
    }

    @Test
    public void i_HaveAnAc_itIsOn_iDecreaseTemp_itDecreases() {
        int button = airConditioner.getOn(on);
        assertEquals(on, button);
        int valueIn = airConditioner.getDecrease(16);
        assertEquals(16, valueIn);
    }

    @Test
    public void i_HaveAnAc_itIsOn_iIncreaseTempMoreThan30_tempIsStill30() {
        int button = airConditioner.getOn(on);
        assertEquals(on, button);
        airConditioner.setTemp(32);
        int valueIn = airConditioner.getTemp();
        assertEquals(30, valueIn);
    }

    @Test
    public void i_HaveAnAc_itIsOn_iDecreaseTempMoreThan16_tempIsStill16() {
        int button = airConditioner.getOn(on);
        assertEquals(on, button);
        int valueIn = airConditioner.getDecrease(12);
        assertEquals(16, valueIn);
    }




}

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ZonesTest {
    Zones zones;

    @Test
    public void testThatZonesClassExists() {
        Zones zones;
    }
    @Test
    public void testThatNorth_Central_States_return_Enum_Class_Returns_Zone() {
        String given = "Benue";
        zones = Zones.getZoneName(given);
        String expected = String.valueOf(Zones.NORTH_CENTRAL);
        assertEquals(zones.toString(), expected);
    }
    @Test
    public void testThatNorth_East_States_return_Enum_Class_Returns_Zone() {
        String given = "Gombe";
        zones = Zones.getZoneName(given);
        String expected = String.valueOf(Zones.NORTH_EAST);
        assertEquals(zones.toString(), expected);
    }
    @Test
    public void testThatSouth_East_States_return_Enum_Class_Returns_Zone() {
        String given = "Anambra";
        zones = Zones.getZoneName(given);
        String expected = String.valueOf(Zones.SOUTH_EAST);
        assertEquals(zones.toString(), expected);
    }
    @Test
    public void testThatSouth_West_States_return_Enum_Class_Returns_Zone() {
        String given = "Osun";
        zones = Zones.getZoneName(given);
        String expected = String.valueOf(Zones.SOUTH_WEST);
        assertEquals(zones.toString(), expected);
    }
    @Test
    public void testThatNorth_West_States_return_Enum_Class_Returns_Zone() {
        String given = "Katsina";
        zones = Zones.getZoneName(given);
        String expected = String.valueOf(Zones.NORTH_WEST);
        assertEquals(zones.toString(), expected);
    }
    @Test
    public void testThatSouth_South_States_return_Enum_Class_Returns_Zone() {
        String given = "Edo";
        zones = Zones.getZoneName(given);
        String expected = String.valueOf(Zones.SOUTH_SOUTH);
        assertEquals(zones.toString(), expected);
    }

}

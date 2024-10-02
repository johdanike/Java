import java.util.Arrays;

public enum Zones {
    NORTH_CENTRAL("BENUE", "NIGER", "KOGI", "KWARA", "PLATEAU", "NASSARAWA", "FCT"),
    NORTH_EAST("GOMBE", "BAUCHI", "YOBE", "BENUE", "ADAMAWA", "TARABA"),
    SOUTH_EAST("ABIA", "IMO", "EBONYI", "ANAMBRA", "ENUGU"),
    SOUTH_WEST("EKITI", "ONDO", "OSUN", "OYO", "OGUN", "LAGOS"),
    NORTH_WEST("JIGAWA", "KANO", "KATSINA", "KADUNA", "KEBBI", "ZAMFARA", "SOKOTO"),
    SOUTH_SOUTH("AKWAIBOM", "CROSSRIVERS", "BAYELSA", "RIVERS", "DELTA", "EDO");

    private final String [] states;


    Zones(String... states) {
        this.states = states;

    }
    d
    public String[] getStates() {
        return states;
    }

    public Zones getZone(String state) {
        return Zones.values()[ordinal()];
    }

    public String[] toString(String states) {
        return Zones.valueOf(states).getStates();
    }

    public static Zones getZoneName(String states) {
        Zones value = null;
        for (Zones zone : Zones.values()) {
            if(Arrays.asList(zone.getStates()).contains(states)) {
                value = zone;
                break;
            }
        }
        return value;
    }
}

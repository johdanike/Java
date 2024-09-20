public enum Zones {
    NORTH_CENTRAL("Benue, Niger, Kogi, Kwara, Plateau, Nassarawa, FCT"),
    NORTH_EAST("Gombe, Bauchi, Yobe, Benue, Adamawa, Taraba"),
    SOUTH_EAST("Abia, Imo, Ebonyi, Anambra, Enugu"),
    SOUTH_WEST("Ekiti, Ondo, Osun, Oyo, Ogun, Lagos."),
    NORTH_WEST(" Jigawa, Kano, Katsina, Kaduna, Kebbi, Zamfara, and Sokoto states"),
    SOUTH_SOUTH("Jigawa, Kano, Katsina, Kaduna, Kebbi, Zamfara, Sokoto");

    private final String states;


    Zones(String states) {
        this.states = states;
    }

}

package state;

public class GeoPoliticalZone {
    public enum States {
        NORTH_CENTRAL("Benue, Kogi, Kwara, Nasarawa, Niger, Plateau"),
        NORTH_EAST("borno, yobe, gombe, bauchi, adamawa, taraba"),
        NORTH_WEST("sokoto, kebbi, zamfara, kastina, kaduna, kano, jigawa"),
        SOUTH_WEST("ondo, osun, oyo, ekiti, lagos, ogun"),
        SOUTH_SOUTH("akwa ibom, bayelsa, cross river, delta, edo, rivers"),
        SOUTH_EAST("abia, anambra, ebonyi, enugu, imo");

        private final String description;

        States(String description) {
            this.description = description;
        }
        public String getDescription() {
            return description;
        }
        }


        public String northCentral() {
        States naija = States.NORTH_CENTRAL;
        return naija.getDescription();
        }

        public String northeast() {
        States naija = States.NORTH_EAST;
        return naija.getDescription();
        }

        public String northWest() {
        States naija = States.NORTH_WEST;
        return naija.getDescription();
        }

        public String southWest() {
        States naija = States.SOUTH_WEST;
        return naija.getDescription();
        }

        public String southSouth() {
        States naija = States.SOUTH_SOUTH;
        return naija.getDescription();
        }

        public String southEast() {
        States naija = States.SOUTH_EAST;
        return naija.getDescription();
        }


}



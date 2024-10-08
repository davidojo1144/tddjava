package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoliticalZoneTest {

    private GeoPoliticalZone politicalZone;
    @BeforeEach
    public void setUp() {
        politicalZone = new GeoPoliticalZone();
    }

    @Test
    public void testIfGeoPoliticalZoneExists() {
        assertNotNull(politicalZone);
    }


    @Test
    public void testIfNorthCentraIsActive() {
        assertEquals("Benue, Kogi, Kwara, Nasarawa, Niger, Plateau", politicalZone.northCentral());
    }

    @Test
    public void testIfNorthEastIsActive() {
        assertEquals("borno, yobe, gombe, bauchi, adamawa, taraba", politicalZone.northeast());
    }

    @Test
    public void testIfNorthWestIsActive() {
        assertEquals("sokoto, kebbi, zamfara, kastina, kaduna, kano, jigawa", politicalZone.northWest());
    }

    @Test
    public void testIfSouthWestIsActive() {
        assertEquals("ondo, osun, oyo, ekiti, lagos, ogun", politicalZone.southWest());
    }

    @Test
    public void testIfSouthSouthIsActive() {
        assertEquals("akwa ibom, bayelsa, cross river, delta, edo, rivers", politicalZone.southSouth());
    }

    @Test
    public void testIfSouthEastIsActive() {
        assertEquals("abia, anambra, ebonyi, enugu, imo", politicalZone.southEast());
    }

}

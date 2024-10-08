package bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test
    public void turningBikeOn() {
        Bike bike = new Bike();
        assertEquals("on", bike.getSwitchOn("on"));
    }

    @Test
    public void turningBikeOff() {
        Bike bike = new Bike();
        assertEquals("on", bike.getSwitchOn("on"));
        assertEquals("off", bike.getSwitchOn("off"));
    }

    @Test
    public void incrementOfGearOne() {
        Bike bike = new Bike();
        assertEquals("on", bike.getSwitchOn("on"));
        assertEquals(16, bike.gearing1(1));
    }

    @Test
    public void incrementOfGearTwo() {
        Bike bike = new Bike();
        assertEquals("on", bike.getSwitchOn("on"));
        assertEquals(26, bike.gearing2(2));
    }

    @Test
    public void incrementOfGearThree() {
        Bike bike = new Bike();
        assertEquals("on", bike.getSwitchOn("on"));
        assertEquals(38, bike.gearing3(3));
    }

    @Test
    public void incrementOfGearFour() {
        Bike bike = new Bike();
        assertEquals("on", bike.getSwitchOn("on"));
        assertEquals(48, bike.gearing4(4));
    }

    @Test
    public void decrementOfGearOne() {
        Bike bike = new Bike();
        assertEquals("on", bike.getSwitchOn("on"));
        assertEquals(14, bike.gearingDown1(1));
    }

    @Test
    public void decrementOfGearTwo() {
        Bike bike = new Bike();
        assertEquals("on", bike.getSwitchOn("on"));
        assertEquals(22, bike.gearingDown2(2));
    }

    @Test
    public void decrementOfGearFour() {
        Bike bike = new Bike();
        assertEquals("on", bike.getSwitchOn("on"));
        assertEquals(40, bike.gearingDown4(4));
    }

}



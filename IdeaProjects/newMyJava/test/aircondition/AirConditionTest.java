package aircondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {

    @Test
    public void testAirConditionWhenOn() {
        AirCondition airCondition = new AirCondition();
        assertEquals("on", airCondition.checkAircondition("on"));
    }

    @Test
    public void testAirConditionWhenOff() {
        AirCondition airCondition = new AirCondition();
        assertEquals("on", airCondition.checkAircondition("on"));
        assertEquals("off", airCondition.checkAircondition("off"));
        assertEquals("off", airCondition.checkAircondition("off"));
    }

    @Test
    public void testAirConditionIncrement() {
        AirCondition airCondition = new AirCondition();
        assertEquals(17, airCondition.increment(1));
    }

    @Test
    public void testAirConditionDecrement() {
        AirCondition airCondition = new AirCondition();
        assertEquals("on", airCondition.checkAircondition("on"));
        assertEquals(17, airCondition.increment(1));
        assertEquals(16, airCondition.decrement(1));
    }

    @Test
    public void testTemparatureBeyond30() {
        AirCondition airCondition = new AirCondition();
        assertEquals(17, airCondition.increase(1));
        assertEquals(18, airCondition.increase(1));
        assertEquals(19, airCondition.increase(1));
        assertEquals(20, airCondition.increase(1));
        assertEquals(21, airCondition.increase(1));
        assertEquals(22, airCondition.increase(1));
        assertEquals(23, airCondition.increase(1));
        assertEquals(24, airCondition.increase(1));
        assertEquals(25, airCondition.increase(1));
        assertEquals(26, airCondition.increase(1));
        assertEquals(27, airCondition.increase(1));
        assertEquals(28, airCondition.increase(1));
        assertEquals(29, airCondition.increase(1));
        assertEquals(30, airCondition.increase(1));
        assertEquals("off", airCondition.checkAircondition("off"));
    }

    @Test
    public void testTemparatureBelow16() {
        AirCondition airCondition = new AirCondition();
        assertEquals("on", airCondition.checkAircondition("on"));
        assertEquals(16, airCondition.decrease());
    }
}

package television;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionTest {


    @Test
    public void switchTelevisionOn() {
        Television television = new Television();
        assertEquals("on", television.switchOnTelevision("on"));
    }

    @Test
    public void switchTelevisionOff() {
        Television television = new Television();
        assertEquals("on", television.switchOnTelevision("on"));
        assertEquals("off", television.switchOnTelevision("off"));
    }

    @Test
    public void increasingTheVolume() {
        Television television = new Television();
        assertEquals("on", television.switchOnTelevision("on"));
        assertEquals(1, television.increasing(1));
        assertEquals(2, television.increasing(1));
        assertEquals(3, television.increasing(1));
        assertEquals(4, television.increasing(1));
        assertEquals(5, television.increasing(1));
        assertEquals(6, television.increasing(1));
        assertEquals(7, television.increasing(1));
        assertEquals(8, television.increasing(1));
        assertEquals(9, television.increasing(1));
        assertEquals(10, television.increasing(1));
    }

    @Test
    public void decreasingTheVolume() {
        Television television = new Television();
        assertEquals("on", television.switchOnTelevision("on"));
        assertEquals(1, television.increasing(9));
        assertEquals(2, television.increasing(8));
        assertEquals(3, television.increasing(7));
        assertEquals(4, television.increasing(6));
        assertEquals(5, television.increasing(5));
        assertEquals(6, television.increasing(4));
        assertEquals(7, television.increasing(3));
        assertEquals(8, television.increasing(2));
        assertEquals(9, television.increasing(1));

    }

    @Test
    public void channelChangeUpward(){
        Television television = new Television();
        assertEquals("on", television.switchOnTelevision("on"));
        assertEquals(1, television.changing(1));
        assertEquals(2, television.changing(1));
        assertEquals(3, television.changing(1));
        assertEquals(4, television.changing(1));
        assertEquals(5, television.changing(1));
    }

    @Test
    public void channelChangeDownward(){
        Television television = new Television();
        assertEquals("on", television.switchOnTelevision("on"));
        assertEquals(1, television.changing(4));
        assertEquals(2, television.changing(3));
        assertEquals(3, television.changing(2));
        assertEquals(4, television.changing(1));
        assertEquals("off", television.switchOnTelevision("off"));
    }
}

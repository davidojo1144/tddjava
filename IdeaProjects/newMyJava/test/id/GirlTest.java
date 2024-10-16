package id;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GirlTest {

    @Test
    public void testing() {
        YabaBoyFriend friend1 = new YabaBoyFriend();
        LekkiBoyFriend friend2 = new LekkiBoyFriend();
        MushinBoyFriend friend3 = new MushinBoyFriend();

        friend1.care();
        friend1.spend();

        friend2.care();
        friend2.spend();

        friend3.care();
        friend3.spend();

    }

}

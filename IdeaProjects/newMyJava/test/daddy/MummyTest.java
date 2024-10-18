package daddy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MummyTest {

    @Test
    public void TestingLove(){
            NewDaddy newDaddy = new NewDaddy();
            BabyDaddy babyDaddy = new BabyDaddy();

            newDaddy.care();
            babyDaddy.speak();

    }

    @Test
    public void TestingAnotherLove(){
        NewDaddy newDaddy = new NewDaddy();
        BabyDaddy babyDaddy = new BabyDaddy();

        newDaddy.speak();
        babyDaddy.care();
    }


}
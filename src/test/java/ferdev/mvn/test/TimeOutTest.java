package ferdev.mvn.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeOutTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void testTimeOut() throws InterruptedException {
        // Thread.sleep( 3_000); - > succes
        Thread.sleep(10_000); // not succes / error
    }
}

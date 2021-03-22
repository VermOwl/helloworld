package example;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HTest {

    @Test
    public void test(){
        if (1 == 2) {
            boolean a = true;
        } else {
            assertTrue(false);
        }
    }
}

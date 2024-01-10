import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.Romb;

public class RombTest {
    Romb romb;
    @BeforeTest
    public void setup() {
        this.romb = new Romb();
    }
    @Test
    public void testCalc() {
        double actual = this.romb.calcArea(15.0,45.0,135.0);
        double expected = 159.1;
    }
}

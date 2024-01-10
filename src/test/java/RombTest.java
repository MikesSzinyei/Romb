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
        double actual = this.romb.calcArea();
        
    }
}

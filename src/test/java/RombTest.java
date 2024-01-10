import org.testng.Assert;
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
    public void testCalcArea() {
        double actual = this.romb.calcArea(15.0,45.0,135.0);
        double expected = 159.1;
        Assert.assertEquals(actual, expected, 0.1, 
        "Hiba! Nem 159.1 lett a 15, 45 bemenete");
    }
    @Test
    public void testCalcCircumference() {
        double actual = this.romb.calcCircumference(15);
    }
}

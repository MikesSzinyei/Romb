import java.util.InputMismatchException;
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
        double actual = this.romb.calcArea(15.0,45.0);
        double expected = 159.1;
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test
    public void testCalcCircumference() {
        double actual = this.romb.calcCircumference(15);
        double expected = 60;
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCaclAreaZeroSide() {
        this.romb.calcArea(0, 45);
    }
    @Test(expectedExceptions = InputMismatchException.class, expectedExceptionsMessageRegExp = "Hiba!")
    public void testCaclAreaZeroA() {
        this.romb.calcArea(15, 0);
    }
    @Test(expectedExceptions = InputMismatchException.class, expectedExceptionsMessageRegExp = "Hiba!")
    public void testCaclCircumferenceZeroSide() {
        this.romb.calcCircumference(0);
    }

}

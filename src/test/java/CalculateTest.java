import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {

    Calculate calculate = new Calculate();

    @Test
    public void shouldSumTwoPositiveNumbers() {

        Assert.assertEquals(500, calculate.sumTwoNumbers(150, 350));
    }

    @Test
    public void shouldSumTwoNegativeNumbers() {

        Assert.assertEquals(-1300, calculate.sumTwoNumbers(-300, -1000));
    }

    @Test
    public void shouldSumOnePositiveAndOneNegativeNumbers() {

        Assert.assertEquals(-100, calculate.sumTwoNumbers(-200, 100));
    }

    @Test
    public void shouldSumOnePositiveNumberAndZero() {

        Assert.assertEquals(20, calculate.sumTwoNumbers(20, 0));
    }

    @Test
    public void shouldSumOneNegativeNumberAndZero() {

        Assert.assertEquals(-220, calculate.sumTwoNumbers(-220, 0));
    }

    @Test
    public void shouldSumZeroAndZero() {

        Assert.assertEquals(0, calculate.sumTwoNumbers(0, 0));
    }
}
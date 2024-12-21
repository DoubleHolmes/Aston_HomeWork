package org.example.lesson14_1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(Factorial.factorial(0), 1);
    }

    @Test
    public void testFactorialOfOne() {
        Assert.assertEquals(Factorial.factorial(1), 1);
    }

    @Test
    public void testFactorialOfFive() {
        Assert.assertEquals(Factorial.factorial(5), 120);
    }

    @Test
    public void testFactorialOfNegative() {
        Exception exception = Assert.expectThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-1);
        });
        Assert.assertEquals(exception.getMessage(), "Число должно быть неотрицательным");
    }

    @Test
    public void testFactorialOfTen() {
        Assert.assertEquals(Factorial.factorial(10), 3628800);
    }
}

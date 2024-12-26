package org.example.lesson14_2;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals(120, Factorial.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegative() {
        Factorial.factorial(-1);
    }

    @Test
    public void testFactorialOfTen() {
        assertEquals(3628800, Factorial.factorial(10));
    }
}
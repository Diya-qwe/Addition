
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {

    @Test
    public void testPositiveNumbers() {
        Addition obj = new Addition();
        assertEquals(30, obj.add(10, 20));
    }

    @Test
    public void testSmallNumbers() {
        Addition obj = new Addition();
        assertEquals(15, obj.add(5, 10));
    }

    @Test
    public void testZeroResult() {
        Addition obj = new Addition();
        assertEquals(0, obj.add(-5, 5));
    }

    @Test
    public void testNegativeNumbers() {
        Addition obj = new Addition();
        assertEquals(-10, obj.add(-4, -6));
    }

    @Test
    public void testLargeNumbers() {
        Addition obj = new Addition();
        assertEquals(100, obj.add(50, 50));
    }
}

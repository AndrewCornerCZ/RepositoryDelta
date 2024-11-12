package org.example.print;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.add(1, 2));
    }
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.sub(2, 1));
    }
    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.mul(2, 2));
    }
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.div(4, 2));
    }
}

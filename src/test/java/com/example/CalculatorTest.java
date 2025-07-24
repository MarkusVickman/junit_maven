package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testAddZero() {
        assertEquals(2, calc.add(2,0));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));

    }

    @Test
    public void testMultiply(){
        assertEquals(6, calc.multiply(2,3));
    }

    @Test
    public void testMultiplyByZero(){
        assertEquals(0, calc.multiply(0,3));
    }

}

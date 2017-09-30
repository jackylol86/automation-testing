package com.ecvictor.calculator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Created by ccao on 2017-08-12.
 */
public class CalculatorTest {
    @BeforeClass
    public void setUp() {
        System.out.println("Test starts: ...");
    }


    @Test
    public void add() throws Exception {
        Calculator.add(1, 2);
        assertEquals(3, Calculator.add(1, 2));
        assertEquals("1+2 should be 4.", 4, Calculator.add(1, 2));
        assertTrue(Calculator.add(1, 2) == 3);
    }

    @Test
    public void divide() throws Exception {
        Calculator calculator = new Calculator();
        assertNotEquals(3, calculator.divide(1, 2));
    }

//    @Test(expected = ArithmeticException.class)
//    public void divideByZero() throws Exception {
//        Calculator calculator = new Calculator();
//        assertNotEquals(3, calculator.divide(1, 0));
//    }

    @Test
    public void multiple() throws Exception {
        Calculator calculator = new Calculator();
        calculator.multiple(1, 0);
    }

    @AfterClass
    public void shutDown() {
        System.out.println("Test shut down.");
    }
}
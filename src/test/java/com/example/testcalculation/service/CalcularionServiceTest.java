package com.example.testcalculation.service;


import com.example.testcalculation.exceptions.DivisionByZeroExcepton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcularionServiceTest {

    CalcService calcService = new CalcService();

    @Test
    void plusPositive() {
        int acutal = calcService.plus(2, 6);
        assertEquals(8, acutal);
    }

    @Test
    void plusNegative() {
        int acutal = calcService.plus(-2, -6);
        assertEquals(-8, acutal);
    }

    @Test
    void minusPositive() {
        int acutal = calcService.minus(6, 2);
        assertEquals(4, acutal);
    }

    @Test
    void minusNegative() {
        int acutal = calcService.minus(2, -6);
        assertEquals(8, acutal);
    }

    @Test
    void multiplyPositive() {
        int acutal = calcService.multiply(6, 2);
        assertEquals(12, acutal);
    }

    @Test
    void multiplyNegative() {
        int acutal = calcService.multiply(2, -6);
        assertEquals(-12, acutal);
    }

    @Test
    void dividePositive() throws Exception {
        int acutal = calcService.divide(6, 2);
        assertEquals(3, acutal);
    }

    @Test
    void divideNegative() throws Exception {
        int acutal = calcService.divide(-6, 2);
        assertEquals(-3, acutal);
    }

    @Test
    void divisionByZero() {
        assertThrows(DivisionByZeroExcepton.class, () -> calcService.divide(8, 0));
    }
}

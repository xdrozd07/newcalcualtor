package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest
{
    private Calculator calculator;

    @BeforeEach
    void initCalculator(){
        calculator = new Calculator();
    }

    @Test
    void calculatorAddTest()
    {
        assertEquals(new BigDecimal("2.8"), calculator.add(new BigDecimal("1.5"), new BigDecimal("1.3")));
        assertEquals(new BigDecimal("7"), calculator.add(new BigDecimal("3"), new BigDecimal("4")));
    }

    @Test
    void calculatorMinusTest()
    {
        assertEquals(new BigDecimal("1.6"), calculator.minus(new BigDecimal("7.7"), new BigDecimal("6.1")));
        assertEquals(new BigDecimal("-2"), calculator.minus(new BigDecimal("6"), new BigDecimal("8")));
    }

    @Test
    void calculatorMultiplyTest()
    {
        assertEquals(new BigDecimal("28"), calculator.multiply(new BigDecimal("4"), new BigDecimal("7")));
        assertEquals(new BigDecimal("3.0"), calculator.multiply(new BigDecimal("2"), new BigDecimal("1.5")));

    }

    @Test
    void calculatorDivideTest()
    {
        assertEquals(new BigDecimal("4"), calculator.divide(new BigDecimal("28"), new BigDecimal("7")));
        assertEquals(new BigDecimal("1"), calculator.divide(new BigDecimal("4"), new BigDecimal("4")));
        assertEquals(new BigDecimal("6"), calculator.divide(new BigDecimal("34"), new BigDecimal("6")));
    }
}

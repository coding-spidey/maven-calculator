package com.ion.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CalculatorTest {
    @Mock
    private Validator tradingValidator;
    private Calculator calc;

    public CalculatorTest() {
        MockitoAnnotations.initMocks(this);
        calc = new Calculator(tradingValidator);
    }

    @Test
    public void testSum() {
        Mockito.when(tradingValidator.validate()).thenReturn(true);
        int num1 = 10;
        int num2 = 5;
        int result = calc.sum(num1, num2);
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        int num1 = 15;
        int num2 = 5;
        int result = calc.subtract(num1, num2);
        assertEquals(10, result);
    }
}

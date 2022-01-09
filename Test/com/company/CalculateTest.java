package com.company;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


    public class CalculateTest {

    Calculate calculate = new Calculate();

    @Test
    public void shouldSumTwoPositiveNumbers() {

        Assertions.assertEquals(500, calculate.sumTwoNumbers(150, 350));
    }

    @Test
    public void shouldSumTwoNegativeNumbers() {

        Assertions.assertEquals(-1300, calculate.sumTwoNumbers(-300, -1000));
    }

    @Test
    public void shouldSumOnePositiveAndOneNegativeNumbers() {

        Assertions.assertEquals(-100, calculate.sumTwoNumbers(-200, 100));
    }

    @Test
    public void shouldSumOnePositiveNumberAndZero() {

        Assertions.assertEquals(20, calculate.sumTwoNumbers(20, 0));
    }

    @Test
    public void shouldSumOneNegativeNumberAndZero() {

        Assertions.assertEquals(-220, calculate.sumTwoNumbers(-220, 0));
    }

    @Test
    public void shouldSumZeroAndZero() {

        Assertions.assertEquals(0, calculate.sumTwoNumbers(0, 0));
    }

}
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isSecondAndThirdElementOfFibSequenceOne() {
        assertEquals(1,Main.fib(2));
        assertEquals(1,Main.fib(3));
    }

    @Test
    void doesNegativeIndexAlwaysGiveMinusOne() {
        assertThrows(IllegalArgumentException.class,() -> Main.fib(-5));
    }

    @Test
    void doesFibRetunsZeroForOneAndZero(){
        assertEquals(0, Main.fib(0));
        assertEquals(0, Main.fib(1));
    }

    @Test
    void testExampleFactorials() {
        assertEquals(120, Main.factorial(5));
        assertEquals(720, Main.factorial(6) );
    }

    @Test
    void canPassNegativeNumberToFactorial() {
        assertThrows(IllegalArgumentException.class, () -> Main.factorial(-5));
        assertEquals(120, Main.factorial(5));
    }

    @Test
    void canPassZeroToCalculateFactorial(){
        assertEquals(1, Main.factorial(0));
    }

    @Test
    void testingExamplePowers(){
        assertEquals(8, Main.power(2,3));
        assertEquals(49, Main.power(7,2));
    }

    @Test
    void doesNumberRaisedToPowerZeroIsOne(){
        assertEquals(1, Main.power(2,0));
        assertEquals(1, Main.power(846,0));
    }

    @Test
    void
}
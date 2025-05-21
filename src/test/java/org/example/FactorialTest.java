package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest{
    private Factorial factorial;

    @BeforeEach
    void setup(){
        factorial = new Factorial();
    }

    @AfterEach
    void teardown(){
        factorial = null;
    }

    @Nested
    class TestCasesForValidFactorials {

        @Test
        void shouldFactorialOfZeroReturnOne() {
            int obtainedResult = factorial.compute(0);

            int expectedResult = 1;
            assertEquals(expectedResult, obtainedResult);
        }

        @Test
        void shouldFactorialOfOneReturnOne() {
            int obtainedResult = factorial.compute(1);

            int expectedResult = 1;
            assertEquals(expectedResult, obtainedResult);
        }

        @Test
        void shouldFactorialOfTwoReturnTwo() {
            int obtainedResult = factorial.compute(2);

            int expectedResult = 2;
            assertEquals(expectedResult, obtainedResult);
        }

        @Test
        void shouldFactorialOfThreeReturnSix() {
            int obtainedResult = factorial.compute(3);

            int expectedResult = 6;
            assertEquals(expectedResult, obtainedResult);
        }

    }

    @Nested
    @DisplayName("An exception is thrown when: ")
    class TestCasesForErrorManagement{

        @Test
        @DisplayName("The number is 13")
        void shouldFactorialOf13ThrowAnException() {
            assertThrows(ExceededValueException.class, () -> factorial.compute(13));
        }

        @Test
        void shouldFactorialOfMinusThrowAnException() {
            assertThrows(NegativeValueException.class, () -> factorial.compute(-1));
        }
    }
}
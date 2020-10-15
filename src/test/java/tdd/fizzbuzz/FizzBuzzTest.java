package tdd.fizzbuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    private int num;

    @BeforeEach
    public void setUp() { }

    @Test
    public void test_when_number_is_a_multiple_of_3() {
        num = 3;

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(FIZZ, fizzBuzz.sortOrderNumber(num));
    }

    @Test
    public void test_when_number_is_a_multiple_of_5() {
        num = 10;

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(BUZZ, fizzBuzz.sortOrderNumber(num));
    }

    @Test
    public void test_when_number_is_a_multiple_of_7() {
        num = 14;

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(WHIZZ, fizzBuzz.sortOrderNumber(num));
    }

    @Test
    public void test_when_number_is_a_multiple_of_3_and_5() {
        num = 15;

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(FIZZ+BUZZ, fizzBuzz.sortOrderNumber(num));
    }

    @Test
    public void test_when_number_is_a_multiple_of_3_and_7() {
        num = 21;

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(FIZZ+WHIZZ, fizzBuzz.sortOrderNumber(num));
    }

    @Test
    public void test_when_number_is_a_multiple_of_5_and_7() {
        num = 35;

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(BUZZ+WHIZZ, fizzBuzz.sortOrderNumber(num));
    }

    @Test
    public void test_when_number_is_a_multiple_of_3_5_and_7() {
        num = 105;

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(FIZZ+BUZZ+WHIZZ, fizzBuzz.sortOrderNumber(num));
    }



}

//multiple of 3 Fizz
package tdd.fizzbuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {
    private static final String FIZZ = "FIZZ";
    private int num;

    @BeforeEach
    public void setUp() { }

    @Test
    public void test_when_number_is_a_multiple_of_3() {
        num = 3;

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(FIZZ, fizzBuzz.getOrderNumber(num));
    }

    @Test
}

//multiple of 3 Fizz
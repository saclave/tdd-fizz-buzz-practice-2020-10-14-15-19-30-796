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

        //given
        num = 3;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();

        //then
        assertEquals(FIZZ, fizzBuzz.sortOrderNumber(num));
    }

    @Test
    public void test_when_number_is_a_multiple_of_5() {

        //given
        num = 10;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();

        //then
        assertEquals(BUZZ, fizzBuzz.sortOrderNumber(num));
    }

    @Test
    public void test_when_number_is_a_multiple_of_7() {

        //given
        num = 14;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();

        //then
        assertEquals(WHIZZ, fizzBuzz.sortOrderNumber(num));
    }

    @Test
    public void test_when_number_is_a_multiple_of_3_and_5() {

        //given
        num = 15;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();

        //then
        assertEquals(FIZZ+BUZZ, fizzBuzz.sortOrderNumber(num));
    }

    @Test
    public void test_when_number_is_a_multiple_of_3_and_7() {

        //given
        num = 21;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();

        //then
        assertEquals(FIZZ+WHIZZ, fizzBuzz.sortOrderNumber(num));
    }

    @Test
    public void test_when_number_is_a_multiple_of_5_and_7() {

        //given
        num = 35;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();

        //then
        assertEquals(BUZZ+WHIZZ, fizzBuzz.sortOrderNumber(num));
    }

    @Test
    public void test_when_number_is_a_multiple_of_3_5_and_7() {

        //given
        num = 105;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();

        //then
        assertEquals(FIZZ+BUZZ+WHIZZ, fizzBuzz.sortOrderNumber(num));
    }

    @Test
    public void test_when_number_is_not_a_multiple_of_3_5_and_7() {

        //given
        num = 1;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();

        //then
        assertEquals(String.valueOf(num), fizzBuzz.sortOrderNumber(num));
    }

}


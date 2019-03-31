package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzWhizzTest {
    FizzBuzzWhizz fizzBuzzWhizz;

    @BeforeEach
    void setUp() {
        fizzBuzzWhizz = new FizzBuzzWhizz();
    }

    @Test
    void should_return_input_number_when_input_is_not_a_special_number() {
        assertEquals("4", fizzBuzzWhizz.fizzBuzzWhizz(4));
    }

    @Test
    void should_return_fizz_when_input_is_multiple_of_three() {
        assertEquals("Fizz", fizzBuzzWhizz.fizzBuzzWhizz(3));
    }

    @Test
    void should_return_buzz_when_input_is_multiple_of_five() {
        assertEquals("Buzz", fizzBuzzWhizz.fizzBuzzWhizz(5));
    }

    @Test
    void should_return_whizz_when_input_is_multiple_of_seven() {
        assertEquals("Whizz", fizzBuzzWhizz.fizzBuzzWhizz(7));
    }

    @Test
    void should_return_fizzbuzz_when_input_is_multiple_of_three_and_five() {
        assertEquals("FizzBuzz", fizzBuzzWhizz.fizzBuzzWhizz(15));
    }

    @Test
    void should_return_fizzwhizz_when_input_is_multiple_of_three_and_seven() {
        assertEquals("FizzWhizz", fizzBuzzWhizz.fizzBuzzWhizz(21));
    }

    @Test
    void should_return_buzzwhizz_when_input_is_mutiple_of_five_and_seven() {
        assertEquals("BuzzWhizz", fizzBuzzWhizz.fizzBuzzWhizz(35));
    }

    @Test
    void should_return_fizzbuzzwhizz_when_input_is_multiple_of_three_and_five_and_sever() {
        assertEquals("FizzBuzzWhizz", fizzBuzzWhizz.fizzBuzzWhizz(105));
    }
}
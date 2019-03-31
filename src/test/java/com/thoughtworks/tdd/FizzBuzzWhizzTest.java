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
}
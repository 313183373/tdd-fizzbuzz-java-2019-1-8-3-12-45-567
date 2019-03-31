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
}
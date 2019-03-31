package com.thoughtworks.tdd;

public class FizzBuzzWhizz {
    public String fizzBuzzWhizz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}

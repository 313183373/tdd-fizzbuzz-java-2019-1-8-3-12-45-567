package com.thoughtworks.tdd;

public class FizzChecker implements Checker {
    @Override
    public boolean isValid(int number) {
        return number % 3 == 0;
    }

    @Override
    public String value() {
        return "Fizz";
    }
}

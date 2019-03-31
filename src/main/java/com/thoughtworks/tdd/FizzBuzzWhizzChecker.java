package com.thoughtworks.tdd;

public class FizzBuzzWhizzChecker implements Checker {
    @Override
    public boolean isValid(int number) {
        return number % 105 == 0;
    }

    @Override
    public String value() {
        return "FizzBuzzWhizz";
    }
}

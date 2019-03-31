package com.thoughtworks.tdd;

public class FizzBuzzChecker implements Checker {
    @Override
    public boolean isValid(int number) {
        return number % 15 == 0;
    }

    @Override
    public String value() {
        return "FizzBuzz";
    }
}

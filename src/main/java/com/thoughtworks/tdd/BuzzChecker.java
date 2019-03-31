package com.thoughtworks.tdd;

public class BuzzChecker implements Checker {
    @Override
    public boolean isValid(int number) {
        return number % 5 == 0;
    }

    @Override
    public String value() {
        return "Buzz";
    }
}

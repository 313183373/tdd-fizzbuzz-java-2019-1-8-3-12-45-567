package com.thoughtworks.tdd;

public class FizzWhizzChecker implements Checker {
    @Override
    public boolean isValid(int number) {
        return number % 21 == 0;
    }

    @Override
    public String value() {
        return "FizzWhizz";
    }
}

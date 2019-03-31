package com.thoughtworks.tdd;

public class BuzzWhizzChecker implements Checker {
    @Override
    public boolean isValid(int number) {
        return number % 35 == 0;
    }

    @Override
    public String value() {
        return "BuzzWhizz";
    }
}

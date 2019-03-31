package com.thoughtworks.tdd;

public class WhizzChecker implements Checker {
    @Override
    public boolean isValid(int number) {
        return number % 7 == 0;
    }

    @Override
    public String value() {
        return "Whizz";
    }
}

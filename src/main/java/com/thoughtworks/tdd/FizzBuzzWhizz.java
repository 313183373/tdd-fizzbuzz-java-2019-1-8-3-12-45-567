package com.thoughtworks.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class FizzBuzzWhizz {
    private ArrayList<Checker> checkers;

    FizzBuzzWhizz(Checker... checkers) {
        this.checkers = new ArrayList<>(Arrays.asList(checkers));
    }

    public String fizzBuzzWhizz(int number) {
        Optional<Checker> first = checkers.stream().filter(checker -> checker.isValid(number)).findFirst();
        if (first.isPresent()) {
            return first.get().value();
        } else {
            return String.valueOf(number);
        }
    }

    public static void main(String[] args) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz(new FizzBuzzWhizzChecker(), new FizzBuzzChecker(), new FizzWhizzChecker(), new BuzzWhizzChecker(), new FizzChecker(), new BuzzChecker(), new WhizzChecker());
        for (int i = 1; i <= 120; i++) {
            System.out.println(fizzBuzzWhizz.fizzBuzzWhizz(i));
        }
    }
}

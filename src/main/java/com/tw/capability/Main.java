package com.tw.capability;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            Optional<String> isContainer7 = Optional.ofNullable(FizzBuzz.transNumByContainerSeven(i));
            Optional<String> isContainer5 = Optional.ofNullable(isContainer7.orElse(FizzBuzz.transNumByContainerFive(i)));
            Optional<String> isContainer3 = Optional.ofNullable(isContainer5.orElse(FizzBuzz.transNumByContainerThree(i)));
            String result = isContainer3.orElse(FizzBuzz.transNumByDiv(i));
            System.out.println(result);
        }
    }

}

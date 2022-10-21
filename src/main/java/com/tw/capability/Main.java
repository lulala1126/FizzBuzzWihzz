package com.tw.capability;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            Optional<String> isContainer7 = FizzBuzz.transNumByContainerSeven(i);
            Optional<String> isContainer5 = isContainer7.isEmpty()?FizzBuzz.transNumByContainerFive(i):isContainer7;
            Optional<String> isContainer3 = isContainer5.isEmpty()?FizzBuzz.transNumByContainerThree(i):isContainer5;
            String result = isContainer3.orElse(FizzBuzz.transNumByDiv(i));
            System.out.println(result);
        }
    }
}

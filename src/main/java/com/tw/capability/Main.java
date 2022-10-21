package com.tw.capability;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            FizzBuzz result = Stream.of(new ContainerSeven(i),new ContainerFive(i),new ContainerThree(i))
                    .filter(FizzBuzz::match)
                    .findFirst().orElse(new NumCanDiv(i));
            System.out.println(result.trans());
        }
    }
}

package com.tw.capability;

import java.util.Optional;

public class FizzBuzz {

    public static Optional<String> transNumByContainerThree(int i){
        Optional<String> result = Optional.empty();
        if(Integer.toString(i).contains("3")){
            result = Optional.of("Fizz");
        }
        return result;
    }
    public static String transNumByDiv(int i) {
        StringBuilder result = new StringBuilder();
        if (i % 3 == 0) result.append("Fizz");
        if (i % 5 == 0) result.append("Buzz");
        if (i % 7 == 0) result.append("Whizz");
        if (result.length() == 0) result.append(i);
        return result.toString();
    }

    public static Optional<String> transNumByContainerFive(int inputNum) {
        Optional<String> result = Optional.empty();
        StringBuilder sb = new StringBuilder();
        if(Integer.toString(inputNum).contains("5")){
            sb.append("Buzz");
            if(inputNum % 7 == 0) sb.append("Whizz");
            result = Optional.of(sb.toString());
        }
        return result;
    }

    public static Optional<String> transNumByContainerSeven(int inputNum) {
        Optional<String> result = Optional.empty();
        if(Integer.toString(inputNum).contains("7")){
            if(inputNum % 3 == 0) result= Optional.of("Fizz");
        }
        return result;
    }
}

package com.tw.capability;

public class FizzBuzz {

    public static String transNumByContainerThree(int i){
        if(Integer.toString(i).contains("3")){
            return "Fizz";
        }
        return null;
    }
    public static String transNumByDiv(int i) {
        StringBuilder result = new StringBuilder();
        if (i % 3 == 0) result.append("Fizz");
        if (i % 5 == 0) result.append("Buzz");
        if (i % 7 == 0) result.append("Whizz");
        if (result.length() == 0) result.append(i);
        return result.toString();
    }

    public static String transNumByContainerFive(int inputNum) {
        StringBuilder sb = new StringBuilder();
        if(Integer.toString(inputNum).contains("5")){
            sb.append("Buzz");
            if(inputNum % 7 == 0) sb.append("Whizz");
            return sb.toString();
        }
        return null;
    }

    public static String transNumByContainerSeven(int inputNum) {
        if(Integer.toString(inputNum).contains("7")){
            if(inputNum % 3 == 0) return "Fizz";
        }
        return null;
    }
}

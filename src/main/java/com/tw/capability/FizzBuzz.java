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
}

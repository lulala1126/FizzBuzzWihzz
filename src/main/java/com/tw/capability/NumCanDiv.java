package com.tw.capability;

class NumCanDiv extends FizzBuzz{
    int num;
    public NumCanDiv(int num){
        this.num = num;
    }
    @Override
    boolean match() {
        return true;
    }

    @Override
    String trans() {
        StringBuilder result = new StringBuilder();
        if (num % 3 == 0) result.append("Fizz");
        if (num % 5 == 0) result.append("Buzz");
        if (num % 7 == 0) result.append("Whizz");
        if (result.length() == 0) result.append(num);
        return result.toString();
    }

}

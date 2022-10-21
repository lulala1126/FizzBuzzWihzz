package com.tw.capability;

class ContainerSeven extends FizzBuzz{
    int num;
    public ContainerSeven(int num){
        this.num = num;
    }
    @Override
    boolean match() {
        return Integer.toString(num).contains("7") && (num % 3 == 0);
    }

    @Override
    String trans() {
        return "Fizz";
    }
}

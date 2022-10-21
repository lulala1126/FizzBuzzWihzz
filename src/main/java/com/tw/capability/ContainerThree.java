package com.tw.capability;

class ContainerThree extends FizzBuzz{
    int num;
    public ContainerThree(int num){
        this.num = num;
    }
    @Override
    boolean match() {
        return Integer.toString(num).contains("3");
    }

    @Override
    String trans() {
        return "Fizz";
    }
}

package com.tw.capability;

class ContainerFive extends FizzBuzz{
    int num;
    public ContainerFive(int num){
        this.num = num;
    }
    @Override
    boolean match() {
        return Integer.toString(num).contains("5");
    }

    @Override
    String trans() {
        StringBuilder sb = new StringBuilder("Buzz");
        if(num % 7 == 0) sb.append("Whizz");
        return sb.toString();
    }
}

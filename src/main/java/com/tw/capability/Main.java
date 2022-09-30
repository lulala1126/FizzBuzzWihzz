package com.tw.capability;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            String result = FizzBuzz.transNumByDiv(i);
            System.out.println(result);
        }
    }

}

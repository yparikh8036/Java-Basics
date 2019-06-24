package com.yash;

import com.yash.util.Calculator;

public class Runner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addDouble(10.9, 10.10));
        System.out.println(calculator.add(10, 10));

    }
}

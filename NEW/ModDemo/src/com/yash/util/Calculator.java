package com.yash.util;

import com.yash.internal.AddHelper;

public class Calculator {

    AddHelper addHelper = new AddHelper();

    public int add(int i, int j) {
        return addHelper.add(i, j);
    }

    public int addDouble(double i, double j) {
        return (int) i + (int) j;
    }
}

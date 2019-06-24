package yash.util;


import yash.util.internal.AddHealper;

public class Calculator {

    AddHealper addHelper = new AddHealper();

    public int add(int i, int j) {
        return addHelper.add(i, j);
    }

    public int addDouble(double i, double j) {
        return (int) i + (int) j;
    }
}

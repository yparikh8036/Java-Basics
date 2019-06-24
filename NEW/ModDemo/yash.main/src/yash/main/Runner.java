package yash.main;

import yash.util.Calculator;
import yash.util.internal.AddHealper;

public class Runner {
    public static void main (String args[]){
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,1));

        AddHealper addHealper = new AddHealper();
    }
}

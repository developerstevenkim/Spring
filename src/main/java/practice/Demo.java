package practice;

import java.util.ArrayList;

abstract class Calculator {
    int left, right;
    String s;
    public void setOp(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public abstract void sum();
    public abstract void avg();
}

class CalculatorPlus extends Calculator {
    public void sum() {
        System.out.println("sum");
    }
    public void avg() {
        System.out.println("avg");
    }
}

public class Demo {
    public static void main(String[] args) {
        CalculatorPlus cp = new CalculatorPlus();
        cp.setOp(10, 20);
        System.out.println(cp.s);
    }
}

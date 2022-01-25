package com.upgrad.fsd;

public class ScientificCalculator extends  Calculator {

    public int absolute(int n) {
        if (n > 0) {
            return n;
        } else {
            return n * -1;
        }
    }

    public double absolute(double n) {
        if (n > 0.0) {
            return n;
        } else {
            return n * -1.0;
        }
    }

    public double log(int n, int base) {
        return Math.log10(n) / Math.log10(base);
    }

    public double log(double n, int base) {
        return Math.log10(n) / Math.log10(base);
    }

}

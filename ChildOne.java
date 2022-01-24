package com.upgrad.fsd;

public class ChildOne extends ParentOfMultiple {

    public void childMethod() {
        parentMethod();
        System.out.println("Hello from child 1!");
    }
}

package com.upgrad.fsd;

public class ChildTwo extends ParentOfMultiple {

    public void childMethod() {
        parentMethod();
        System.out.println("Hello from child 2!");
    }
}

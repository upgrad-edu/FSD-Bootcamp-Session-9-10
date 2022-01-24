package com.upgrad.fsd;

public class Child extends Parent {

    public int someVariable;

    public Child(int parentValue, int childValue) {
        super(parentValue);
        this.someVariable = childValue;
    }

    public void someMethod() {
        System.out.println("This is the child class method!");

        System.out.println("Parent variable - " + super.someVariable);
        System.out.println("Child variable - " + someVariable);

        super.someMethod();
    }
}

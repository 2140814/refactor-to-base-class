package com.github.hcsp.inheritance;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void wang() {
        System.out.print("汪");
        super.getName();
    }
}

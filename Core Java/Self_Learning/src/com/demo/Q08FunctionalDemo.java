package com.demo;

@FunctionalInterface
interface Greeting {
    void greet(String name);
}

public class Q08FunctionalDemo {
    public static void main(String[] args) {
        Greeting anon = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Hello (Anonymous): " + name);
            }
        };
        anon.greet("KG");

        Greeting lambda = (n) -> System.out.println("Hello (Lambda): " + n);
        lambda.greet("GK");
    }
}

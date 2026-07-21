package com.demo;

import java.lang.reflect.Method;

class Test {
    private void show() {
        System.out.println("Private method invoked");
    }
}

public class Q26ReflectionDemo {
    public static void main(String[] args) throws Exception {

        Test obj = new Test();

        Method m = Test.class.getDeclaredMethod("show");
        m.setAccessible(true);
        m.invoke(obj);
    }
}
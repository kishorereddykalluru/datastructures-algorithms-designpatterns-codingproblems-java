package javalearning.java8;

import java.lang.reflect.Method;

public class MethodReference {
    public static void saySomething(){
        System.out.println("Hello, this is static method");
    }

    public static void main(String[] args) {

        Sayable sayable = MethodReference::saySomething;

        sayable.say();
    }
}

interface Sayable{
    void say();
}

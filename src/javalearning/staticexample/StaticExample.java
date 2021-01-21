package javalearning.staticexample;

public class StaticExample {

    static{
        System.out.println("static block");
    }

    public StaticExample(){
        System.out.println("Constructor in static example");
    }

    public void m1(){
        System.out.println("Inside m1 method");
    }

}

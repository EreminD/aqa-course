package ru.inno.course.oop;

public class Calculator {

    public int sum(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public double div(int a, int b) throws ZeroDivideException{
        if (b == 0) {
            throw new ZeroDivideException();
        }
        return a/b;
    }

}

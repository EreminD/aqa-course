package ru.inno.course.oop;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 2;

        double result = 0;

        try {
            result = calculator.div(a, 0);
        } catch (ZeroDivideException ex){
            result = a;
        }



        System.out.println(result);


    }
}

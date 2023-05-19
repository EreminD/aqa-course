package ru.inno.course.oop;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.sum(2, 5);
        System.out.println(result);

        result = calculator.sub(2, 5);
        System.out.println(result);

    }
}
